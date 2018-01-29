package mapping;

import java.util.List;
import java.util.Map;

import entity.Userinfo;

public interface UserinfoMapper {
	public void insertUserinfo(Userinfo userinfo);

	public List<Userinfo> selectAll();

	public Userinfo selectById(long userId);

	public List<Map> selectAllMap();

	public Map selectByIdMap(long userId);

	public void deleteById(long userId);

	public void updateById(Userinfo userinfo);
}
