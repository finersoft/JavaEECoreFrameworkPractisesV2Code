package test;

import java.io.IOException;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import mapping.UserinfoMapper;

public class SelectByIdMap {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		Map map = mapper.selectByIdMap(4L);
		System.out.println(map.get("id") + " " + map.get("USERNAME") + " " + map.get("PASSWORD") + " " + map.get("AGE")
				+ " " + map.get("INSERTDATE"));
		session.commit();
		session.close();
	}

}
