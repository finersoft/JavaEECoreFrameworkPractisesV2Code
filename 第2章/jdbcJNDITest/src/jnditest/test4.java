package jnditest;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Context context = new InitialContext();
			String value = (String) context.lookup("username.password");
			context.close();
			System.out.println(value);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
