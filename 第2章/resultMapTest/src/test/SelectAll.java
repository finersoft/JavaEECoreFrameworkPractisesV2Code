package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.UserinfoABC;
import mapping.UserinfoMapper;

public class SelectAll {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		List<UserinfoABC> listUserinfo = mapper.selectAll();
		for (int i = 0; i < listUserinfo.size(); i++) {
			UserinfoABC userinfo = listUserinfo.get(i);
			System.out.println(userinfo.getIdABC() + " " + userinfo.getUsernameABC() + " " + userinfo.getPasswordABC()
					+ " " + userinfo.getAgeABC() + " " + userinfo.getInsertdateABC());
		}
		session.commit();
		session.close();
	}

}
