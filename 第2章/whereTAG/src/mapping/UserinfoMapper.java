package mapping;

import java.util.List;
import java.util.Map;

import entity.Userinfo;

public interface UserinfoMapper {
	public List<Userinfo> selectAll(Map map);

	public List<Userinfo> selectAll2(Map map);

	public void updateUserinfoById(Map map);
}
