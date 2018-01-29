package controller;

import java.io.IOException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ListString {
	private String jsonString;

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public String execute() throws IOException {
		System.out.println(jsonString);

		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		JSONArray myArray = jsonObject.getJSONArray("myArray");
		JSONObject jsonObject1 = myArray.getJSONObject(0);
		System.out.println(jsonObject1.getString("username1"));
		JSONObject jsonObject2 = myArray.getJSONObject(1);
		System.out.println(jsonObject2.getString("username2"));
		JSONArray JSONArray1 = myArray.getJSONArray(2);
		System.out.println(JSONArray1.get(0));
		System.out.println(JSONArray1.get(1));
		System.out.println(JSONArray1.get(2));
		JSONArray JSONArray2 = JSONArray1.getJSONArray(3);
		System.out.println(JSONArray2.get(0));
		System.out.println(JSONArray2.get(1));

		System.out.println(jsonObject.getJSONObject("myObject").getString("username"));

		System.out.println(
				jsonObject.getJSONObject("myObject1").getJSONArray("address").getJSONObject(0).getString("name"));
		System.out.println(
				jsonObject.getJSONObject("myObject1").getJSONArray("address").getJSONObject(1).getString("name"));

		return null;
	}

}
