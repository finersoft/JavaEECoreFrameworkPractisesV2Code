package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

public class DownloadFile {

	private String fileName = "";

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String execute() throws IOException {
		String downPath = ServletActionContext.getRequest().getServletContext().getRealPath("/");
		fileName = fileName.replace("_", "%");
		fileName = java.net.URLDecoder.decode(fileName, "utf-8");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		String downfileName = "";
		if (request.getHeader("USER-AGENT").toLowerCase().indexOf("msie") > 0) {// IE
			fileName = URLEncoder.encode(fileName, "UTF-8");
			downfileName = fileName.replace("+", "%20");// 处理空格变“+”的问题
		} else {// FF
			downfileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		}
		System.out.println(downPath + fileName);
		File downloadFile = new File(downPath + fileName);
		response.setContentType("application/octet-stream;");
		response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", downfileName)); // 文件名外的双引号处理firefox的空格截断问题
		response.setHeader("Content-Length", String.valueOf(downloadFile.length()));
		FileInputStream fis = new FileInputStream(downloadFile);
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(fis, out);
		return null;
	}

}
