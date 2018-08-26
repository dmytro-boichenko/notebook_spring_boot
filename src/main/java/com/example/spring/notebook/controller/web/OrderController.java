package com.example.spring.notebook.controller.web;


import com.example.spring.notebook.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }



    @GetMapping
    public String getOrderPage(Map<String, Object> map){
        map.put("Fraza", "Contoller of Order is swich-On!!!");

        return "/jsp-order/orderPage";
    }

    @GetMapping(value={"/allOrders"})
    public String getOrders(Map<String, Object> map, Model model){
        map.put("Orders", "Все ордера успешно выведены");
        model.addAttribute("service", orderService.getOrders());
        return "/jsp-order/orders";
    }

    @GetMapping(value={"/ordersBy"})
    public String getOrdersBy(Map<String, Object> map, Model model){
        map.put("OrdersBy", "Вы можете запросить данные по конкретному" +
                " ордеру по его id или другим парметрам");
        //model.addAttribute("service", orderService.getOrders());
        return "/jsp-order/ordersBy";
    }
    @GetMapping("/ordersParam")
    public String getOrderParam(Map<String, Object> map, Model model,

                            @RequestParam Map<String, Object> paramPoisk){
        map.put("Parametr", "Вы запросили ордера по параметру: " );

        map.put("Hai", orderService.getOrderBy(paramPoisk));


        return "/jsp-order/ordersParam";
    }

}
