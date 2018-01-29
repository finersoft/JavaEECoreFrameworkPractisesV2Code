package com.mymvc.www.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IAction {
	public String execute(HttpServletRequest request, HttpServletResponse response);

}
