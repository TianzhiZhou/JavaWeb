package cn.ztz;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: ztz
 * @description:
 * @date: 2022-11-07 22:29
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("1 构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2 初始化方法");

        System.out.println("HelloServlet程序的别名是："+servletConfig.getServletName());
        System.out.println("HelloServlet程序的初始化参数username是："+servletConfig.getInitParameter("username"));
        System.out.println("HelloServlet程序的初始化参数url是："+servletConfig.getInitParameter("url"));
        System.out.println("HelloServlet程序context对象"+servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3 service方法 == Hello Servlet被访问");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
        System.out.println(method);
        if("GET".equalsIgnoreCase(method)){
            doGet();
        }else if("POST".equalsIgnoreCase(method)){
            doPost();
        }

    }

    /**
     * 处理get请求方法
     * @author ztz
     * @date 2022/11/8
     * @param
     * @return
     */
    public void doGet(){
        System.out.println("处理get请求");
    }

    /**
     * 处理post请求方法
     * @author ztz
     * @date 2022/11/8
     * @param
     * @return
     */
    public void doPost(){
        System.out.println("处理post请求");
    }

    @Override
    public String getServletInfo() {
        System.out.println("4 获取servlet信息方法");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("5 销毁方法");
    }
}
