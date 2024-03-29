package com.example.demo1.converter;

import com.example.demo1.dataobject.OrderMaster;
import com.example.demo1.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMasterToOrderDTO {

    public static OrderDTO converter(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> converter(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e -> converter(e)).collect(Collectors.toList());
    }
}
