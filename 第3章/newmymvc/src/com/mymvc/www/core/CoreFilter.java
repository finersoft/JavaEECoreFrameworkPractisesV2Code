package com.mymvc.www.core;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoreFilter implements Filter {

	private Map<String, ActionMapping> actionMappingMap;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String configFile = filterConfig.getInitParameter("configFile");
		actionMappingMap = ActionMappingManager.processXML(configFile);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest requestRef = (HttpServletRequest) request;
		HttpServletResponse responseRef = (HttpServletResponse) response;

		String servletPath = requestRef.getServletPath();
		servletPath = servletPath.substring(1);
		servletPath = servletPath.substring(0, servletPath.indexOf("."));

		ActionMapping actionMapping = actionMappingMap.get(servletPath);
		if (actionMapping == null) {
			System.out.println("404 没有找到action mapping");
			responseRef.sendError(404, "404 没有找到action mapping");
		} else {
			String actionClass = actionMapping.getActionClass();
			IAction action = ActionManager.createAction(actionClass);
			String resultName = action.execute(requestRef, responseRef);

			ResultMapping resultMapping = actionMapping.getResultMappingMap().get(resultName);
			if (resultMapping == null) {
				System.out.println("500 没有找到result mapping");
			} else {
				if (resultMapping.isRedirectAction()) {
					responseRef.sendRedirect(resultMapping.getResultPath());
				} else {
					request.getRequestDispatcher(resultMapping.getResultPath()).forward(requestRef, responseRef);
				}
			}
		}

	}

	@Override
	public void destroy() {
	}

}
