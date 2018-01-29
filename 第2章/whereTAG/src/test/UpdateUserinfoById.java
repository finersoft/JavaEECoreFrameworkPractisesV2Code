package test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import mapping.UserinfoMapper;

public class UpdateUserinfoById {

	public static void main(String[] args) throws IOException {
		Map map1 = new HashMap();
		map1.put("id", 2182498L);
		map1.put("username", "xxxxx");
		map1.put("password", null);
		map1.put("age", 999);
		map1.put("insertdate", new Date());

		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		mapper.updateUserinfoById(map1);
		session.commit();
		session.close();
	}

}
