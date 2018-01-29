package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mymvc.www.core.IAction;

public class ListUserinfo implements IAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List list = new ArrayList();
		list.add("�й�1");
		list.add("�й�2");
		list.add("�й�3");
		list.add("�й�4");
		list.add("�й�5");

		request.setAttribute("list", list);

		return "toListUserinfoJSP";
	}

}
