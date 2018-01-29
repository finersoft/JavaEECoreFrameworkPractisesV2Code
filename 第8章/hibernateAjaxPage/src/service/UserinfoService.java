package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.PageEntity;
import dto.UserinfoDTO;
import extorm.UserinfoDAOExt;
import orm.Userinfo;

public class UserinfoService {

	private UserinfoDAOExt userinfoDaoExt = new UserinfoDAOExt();

	public PageEntity getUserinfoPageData(String username, String password, long beginAge, long endAge, Date beginDate,
			Date endDate, int gotoPage) {
		PageEntity pageEntity = userinfoDaoExt.getUserinfoPageData(username, password, beginAge, endAge, beginDate,
				endDate, gotoPage, 4);

		List<Userinfo> listUserinfo = pageEntity.getPageDataList();
		List<UserinfoDTO> listUserinfoDTO = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);

			UserinfoDTO dto = new UserinfoDTO();
			dto.setId("" + userinfo.getId());
			dto.setUsername(userinfo.getUsername());
			dto.setPassword(userinfo.getPassword());
			dto.setAge("" + userinfo.getAge());
			if (userinfo.getInsertdate() != null) {
				dto.setInsertdate(format.format(userinfo.getInsertdate()));
			}
			listUserinfoDTO.add(dto);
		}

		pageEntity.setPageDataList(listUserinfoDTO);

		return pageEntity;
	}

}
