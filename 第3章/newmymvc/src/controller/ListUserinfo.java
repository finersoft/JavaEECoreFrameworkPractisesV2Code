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
		list.add("中国1");
		list.add("中国2");
		list.add("中国3");
		list.add("中国4");
		list.add("中国5");

		request.setAttribute("list", list);

		return "toListUserinfoJSP";
	}

}
