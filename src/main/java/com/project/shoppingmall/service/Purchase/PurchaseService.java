package com.project.shoppingmall.service.Purchase;

import com.project.shoppingmall.dto.EnrollDTO;
import com.project.shoppingmall.dto.purchase.PurchaseDTO;
import com.project.shoppingmall.entity.purchase.EnrollPurchase;
import com.project.shoppingmall.entity.purchase.Purchase;
import com.project.shoppingmall.repository.Purchase.EnrollPurchaseRepository;
import com.project.shoppingmall.repository.Purchase.PurchaseRepository;
import com.project.shoppingmall.service.Purchase.impl.PurchaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseService implements PurchaseServiceImpl {
    private final PurchaseRepository purchaseRepository;
    private final EnrollPurchaseRepository enrollRepository;
    @Override
    public Purchase savePost(PurchaseDTO purchaseDTO) {
        Purchase purchase = new Purchase();
        purchase.setP_writer(purchaseDTO.getP_writer());
        purchase.setP_price(purchaseDTO.getP_price());
        purchase.setP_name(purchaseDTO.getP_name());
        purchase.setP_phone(purchaseDTO.getP_phone());
        Purchase savePurchase = purchaseRepository.save(purchase);
        return savePurchase;
    }

    @Override
    public Purchase findPost(Integer p_id) {
        Purchase purchase = purchaseRepository.findById(p_id).get();
        return purchase;
    }

    @Override
    public List<Purchase> findAllPost() {
        List<Purchase> purchase = (List<Purchase>) purchaseRepository.findAll();
        return purchase;
    }

    @Override
    public void deletePost(Integer p_id) {
        purchaseRepository.deleteById(p_id);
    }

    @Override
    public Purchase alterPost(Integer p_id, PurchaseDTO purchaseDTO) {
        Purchase purchase = purchaseRepository.findById(p_id).get();
        purchase.setP_name(purchaseDTO.getP_name());
        purchase.setP_price(purchaseDTO.getP_price());
        purchase.setP_phone(purchaseDTO.getP_phone());
        purchase.setP_writer(purchaseDTO.getP_writer());
        purchaseRepository.save(purchase);
        return purchase;
    }

    public EnrollPurchase saveEnroll(EnrollDTO enrollDTO, Integer p_id) {
        EnrollPurchase enroll = new EnrollPurchase();
        enroll.setE_name(enrollDTO.getE_name());
        enroll.setE_phone(enrollDTO.getE_phone());
        EnrollPurchase enrollPurchase = enrollRepository.save(enroll);
        return enrollPurchase;
    }

    @Override
    public List<EnrollPurchase> findEnroll() {
        List<EnrollPurchase> enrollPurchase = (List<EnrollPurchase>) enrollRepository.findAll();
        return enrollPurchase;
    }
}
