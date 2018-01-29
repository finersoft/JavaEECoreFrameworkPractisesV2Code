package test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import dbtools.DBOperate;
import dbtools.GetSqlSession;

public class SelectAll {
	public static void main(String[] args) throws IOException {
		try {
			DBOperate dbo = new DBOperate();
			List<Map> listMap = dbo.select("selectAll", null);
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
