package com.project.shoppingmall.service.purchase.impl;

import com.project.shoppingmall.controller.dto.EnrollDTO;
import com.project.shoppingmall.controller.dto.purchase.PurchaseDTO;
import com.project.shoppingmall.entity.purchase.EnrollPurchase;
import com.project.shoppingmall.entity.purchase.Purchase;

import java.util.List;

public interface PurchaseServiceImpl {
    Purchase savePost(PurchaseDTO purchaseDTO);

    Purchase findPost(Integer p_id);

    List<Purchase> findAllPost();
    void deletePost(Integer p_id);

    Purchase alterPost(Integer p_id, PurchaseDTO purchaseDTO);

    List<EnrollPurchase> findEnroll();

    EnrollPurchase alterEnroll(Integer p_id, EnrollDTO enrollDTO);

}
