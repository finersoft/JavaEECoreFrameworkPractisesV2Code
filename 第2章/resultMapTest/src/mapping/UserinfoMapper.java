package mapping;

import java.util.List;

import entity.UserinfoABC;

public interface UserinfoMapper {
	public void insertUserinfo(UserinfoABC userinfo);

	public List<UserinfoABC> selectAll();

	public UserinfoABC selectById(long userId);

	public void deleteById(long userId);

	public void updateById(UserinfoABC userinfo);
}
