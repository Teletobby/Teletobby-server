package com.project.shoppingmall.controller;

import com.project.shoppingmall.dto.EnrollDTO;
import com.project.shoppingmall.dto.purchase.PurchaseDTO;
import com.project.shoppingmall.entity.borrow.EnrollBorrow;
import com.project.shoppingmall.entity.purchase.EnrollPurchase;
import com.project.shoppingmall.entity.purchase.Purchase;
import com.project.shoppingmall.service.Purchase.PurchaseService;
import lombok.AllArgsConstructor;
import org.apache.catalina.webresources.EmptyResource;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class PurchaseController {
    private final PurchaseService purchaseService;

    // 구매 게시글 저장
    @PostMapping("/purchase/save")
    public ResponseEntity<Purchase> savePurchase(@RequestBody PurchaseDTO purchaseDTO){
        Purchase savedPurchase = purchaseService.savePost(purchaseDTO);
        return ResponseEntity.status(HttpStatus.OK).body(savedPurchase);
    }

    // 구매 해당 게시글 보기
    @GetMapping("/purchase/post/{p_id}")
    public ResponseEntity<Purchase> findPurchase(@PathVariable("p_id") Integer p_id){
        Purchase purchase = purchaseService.findPost(p_id);
        return ResponseEntity.status(HttpStatus.OK).body(purchase);
    }

    // 구매 전체 게시글 보여주기
    @GetMapping("/purchase/list")
    public ResponseEntity<List<Purchase>> findAllPurchase(){
        List<Purchase> purchase = purchaseService.findAllPost();
        return ResponseEntity.status(HttpStatus.OK).body(purchase);
    }

    // 구매 게시글 수정하기
    @PutMapping("/purchase/alter/{p_id}")
    public ResponseEntity<Purchase> alterPurchase(@PathVariable("p_id") Integer p_id, @RequestBody PurchaseDTO purchaseDTO) {
        Purchase purchase = purchaseService.alterPost(p_id, purchaseDTO);
        return ResponseEntity.status(HttpStatus.OK).body(purchase);
    }

    // 구매 해당 게시글 삭제
    @DeleteMapping("/purchase/delete/{p_id}")
    public ResponseEntity<String> deletePurchase(@PathVariable("p_id") Integer p_id) {
        purchaseService.deletePost(p_id);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제 되었습니다");
    }


    // 구매 신청하기
    @PostMapping("/purchase/post/{p_id}")
    public ResponseEntity<String> enrollPurchase(@PathVariable("p_id") Purchase p_id, @RequestBody EnrollDTO enrollDTO){
        purchaseService.saveEnroll(enrollDTO, p_id);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 등록되었습니다");
    }

    // 구매 신청 리스트
    @GetMapping("/purchase/enroll/list")
    public ResponseEntity<List<EnrollPurchase>> findEnrollPurchase(){
        List<EnrollPurchase> enrollList = purchaseService.findEnroll();
        return ResponseEntity.status(HttpStatus.OK).body(enrollList);
    }

    // 구매 신청 수정하기
    @PutMapping("/purchase/enroll/alter/{p_id}")
    public ResponseEntity<EnrollPurchase> alterEnroll(@PathVariable("p_id") Integer p_id, @RequestBody EnrollDTO enrollDTO){
        EnrollPurchase enrollPurchase = purchaseService.alterEnroll(p_id, enrollDTO);
        return ResponseEntity.status(HttpStatus.OK).body(enrollPurchase);
    }

}
