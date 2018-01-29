package mapping;

import java.util.List;
import java.util.Map;

import entity.Userinfo;

public interface UserinfoMapper {
	public List<Userinfo> selectAll1(String username);

	public List<Userinfo> selectAll2(Userinfo userinfo);

	public List<Userinfo> selectAll3(Userinfo userinfo);

	public List<Userinfo> selectAll4(Userinfo userinfo);

	public List<Userinfo> selectAll5(Userinfo userinfo);

	public List<Userinfo> selectAll6(Map map);
}
