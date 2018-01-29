package controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadTest {

	private String username;
	private File uploadFile;
	private String uploadFileFileName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String execute() {
		try {
			System.out.println(username);
			String uploadPath = ServletActionContext.getRequest().getServletContext().getRealPath("/upload");
			File file = new File(uploadPath, uploadFileFileName);
			FileUtils.copyFile(uploadFile, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
