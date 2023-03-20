package com.project.shoppingmall.service.Purchase;

import com.project.shoppingmall.dto.PurchaseDTO;
import com.project.shoppingmall.entity.purchase.Purchase;
import com.project.shoppingmall.repository.PurchaseRepository;
import com.project.shoppingmall.service.Purchase.impl.PurchaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseService implements PurchaseServiceImpl {
    private final PurchaseRepository purchaseRepository;
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

}
