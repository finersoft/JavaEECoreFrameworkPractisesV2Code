package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

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

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String uploadPath = request.getSession().getServletContext().getRealPath("/upload");

		Map<String, MultipartFile> fileMap = request.getFileMap();
		Iterator<String> iterator = fileMap.keySet().iterator();
		while (iterator.hasNext()) {
			String eachInputName = iterator.next();
			MultipartFile eachFile = fileMap.get(eachInputName);

			String eachFileName = eachFile.getOriginalFilename();
			InputStream eachFileStream = eachFile.getInputStream();

			String dateString = format.format(new Date());
			dateString = dateString + "_" + System.currentTimeMillis() + "_" + eachFileName;

			File destination = new File(uploadPath, dateString);
			FileUtils.copyInputStreamToFile(eachFileStream, destination);

		}

		return "index.jsp";
	}
}
