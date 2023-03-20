package com.project.shoppingmall.repository;

import com.project.shoppingmall.entity.borrow.Borrow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Integer> {

}
