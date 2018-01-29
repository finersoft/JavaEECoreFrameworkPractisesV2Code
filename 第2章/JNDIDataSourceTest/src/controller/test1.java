package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class test1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Userinfo userinfo1 = new Userinfo();
		userinfo1.setUsername("�й�1");
		userinfo1.setPassword("�й���1");
		userinfo1.setAge(100L);
		userinfo1.setInsertdate(new Date());

		Userinfo userinfo2 = new Userinfo();
		userinfo2.setUsername("�й�2");
		userinfo2.setPassword("�й���2");
		userinfo2.setAge(100L);
		userinfo2.setInsertdate(new Date());

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.insertUserinfo(userinfo1);
		mapper.insertUserinfo(userinfo2);
		// �˰���û���ύ
		// session.commit();
		session.close();
	}

}
