package mapping;

import java.util.Map;

import entity.BigText;

public interface BigTextMapper {
	public void insertUserinfo(BigText userinfo);

	public BigText selectById1();

	public Map selectById2();
}
