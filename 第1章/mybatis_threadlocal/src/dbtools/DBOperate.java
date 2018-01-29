package dbtools;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DBOperate {

	public void save(String sqlId, Map map) throws IOException {
		GetSqlSession.getSqlSession().insert(sqlId, map);
	}

	public void delete(String sqlId, Map map) throws IOException {
		GetSqlSession.getSqlSession().delete(sqlId, map);
	}

	public void update(String sqlId, Map map) throws IOException {
		GetSqlSession.getSqlSession().update(sqlId, map);
	}

	public List select(String sqlId, Map map) throws IOException {
		return GetSqlSession.getSqlSession().selectList(sqlId, map);
	}

}
