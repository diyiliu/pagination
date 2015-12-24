package com.diyiliu.web.controller;

import com.diyiliu.plugin.PaginationHelper;
import com.diyiliu.plugin.PaginationResult;
import com.diyiliu.util.GsonUtil;
import com.diyiliu.web.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Description: UserController
 * Author: DIYILIU
 * Update: 2015-12-07 17:29
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/paging")
    public void paging(HttpServletRequest request, HttpServletResponse response){

        try {
            int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));

            PaginationHelper.page(pageIndex, 2);
            List users = userDao.findUserByPage("小明");

            int total = PaginationHelper.getPage().getTotalCount();

            PaginationResult result = new PaginationResult();
            result.setTotal(total);
            result.setData(users);

            response.setContentType("text/html");
            response.getWriter().write(GsonUtil.toJson(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
