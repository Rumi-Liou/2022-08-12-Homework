package com.example.springrestfulpratice.Controller.Dto.Request.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatOrderRequest {
    private String waiter;
    private List<Integer> mealIds;
}
