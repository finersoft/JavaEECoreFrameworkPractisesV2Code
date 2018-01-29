package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dbtools.DBOperate;
import dbtools.GetSqlSession;

public class SelectById {
	public static void main(String[] args) throws IOException {
		try {
			Map queryMap = new HashMap();
			queryMap.put("userId", 2142500L);

			DBOperate dbo = new DBOperate();
			List<Map> listMap = dbo.select("selectById", queryMap);
			for (int i = 0; i < listMap.size(); i++) {
				Map map = listMap.get(i);
				System.out.println(map.get("ID") + " " + map.get("USERNAME") + " " + map.get("PASSWORD") + " "
						+ map.get("AGE") + " " + map.get("INSERTDATE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			GetSqlSession.rollback();
		} finally {
			GetSqlSession.commit();
		}
	}
}
