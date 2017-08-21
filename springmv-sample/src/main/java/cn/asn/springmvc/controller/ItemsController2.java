package cn.asn.springmvc.controller;

import cn.asn.springmvc.po.Items;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuwentang on 2017/8/21.
 */
public class ItemsController2 implements HttpRequestHandler {



    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


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

        // ����ģ������
        request.setAttribute("itemsList", itemsList);

        // ����ת������ͼ
        request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
    }
}
