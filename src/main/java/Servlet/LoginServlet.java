package Servlet;

import collections.LikeCollection;
import collections.UserCollection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LoginServlet extends HttpServlet {
    LikeCollection likeCollection = new LikeCollection();
    UserCollection userCollection = new UserCollection();
    PeopleListServlet peopleListServlet = new PeopleListServlet();

    // http://localhost:2022/login

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String fileName = getClass().getClassLoader().getResource("login.html").getFile();
        List<String> lines = Files.readAllLines(Path.of(fileName.substring(1)));
        try (PrintWriter w = rs.getWriter()) {
            for (String line : lines) {
                w.println(line);
            }
        }
    }




//
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        try (PrintWriter w = rs.getWriter()) {
            String email = rq.getParameter("inputEmail");
            String password = rq.getParameter("inputPassword");

            rs.setContentType("text/html;charset=UTF-8");
            PrintWriter out = rs.getWriter();

            String name = rq.getParameter("Sign in");


            RequestDispatcher rd = rq.getRequestDispatcher("like-page.html");
            rd.forward(rq, rs);
        }




    }
}
