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
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {


        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("����ʼǱ�");
        items_1.setPrice(6000F);
        items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");

        Items items_2 = new Items();
        items_2.setName("��˶�ʼǱ�����");
        items_2.setPrice(5000F);
        items_2.setDetail("HuaShuo �Ǳ����ԣ�");

        Items items_3 = new Items();
        items_3.setName("С���ֻ�");
        items_3.setPrice(2000F);
        items_3.setDetail("С��6�ֻ���");

        itemsList.add(items_1);
        itemsList.add(items_2);
        itemsList.add(items_3);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", itemsList);

        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        return modelAndView;
    }
}