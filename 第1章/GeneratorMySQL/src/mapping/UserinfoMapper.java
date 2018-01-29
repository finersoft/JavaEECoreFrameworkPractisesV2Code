package mapping;

import java.util.List;
import mapping.Userinfo;
import mapping.UserinfoExample;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    long countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    Userinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Fri Jan 26 20:24:40 CST 2018
     */
    int updateByPrimaryKey(Userinfo record);
}