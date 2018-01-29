package mapping;

import java.util.List;

import entity.Userinfo;

public interface UserinfoMapper {
	public void insertUserinfo(Userinfo userinfo);

	public void insertUserinfoNew(Userinfo userinfo);
	
	public void insertUserinfoIf(Userinfo userinfo);
}
