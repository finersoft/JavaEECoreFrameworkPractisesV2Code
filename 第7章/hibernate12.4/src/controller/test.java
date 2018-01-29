package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orm.Userinfo;
import orm.UserinfoDAO;

public class test extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserinfoDAO dao = new UserinfoDAO();
		dao.getSession().beginTransaction().begin();

		Userinfo userinfo = dao.findById(2222497L);
		System.out.println(userinfo.getId() + " " + userinfo.getUsername());

		dao.getSession().getTransaction().commit();
		dao.getSession().close();

	}

}
