package test;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import mapping.BigTextMapper;

public class SelectById2 {
	public static void main(String[] args) throws IOException, SQLException {
		SqlSession session = GetSqlSession.getSqlSession();
		BigTextMapper mapper = session.getMapper(BigTextMapper.class);
		Map map = mapper.selectById2();
		oracle.sql.CLOB clobRef = (oracle.sql.CLOB) map.get("BIGTEXT");
		Reader reader = clobRef.getCharacterStream();
		char[] charArray = new char[10000];
		int readLength = reader.read(charArray);
		while (readLength != -1) {
			String newString = new String(charArray, 0, readLength);
			System.out.println(newString);
			readLength = reader.read(charArray);
		}
		reader.close();
		session.close();
	}

}
