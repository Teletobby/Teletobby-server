package com.project.shoppingmall.controller;

import com.project.shoppingmall.service.Group.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

}
