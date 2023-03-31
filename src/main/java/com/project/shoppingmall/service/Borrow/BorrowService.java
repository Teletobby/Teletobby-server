package com.project.shoppingmall.service.Borrow;

import com.project.shoppingmall.dto.borrow.BorrowDTO;
import com.project.shoppingmall.entity.borrow.Borrow;
import com.project.shoppingmall.repository.BorrowRepository;
import com.project.shoppingmall.service.Borrow.impl.BorrowServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BorrowService implements BorrowServiceImpl {

    private final BorrowRepository borrowRepository;

    @Override
    public Borrow savePosts(BorrowDTO borrowDto) {
        Borrow borrow = new Borrow();

        borrow.setB_name(borrowDto.getB_name());
        borrow.setB_period(borrowDto.getB_period());
        borrow.setB_price(borrowDto.getB_price());
        borrow.setB_writer(borrowDto.getB_writer());

        Borrow borrows = borrowRepository.save(borrow);
        return borrows;
    }

    @Override
    public List<Borrow> findAllPosts() {
        List<Borrow> borrows = (List<Borrow>) borrowRepository.findAll();
        return borrows;
    }

    @Override
    public Borrow findPosts(Integer b_id) {
        Borrow borrow = borrowRepository.findById(b_id).get();
        return borrow;
    }

    @Override
    public void deletePosts(Integer b_id) {
        borrowRepository.deleteById(b_id);
    }

    @Override
    public Borrow alterPosts(Integer b_id, BorrowDTO borrowDto) {
        Borrow borrow = borrowRepository.findById(b_id).get();

        borrow.setB_name(borrowDto.getB_name());
        borrow.setB_period(borrowDto.getB_period());
        borrow.setB_price(borrowDto.getB_price());
        borrow.setB_writer(borrowDto.getB_writer());
        Borrow alterPost = borrowRepository.save(borrow);

        return alterPost;
    }


}
