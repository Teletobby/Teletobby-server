package com.project.shoppingmall.controller;

import com.project.shoppingmall.dto.group.GroupDTO;
import com.project.shoppingmall.entity.group.Groups;
import com.project.shoppingmall.service.Group.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @PostMapping("/group/save")
    public ResponseEntity<Groups> savePosts(@RequestBody GroupDTO groupDTO){
        Groups group = groupService.savePosts(groupDTO);
        return ResponseEntity.status(HttpStatus.OK).body(group);


    }
    @GetMapping("/group/post/{g_id}")
    public ResponseEntity<Groups> findPosts(@PathVariable("g_id") Integer g_id){
        Groups groupDTO = groupService.findPosts(g_id);
        return ResponseEntity.status(HttpStatus.OK).body(groupDTO);
    }


    @GetMapping("/group/list")
    public ResponseEntity<List<Groups>> findAllPosts(){
        List<Groups> groupDTO = groupService.findAllPosts();
        return ResponseEntity.status(HttpStatus.OK).body(groupDTO);
    }

    @PutMapping("/group/alter/{g_id}")
    public ResponseEntity<Groups> alterPosts(@RequestBody GroupDTO groupDTO,
                                             @PathVariable("g_id") Integer g_id){
        Groups groups = groupService.alterPosts(g_id, groupDTO);
        return ResponseEntity.status(HttpStatus.OK).body(groups);
    }

    @DeleteMapping("/group/delete/{g_id}")
    public ResponseEntity<String> deletePosts(@PathVariable("g_id") Integer g_id){
        groupService.deletePosts(g_id);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제 되었습니다.");
    }



}
