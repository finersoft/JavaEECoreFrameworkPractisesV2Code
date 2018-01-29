package test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;
import entity.Userinfo;

public class Insert1 {
	public static void main(String[] args) throws IOException {
		SqlSession session = DBTools.getSqlSession();
		session.insert("B.insertUserinfo");
		session.commit();
		session.close();
	}
}
