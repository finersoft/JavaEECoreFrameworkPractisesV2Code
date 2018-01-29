package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class test1 {
	public static void main(String[] args) throws IOException, SQLException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		List<Userinfo> list = mapper.selectAll();
		for (int i = 0; i < list.size(); i++) {
			Userinfo userinfo = list.get(i);
			System.out.println(userinfo.getId() + " " + userinfo.getUsername());
		}
		session.commit();
		session.close();

		System.out.println("xxxxxx yyyyyy version!");
	}

}
