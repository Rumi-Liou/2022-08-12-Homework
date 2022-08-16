package com.example.springrestfulpratice.Service;

import com.example.springrestfulpratice.Controller.Dto.Request.Order.CreatOrderRequest;
import com.example.springrestfulpratice.Controller.Dto.Request.Order.UpdateOrderRequest;
import com.example.springrestfulpratice.Modle.Entity.Order;
import com.example.springrestfulpratice.Modle.MealRepository;
import com.example.springrestfulpratice.Modle.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRespository orderRespository;
    @Autowired
    private MealRepository mealRespository;

    public List<Order> getOrder() {
        return orderRespository.findAll();
    }

    public Order getOrderById(int id) {
        return orderRespository.findById(id);
    }

    public String creatOrder(CreatOrderRequest request) {
        Order order = new Order();
        // Order check=orderRespository.findById(request.getSeq());
        //if(null == check){
        //order.setSeq(request.getSeq());
        order.setWaiter(request.getWaiter());
        order.setMealList(mealRespository.findAllById(request.getMealIds()));
        orderRespository.save(order);
        return "OK";
        //}
        //  return "Id id exist";
    }

    public String updateOrder(int id, UpdateOrderRequest request) {
        Order order = orderRespository.findById(id);
        if (null != order) {
            order.setWaiter(request.getWaiter());
            order.setMealList(mealRespository.findAllById(request.getMealIds()));
            orderRespository.save(order);
            return "Succes!";
        }
        return "Fail";
    }

    @Transactional
    public String deleteOrder(int seq) {
        Order order = orderRespository.findById(seq);
        // DeleteOrderRequest deleteOrderRequest ;
        if (null != order) {
            long count = orderRespository.deleteBySeq(seq);
            return "data is delete!";
        }
        return "User is not exist!";
    }
  /*  List<Meal> mealList;
    List<Order> orderList;

    public OrderService(){
        this.mealList=new ArrayList<>();
        this.orderList=new ArrayList<>();
        this.mealList.add(new Meal("hamberger",50,"Delicious"));
        this.mealList.add(new Meal("French Fries",35,"French"));
        this.mealList.add(new Meal("Cola",1000,"drink"));
        this.orderList.add(new Order(1,300,"MIly",mealList));
        this.orderList.add(new Order(2,4000,"Kevin",mealList));

    }*/

    /*public List<Order> getAllOrder(){
        return this.orderList;
    }

    public Order getOrderById(int id){
        for (Order order:this.orderList){
          if(id==order.getSeq()){
              return order;
          }
        }
        return null;
    }

    public Order creatOrder( Order order){
        this.orderList.add(order);
        return order;
    }

    public Order updateOrder( int id,Order order){
        for(Order updateorder:this.orderList){
            if(id==order.getSeq()){
                updateorder.setWaiter(order.getWaiter());
                updateorder.setTotalPrice(order.getTotalPrice());
                return updateorder;
            }
        }
        return null;
    }

    public Order deleteOrder( int id){
        for(Order order:this.orderList){
            if(id==order.getSeq()){
                orderList.remove(id);
                return order;
            }
        }
        return null;
    }*/
}
