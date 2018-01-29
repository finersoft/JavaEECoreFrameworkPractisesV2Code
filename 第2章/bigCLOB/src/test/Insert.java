package test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.BigText;
import mapping.BigTextMapper;

public class Insert {

	public static void main(String[] args) throws IOException {

		SqlSession session = GetSqlSession.getSqlSession();
		BigTextMapper mapper = session.getMapper(BigTextMapper.class);
		BigText bigtext = mapper.selectById1();
		mapper.insertUserinfo(bigtext);
		session.commit();
		session.close();

	}

}
