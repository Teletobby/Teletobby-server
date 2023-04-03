package com.project.shoppingmall.service.Purchase.impl;

import com.project.shoppingmall.dto.EnrollDTO;
import com.project.shoppingmall.dto.purchase.PurchaseDTO;
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
}
