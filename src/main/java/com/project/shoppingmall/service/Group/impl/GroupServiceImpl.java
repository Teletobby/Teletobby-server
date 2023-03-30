package com.project.shoppingmall.service.Group.impl;

import com.project.shoppingmall.dto.GroupDTO;
import com.project.shoppingmall.entity.group.Groups;

import java.util.List;

public interface GroupServiceImpl {
    Groups savePosts(GroupDTO groupDTO);
    Groups findPosts(Integer g_id);
    List<Groups> findAllPosts();

    Groups alterPosts(Integer g_id, GroupDTO groupDTO );
    void deletePosts(Integer g_id);

}
