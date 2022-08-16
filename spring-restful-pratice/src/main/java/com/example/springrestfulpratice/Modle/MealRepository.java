package com.example.springrestfulpratice.Modle;

import com.example.springrestfulpratice.Modle.Entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
    Meal findBymealid(int id);

    Long deleteBymealid(int id);
}
