package test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import mapping.UserinfoMapper;

public class SelectAllMap {

	public static void main(String[] args) throws IOException {
		SqlSession session = GetSqlSession.getSqlSession();
		UserinfoMapper mapper = session.getMapper(UserinfoMapper.class);
		List<Map> listUserinfo = mapper.selectAllMap();
		for (int i = 0; i < listUserinfo.size(); i++) {
			Map map = listUserinfo.get(i);
			System.out.println(map.get("id") + " " + map.get("USERNAME") + " " + map.get("PASSWORD") + " "
					+ map.get("AGE") + " " + map.get("INSERTDATE"));
		}
		session.commit();
		session.close();
	}

}
