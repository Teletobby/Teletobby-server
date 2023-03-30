package com.project.shoppingmall.service.Borrow.impl;

import com.project.shoppingmall.dto.BorrowDTO;
import com.project.shoppingmall.entity.borrow.Borrow;

import java.util.List;

public interface BorrowServiceImpl {
    Borrow savePosts(BorrowDTO borrowDto);

    List<Borrow> findAllPosts();
    Borrow findPosts(Integer b_id);

    void deletePosts(Integer b_id);

    Borrow alterPosts(Integer b_id, BorrowDTO borrowDto);
}
