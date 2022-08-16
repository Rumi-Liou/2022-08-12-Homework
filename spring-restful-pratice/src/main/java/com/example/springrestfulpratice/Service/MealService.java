package com.example.springrestfulpratice.Service;

import com.example.springrestfulpratice.Controller.Dto.Request.Meal.CreatMealRequest;
import com.example.springrestfulpratice.Controller.Dto.Request.Meal.UpdateMealRequest;
import com.example.springrestfulpratice.Exception.NotFoundException;
import com.example.springrestfulpratice.Exception.PointExistException;
import com.example.springrestfulpratice.Modle.Entity.Meal;
import com.example.springrestfulpratice.Modle.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MealService {
    @Autowired
    private MealRepository mealRespository;

    public List<Meal> getOrder() {
        return mealRespository.findAll();
    }

    public Meal getMealById(int id) {

        Meal meal=mealRespository.findBymealid(id);
       // if(meal.equals(id)){
       //     throw new NotFoundException(id);
        //}
        return meal;
    }

    public String creatMeal(CreatMealRequest request) {
        Meal meal = new Meal();
        //Meal check=mealRespository.findBymealid(request.getMealid());
        //if(null == check){
        //  meal.setMealid(request.getMealid());
      //  Meal check=mealRespository.findAllById(meal.getName());
      //  if(request.getName().equals(meal)){
        //    throw new PointExistException(id);
       // }
        meal.setName(request.getName());
        meal.setPrice(request.getPrice());
        meal.setDescription(request.getDescription());
        mealRespository.save(meal);
        return "OK";

    }

    public String updateOrder(int id, UpdateMealRequest request) {
        //  Meal meals ;
        Meal meal = mealRespository.findBymealid(id);
        if (null != meal) {
          //  if(request.getName().equals(meal)){
                meal.setName(request.getName());
                meal.setPrice(request.getPrice());
                meal.setDescription(request.getDescription());
                mealRespository.save(meal);
                return "Succes!";
       //     }
         //   else{
          //      throw new NotFoundException(id);
           // }
        }
        return "Fail";
    }

    @Transactional
    public String deleteMeal(int id) {
        Meal meal = mealRespository.findBymealid(id);
        // DeleteOrderRequest deleteOrderRequest ;
        if (null != meal) {
            long count = mealRespository.deleteBymealid(id);
            return "data is delete!";
        }
        return "User is not exist!";
    }
}
