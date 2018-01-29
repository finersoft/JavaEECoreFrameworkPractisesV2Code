package controller;

import tools.FileUploadTools;

public class UploadTest {

	private FileUploadTools tools = new FileUploadTools();

	public FileUploadTools getTools() {
		return tools;
	}

	public void setTools(FileUploadTools tools) {
		this.tools = tools;
	}

	public String execute() {
		tools.beginUpload();
		return null;
	}

}
