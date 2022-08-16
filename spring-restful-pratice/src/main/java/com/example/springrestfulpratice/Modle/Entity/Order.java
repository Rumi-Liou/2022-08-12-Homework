package com.example.springrestfulpratice.Modle.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Member")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;
    @Column
    private int totalPrice;
    @Column
    private String waiter;

    @OneToMany
    @JoinTable(
            name = "meals",
            joinColumns = @JoinColumn(name = "seq"),
            inverseJoinColumns = @JoinColumn(name = "name")
    )
    private List<Meal> mealList;

    public int getTotalPrice() {
        int total = 0;
        for (Meal meal : this.mealList) {
            total += meal.getPrice();
        }
        return total;
    }
}
