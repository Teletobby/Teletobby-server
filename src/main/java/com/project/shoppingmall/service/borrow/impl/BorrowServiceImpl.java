package com.project.shoppingmall.service.borrow.impl;

import com.project.shoppingmall.controller.dto.EnrollDTO;
import com.project.shoppingmall.controller.dto.borrow.BorrowDTO;
import com.project.shoppingmall.entity.borrow.Borrow;
import com.project.shoppingmall.entity.borrow.EnrollBorrow;

import java.util.List;

public interface BorrowServiceImpl {
    Borrow savePosts(BorrowDTO borrowDto);

    List<Borrow> findAllPosts();
    Borrow findPosts(Integer b_id);

    void deletePosts(Integer b_id);

    Borrow alterPosts(Integer b_id, BorrowDTO borrowDto);

    EnrollBorrow saveEnroll(EnrollDTO enrollDTO, Borrow e_id);
    List<EnrollBorrow> findEnroll();
    EnrollBorrow alterEnroll(Integer p_id, EnrollDTO enrollDTO);
}
