package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class SelectAll2 {

	public static void main(String[] args) throws IOException {

		String gotoPage = "1";
		int gotoPageInt = 1;
		try {
			gotoPageInt = Integer.parseInt(gotoPage);
			if (gotoPageInt <= 0) {
				gotoPageInt = 1;
			}
		} catch (NumberFormatException e) {
			gotoPageInt = 1;
		}
		int pageSize = 2;
		int beginPosition = (gotoPageInt - 1) * pageSize;

		SqlSession session = GetSqlSession.getSqlSession();
		List<Userinfo> listUserinfo = session.selectList("selectAll", null, new RowBounds(beginPosition, pageSize));
		for (int i = 0; i < listUserinfo.size(); i++) {
			Userinfo userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername() + " " + userinfo.getPassword() + " "
					+ userinfo.getAge() + " " + userinfo.getInsertdate());
		}
		session.commit();
		session.close();
	}

}
