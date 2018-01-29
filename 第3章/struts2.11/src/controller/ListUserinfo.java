package controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class ListUserinfo {
	public String execute() {
		ActionContext.getContext().put("requestKey1", "requestValue1");
		Map map = (Map) ActionContext.getContext().get("request");
		map.put("requestKey2", "requestValue2");

		ActionContext.getContext().getSession().put("sessionKey", "sessionValue");
		ActionContext.getContext().getApplication().put("applicationKey", "applicationValue");

		return "toListUserinfoJSP";
	}
}
