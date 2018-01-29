package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dbtools.DBOperate;
import dbtools.GetSqlSession;

public class DeleteById {
	public static void main(String[] args) throws IOException {
		try {
			Map queryMap = new HashMap();
			queryMap.put("userId", 2142500L);

			DBOperate dbo = new DBOperate();
			dbo.delete("deleteById", queryMap);
		} catch (Exception e) {
			e.printStackTrace();
			GetSqlSession.rollback();
		} finally {
			GetSqlSession.commit();
		}
	}
}
