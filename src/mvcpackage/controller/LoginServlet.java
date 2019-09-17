package mvcpackage.controller;

import mvcpackage.model.bean.Login;
import mvcpackage.model.dao.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("username");
        String upassword = request.getParameter("password");

        Login loginBean = new Login();
        loginBean.setUname(uname);
        loginBean.setUpassword(upassword);

        try {
            if (LoginDAO.validate(loginBean)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", uname);
                response.sendRedirect("success.jsp");
            } else {
            //HttpSession session = request.getSession();
                response.sendRedirect("error.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
