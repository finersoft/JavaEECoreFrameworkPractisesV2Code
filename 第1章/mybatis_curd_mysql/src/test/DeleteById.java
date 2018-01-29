package test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import dbtools.DBTools;

public class DeleteById {
	public static void main(String[] args) throws IOException {
		SqlSession session = DBTools.getSqlSession();
		session.delete("deleteById", 31L);
		session.commit();
		session.close();
	}
}
