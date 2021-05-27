package com.gl52.euv.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 整合Servlet方式
 */

@WebServlet(name = "myServlet",urlPatterns = "/uv")
public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse repoonse){
        System.out.println("myServlet");
    }
}
