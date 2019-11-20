package nuc.edu.cn.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import nuc.edu.cn.mybatis.pojo.Orders;
@Mapper
public interface OrderMapper {
	
	public Orders findOrderById(Integer id);
	//插入数据中包含日期型数据，用么用@initbinder,本例在config包中设置全局日期转换DateConfig
	public void insertOrder(Orders orders);

}
