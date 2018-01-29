package mapping;

import java.util.List;
import java.util.Map;

import entity.Userinfo;

public interface UserinfoMapper {
	public List<Userinfo> selectAllOracle(Map map);

	public List<Userinfo> selectAllMYSQL(Map map);
}
