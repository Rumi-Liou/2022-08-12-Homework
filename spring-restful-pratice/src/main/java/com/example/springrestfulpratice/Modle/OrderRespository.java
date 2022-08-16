package com.example.springrestfulpratice.Modle;

import com.example.springrestfulpratice.Modle.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRespository extends JpaRepository<Order, Integer> {
    Order findById(int id);

    Long deleteBySeq(int seq);
}
