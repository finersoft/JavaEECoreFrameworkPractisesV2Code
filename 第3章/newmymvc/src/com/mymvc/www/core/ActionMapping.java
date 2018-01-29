package com.mymvc.www.core;

import java.util.HashMap;
import java.util.Map;

public class ActionMapping {

	private String actionName;
	private String actionClass;
	private Map<String, ResultMapping> resultMappingMap = new HashMap<>();

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionClass() {
		return actionClass;
	}

	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}

	public Map<String, ResultMapping> getResultMappingMap() {
		return resultMappingMap;
	}

	public void setResultMappingMap(Map<String, ResultMapping> resultMappingMap) {
		this.resultMappingMap = resultMappingMap;
	}

}
