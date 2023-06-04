package com.project.shoppingmall.repository.purchase;

import com.project.shoppingmall.entity.purchase.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {

}
