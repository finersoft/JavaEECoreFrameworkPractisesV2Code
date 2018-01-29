package controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadTest {

	private String username;
	private File[] uploadFile;
	private String[] uploadFileFileName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File[] getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File[] uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String[] getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String[] uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String execute() {
		try {
			System.out.println(username);
			String uploadPath = ServletActionContext.getRequest().getServletContext().getRealPath("/upload");
			SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
			for (int i = 0; i < uploadFile.length; i++) {
				String uploadFileName = format.format(new Date()) + "_" + System.currentTimeMillis() + "_"
						+ uploadFileFileName[i];
				File file = new File(uploadPath, uploadFileName);
				FileUtils.copyFile(uploadFile[i], file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
