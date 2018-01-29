package mapping;

import java.util.List;
import java.util.Map;

import entity.Userinfo;
import queryentity.QueryEntity;

public interface UserinfoMapper {
	public List<Userinfo> selectAll1(List list);

	public List<Userinfo> selectAll2(QueryEntity entity);

	public List<Userinfo> selectAll3(Map map);

	public List<Userinfo> selectAll4(Map map);
}
