package cn.ztz; /**
 * @Author: ztz
 * @description:
 * @date: 2022-11-09 21:13
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println("context参数username的值是"+username);
        String password = servletContext.getInitParameter("password");
        System.out.println("context参数password的值是"+password);
        System.out.println("当前工程路径:"+servletContext.getContextPath());
        //斜杠被服务器解析地址为:http://ip:port/工程名/ 映射到idea代码的web目录
        System.out.println("工程部署的路径是:"+servletContext.getRealPath("/"));
        System.out.println("工程下静态文件目录是："+servletContext.getRealPath("/resources"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
