package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UserinfoController {
	@RequestMapping(value = "upload")
	public String loginMethod(MultipartHttpServletRequest request) throws IOException {
		String username = request.getParameter("username");
		System.out.println("username=" + username);

		MultipartFile file = request.getFile("uploadFile");
		String uploadFileName = file.getOriginalFilename();
		System.out.println("原始文件名：" + uploadFileName);

		InputStream fileStream = file.getInputStream();

		String uploadPath = request.getSession().getServletContext().getRealPath("/upload");

		File destination = new File(uploadPath, uploadFileName);
		FileUtils.copyInputStreamToFile(fileStream, destination);

		return "index.jsp";
	}
}
