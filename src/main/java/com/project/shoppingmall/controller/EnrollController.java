package com.project.shoppingmall.controller;

import com.project.shoppingmall.dto.EnrollDTO;
import com.project.shoppingmall.entity.purchase.EnrollPurchase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EnrollController {


//    // 구매 신청 리스트
//    @GetMapping("/purchase/enroll/list")
//    public ResponseEntity<List<EnrollPurchase>> findEnrollPurchase(){
//        List<EnrollPurchase> enrollList = purchaseService.findEnroll();
//        return ResponseEntity.status(HttpStatus.OK).body(enrollList);
//    }
//
//    // 구매 신청 수정하기
//    @PutMapping("/purchase/enroll/alter/{p_id}")
//    public ResponseEntity<EnrollPurchase> alterEnroll(@PathVariable("p_id") Integer p_id, @RequestBody EnrollDTO enrollDTO){
//        EnrollPurchase enrollPurchase = purchaseService.alterEnroll(p_id, enrollDTO);
//        return ResponseEntity.status(HttpStatus.OK).body(enrollPurchase);
////    }
}
