package cn.ztz; /**
 * @Author: ztz
 * @description:
 * @date: 2022-11-09 21:48
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        servletContext.setAttribute("username","ztz");

        System.out.println("context1中获取key为username的值:"+servletContext.getAttribute("username"));
        System.out.println("context1中获取key为username的值:"+servletContext.getAttribute("username"));
        System.out.println("context1中获取key为username的值:"+servletContext.getAttribute("username"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
