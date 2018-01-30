package test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import dbtools.DBOperate;
import dbtools.GetSqlSession;

public class Insert1 {
	public static void main(String[] args) throws IOException {
		try {
			Map map = new HashMap();
			map.put("username", "�й�");
			map.put("password", "�й���");
			map.put("age", 333L);
			map.put("insertdate", new Date());

			DBOperate dbo = new DBOperate();
			dbo.save("insertUserinfo", map);
			System.out.println("����ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			GetSqlSession.rollback();
		} finally {
			GetSqlSession.commit();
		}
	}
}
