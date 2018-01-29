package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UserinfoController {
	@RequestMapping(value = "upload")
	public String loginMethod(@RequestParam String username, @RequestParam MultipartFile uploadFile,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("username=" + username);

		String uploadFileName = uploadFile.getOriginalFilename();
		System.out.println("原始文件名：" + uploadFileName);

		InputStream fileStream = uploadFile.getInputStream();

		String uploadPath = request.getSession().getServletContext().getRealPath("/upload");

		File destination = new File(uploadPath, uploadFileName);
		FileUtils.copyInputStreamToFile(fileStream, destination);

		return "index.jsp";
	}
}
