package com.project.shoppingmall.repository.group;

import com.project.shoppingmall.entity.group.Groups;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<Groups, Integer> {
}
