package com.example.springrestfulpratice.Controller.Dto.Request.Order;

import com.example.springrestfulpratice.Modle.Entity.Meal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteOrderRequest {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> mealList;
}
