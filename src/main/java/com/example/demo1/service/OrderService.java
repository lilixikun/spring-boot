package com.example.demo1.service;


import com.example.demo1.dto.OrderDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;


public interface OrderService {


    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO creat(OrderDTO orderDTO);


    /**
     * 查询订单详情
     * @param orderId
     * @return
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询用户订单列表
     * @param buyer
     * @param pageable
     * @return
     */
    Page<OrderDTO> findOrderList(String buyer, Pageable pageable);


    /**
     * 取消订单
     * @param orderDTO
     * @return
     */
    OrderDTO cancelOrder(OrderDTO orderDTO);

    /**
     * 完结订单
     * @param orderDTO
     * @return
     */
    OrderDTO finishOrder(OrderDTO orderDTO);

    /**
     * 订单支付
     * @param orderDTO
     * @return
     */
    OrderDTO payOrder(OrderDTO orderDTO);
}