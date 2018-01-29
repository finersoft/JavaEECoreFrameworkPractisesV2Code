package service;

import java.util.Date;

import dto.PageEntity;
import extorm.UserinfoDAOExt;

public class UserinfoService {

	private UserinfoDAOExt userinfoDaoExt = new UserinfoDAOExt();

	public PageEntity getUserinfoPageData(String username, String password, long beginAge, long endAge, Date beginDate,
			Date endDate, int gotoPage) {
		PageEntity pageEntity = userinfoDaoExt.getUserinfoPageData(username, password, beginAge, endAge, beginDate,
				endDate, gotoPage, 4);
		return pageEntity;
	}

}
