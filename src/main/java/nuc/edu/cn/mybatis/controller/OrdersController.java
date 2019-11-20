package nuc.edu.cn.mybatis.controller;

import nuc.edu.cn.mybatis.mapper.OrderMapper;
import nuc.edu.cn.mybatis.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    @Autowired
    OrderMapper orderMapper;
    @RequestMapping("findorderbyid/{id}")
    public Orders findOrderById(@PathVariable("id") Integer id){
        System.out.println("查询订单信息！");
        return  orderMapper.findOrderById(id);
    }
    @RequestMapping("insert")
    public Orders insertOder(Orders orders){
    	System.out.println("插入被调用");
        orderMapper.insertOrder(orders);
        return  orders;
    }
}
