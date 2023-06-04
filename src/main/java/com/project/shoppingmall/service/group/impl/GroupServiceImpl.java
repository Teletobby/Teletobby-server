package com.project.shoppingmall.service.group.impl;

import com.project.shoppingmall.controller.dto.EnrollDTO;
import com.project.shoppingmall.controller.dto.group.GroupDTO;
import com.project.shoppingmall.entity.group.EnrollGroups;
import com.project.shoppingmall.entity.group.Groups;

import java.util.List;

public interface GroupServiceImpl {
    Groups savePosts(GroupDTO groupDTO);
    Groups findPosts(Integer g_id);
    List<Groups> findAllPosts();
    Groups alterPosts(Integer g_id, GroupDTO groupDTO );
    void deletePosts(Integer g_id);
    EnrollGroups saveEnroll(EnrollDTO enrollDTO, Groups g_id);
    List<EnrollGroups> findEnroll();
    EnrollGroups alterEnroll(Integer p_id, EnrollDTO enrollDTO);
}
