package controller;

import net.sf.json.JSONObject;

public class Test {

	private String jsonString;

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public String execute() {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		System.out.println(jsonObject.get("username"));
		System.out.println(jsonObject.get("password"));
		System.out.println(jsonObject.get("bigtext"));
		System.out.println(jsonObject.get("age"));
		return null;
	}

}
