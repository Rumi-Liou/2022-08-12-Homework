package com.example.springrestfulpratice.Controller;

import com.example.springrestfulpratice.Controller.Dto.Request.Meal.CreatMealRequest;
import com.example.springrestfulpratice.Controller.Dto.Request.Meal.UpdateMealRequest;
import com.example.springrestfulpratice.Modle.Entity.Meal;
import com.example.springrestfulpratice.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealController {
    @Autowired
    private MealService mealService;

    @GetMapping()
    public List<Meal> getAllOrder() {
        List<Meal> mealList = this.mealService.getOrder();
        return mealList;
    }

    @GetMapping("/{id}")
    public Meal getMealById(@PathVariable int id) {
        Meal meal = this.mealService.getMealById(id);
        return meal;
    }

    @PostMapping
    public String creatMeal(@RequestBody CreatMealRequest meal) {
        return mealService.creatMeal(meal);
    }

    @PutMapping("/{id}")
    public String updateMeal(@PathVariable int id, @RequestBody UpdateMealRequest meal) {
        // Order updateOrder=this.orderService.updateOrder(id, order);
        return mealService.updateOrder(id, meal);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {

        return mealService.deleteMeal(id);
    }
}
