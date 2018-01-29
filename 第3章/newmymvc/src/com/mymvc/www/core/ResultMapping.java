package com.mymvc.www.core;

public class ResultMapping {

	private String resultName;
	private String resultPath;
	private boolean isRedirectAction;

	public String getResultName() {
		return resultName;
	}

	public void setResultName(String resultName) {
		this.resultName = resultName;
	}

	public String getResultPath() {
		return resultPath;
	}

	public void setResultPath(String resultPath) {
		this.resultPath = resultPath;
	}

	public boolean isRedirectAction() {
		return isRedirectAction;
	}

	public void setRedirectAction(boolean isRedirectAction) {
		this.isRedirectAction = isRedirectAction;
	}

}
