package com.project.shoppingmall.controller;

import com.project.shoppingmall.dto.BorrowDTO;
import com.project.shoppingmall.entity.borrow.Borrow;
import com.project.shoppingmall.service.Borrow.BorrowService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class BorrowController {
    private final BorrowService borrowService;

    @PostMapping("/borrow/save")
    public ResponseEntity<Borrow> savePosts(@RequestBody BorrowDTO borrowDto){
        Borrow borrow = borrowService.savePosts(borrowDto);
        return ResponseEntity.status(HttpStatus.OK).body(borrow);
    }

    @GetMapping("/borrow/post/{b_id}")
    public ResponseEntity<Borrow> findPosts(@PathVariable("b_id") Integer b_id){
        Borrow borrow = borrowService.findPosts(b_id);
        return ResponseEntity.status(HttpStatus.OK).body(borrow);
    }

    @GetMapping("/borrow/list")
    public ResponseEntity<Borrow> findAllPosts(){
        List<Borrow> borrows = borrowService.findAllPosts();
        return (ResponseEntity<Borrow>) borrows;
    }

    @DeleteMapping("/borrow/delete/{b_id}")
    public ResponseEntity<String> deletePosts(@PathVariable("b_id") Integer b_id){
        borrowService.deletePosts(b_id);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제 되었습니다.");
    }

    @PutMapping("/borrow/alter/{b_id}")
    public ResponseEntity<Borrow> alterPosts(@PathVariable("b_id") Integer b_id, BorrowDTO borrowDTO){
        Borrow borrow = borrowService.alterPosts(b_id, borrowDTO);
        return ResponseEntity.status(HttpStatus.OK).body(borrow);
    }

}
