package com.example.demo1.service;

import com.example.demo1.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {

    /**
     * 查询在售商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 查询商品详情
     * @param productId
     * @return
     */
    ProductInfo findById(String productId);
    //加库存

    //减库存
}
