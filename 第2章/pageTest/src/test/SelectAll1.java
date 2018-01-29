package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dbtools.GetSqlSession;
import entity.Userinfo;
import mapping.UserinfoMapper;

public class SelectAll1 {

	public static void main(String[] args) throws IOException {
		String gotoPage = "4";
		int gotoPageInt = 1;
		try {
			gotoPageInt = Integer.parseInt(gotoPage);
			if (gotoPageInt <= 0) {
				gotoPageInt = 1;
			}
		} catch (NumberFormatException e) {
			gotoPageInt = 1;
		}
		System.out.println(gotoPageInt);
	}

}
