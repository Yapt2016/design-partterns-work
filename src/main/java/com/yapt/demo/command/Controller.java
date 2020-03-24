package com.yapt.demo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hurui
 * @version Id: Controller.java, v 0.1 2020/3/21 15:44 YaphetS Exp $$
 */
public class Controller {

    private List<Order> list = new ArrayList<>();

    public void addOrder(Order order){
        list.add(order);
    }

    public void execute(){
        for(Order order : list){
            order.execute();
        }
        list.clear();
    }
}