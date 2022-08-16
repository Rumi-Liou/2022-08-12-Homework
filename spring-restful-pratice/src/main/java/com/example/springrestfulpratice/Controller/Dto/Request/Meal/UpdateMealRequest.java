package com.example.springrestfulpratice.Controller.Dto.Request.Meal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMealRequest {
    private int mealid;
    private String name;
    private int price;
    private String description;
}
