package cn.asn.springmvc.controller;

import cn.asn.springmvc.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by xuwentang on 2017/8/21.
 */
public class ItemsController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("ItemsController.handleRequest ...");

        List<Items> itemsList = new ArrayList<Items>();
        System.out.println("Received request: " + request.getContextPath());

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000F);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("华硕笔记本电脑");
        items_2.setPrice(5000F);
        items_2.setDetail("HuaShuo 记本电脑！");

        Items items_3 = new Items();
        items_3.setName("小米手机");
        items_3.setPrice(2000F);
        items_3.setDetail("小米6手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);
        itemsList.add(items_3);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", itemsList);

        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }
}
