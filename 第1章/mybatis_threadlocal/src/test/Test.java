package test;

import java.io.IOException;

import dbtools.GetSqlSession;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println(GetSqlSession.getSqlSession().hashCode());
		System.out.println(GetSqlSession.getSqlSession().hashCode());
		System.out.println(GetSqlSession.getSqlSession().hashCode());
		System.out.println(GetSqlSession.getSqlSession().hashCode());
		System.out.println(GetSqlSession.getSqlSession().hashCode());
		System.out.println(GetSqlSession.getSqlSession().hashCode());
		System.out.println(GetSqlSession.getSqlSession().hashCode());
	}
}
