package test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import dbtools.DBOperate;
import dbtools.GetSqlSession;

public class Insert2 {
	public static void main(String[] args) throws IOException {
		try {
			Map map1 = new HashMap();
			map1.put("username", "中国");
			map1.put("password", "中国人");
			map1.put("age", 333L);
			map1.put("insertdate", new Date());

			Map map2 = new HashMap();
			map2.put("username", "中国");
			map2.put("password",
					"中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人");
			map2.put("age", 333L);
			map2.put("insertdate", new Date());

			DBOperate dbo = new DBOperate();
			dbo.save("insertUserinfo", map1);
			dbo.save("insertUserinfo", map2);

		} catch (Exception e) {
			e.printStackTrace();
			GetSqlSession.rollback();
		} finally {
			GetSqlSession.commit();
		}
	}
}
