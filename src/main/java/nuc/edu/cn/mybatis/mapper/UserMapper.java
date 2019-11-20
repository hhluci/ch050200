package nuc.edu.cn.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import nuc.edu.cn.mybatis.pojo.User;
@Mapper
public interface UserMapper {
	//测试驼峰表示法，如果User表中的username属性修改为user_name，则此查询无法找到user_name的值，因为默认使用username
    //解决方法：创建MyBatisConfig类
    @Select("select * from user where id=#{id}")
    public User findUserById(Integer id);
    @Delete("delete from user where id=#{id}")
    public int deleteUserById(Integer id);
    //Options()解决自增主键回显问题
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user(user_name,birthday,sex,address) values(#{user_name},#{birthday},#{sex},#{address})")
    public int insertUser(User user);
    @Update("update user set userName=#{user_name},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    //@Update("update user set user_name=#{userName},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    public int updateUser(User user);

}
