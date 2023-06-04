package com.project.shoppingmall.service.borrow;

import com.project.shoppingmall.controller.dto.EnrollDTO;
import com.project.shoppingmall.controller.dto.borrow.BorrowDTO;
import com.project.shoppingmall.entity.borrow.Borrow;
import com.project.shoppingmall.entity.borrow.EnrollBorrow;
import com.project.shoppingmall.repository.borrow.BorrowRepository;
import com.project.shoppingmall.repository.borrow.EnrollBorrowRepository;
import com.project.shoppingmall.service.borrow.impl.BorrowServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BorrowService implements BorrowServiceImpl {

    private final BorrowRepository borrowRepository;
    private final EnrollBorrowRepository enrollBorrowRepository;

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

    @Override
    public EnrollBorrow saveEnroll(EnrollDTO enrollDTO, Borrow e_id) {
        EnrollBorrow enroll = new EnrollBorrow();
        enroll.setE_id(e_id);
        enroll.setE_name(enrollDTO.getE_name());
        enroll.setE_phone(enrollDTO.getE_phone());
        EnrollBorrow saveEnroll = enrollBorrowRepository.save(enroll);
        return saveEnroll;
    }

    @Override
    public List<EnrollBorrow> findEnroll() {
        List<EnrollBorrow> findEnroll = (List<EnrollBorrow>) enrollBorrowRepository.findAll();
        return findEnroll;
    }

    @Override
    public EnrollBorrow alterEnroll(Integer p_id, EnrollDTO enrollDTO) {
        EnrollBorrow enrollBorrow =  enrollBorrowRepository.findById(p_id).get();;
        enrollBorrow.setE_name(enrollDTO.getE_name());
        enrollBorrow.setE_phone(enrollDTO.getE_phone());
        EnrollBorrow alterEnroll = enrollBorrowRepository.save(enrollBorrow);
        return alterEnroll;
    }

}
