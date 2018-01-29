package test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dbtools.DBOperate;
import dbtools.GetSqlSession;

public class UpdateById {
	public static void main(String[] args) throws IOException {
		try {
			Map queryMap = new HashMap();
			queryMap.put("userId", 2142499L);

			DBOperate dbo = new DBOperate();
			List<Map> listMap = dbo.select("selectById", queryMap);
			if (listMap.size() == 1) {
				Map findMap = listMap.get(0);
				findMap.put("username", "xxxx");
				findMap.put("password", "xxxxxxxxxxxxxx");
				findMap.put("age", 999999L);
				findMap.put("insertdate", new Date());
				findMap.put("id", findMap.get("ID"));

				dbo.update("updateById", findMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
			GetSqlSession.rollback();
		} finally {
			GetSqlSession.commit();
		}
	}
}
