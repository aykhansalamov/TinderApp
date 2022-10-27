package Servlet;

import collections.LikeCollection;
import collections.UserCollection;
import interfaces.UserDAO;
import lombok.SneakyThrows;
import models.User;

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
import java.sql.SQLException;
import java.util.List;

import static com.sun.org.apache.xpath.internal.compiler.Token.contains;

public class LoginServlet extends HttpServlet {
    User user = new User();
    LikeCollection likeCollection = new LikeCollection();
    UserCollection userCollection = new UserCollection();
    PeopleListServlet peopleListServlet = new PeopleListServlet();
    UserDAO userDAO = new UserCollection();

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

    public static int randomId() {
        int min = 15;
        int max = 99;

        //Generate random id value from 15 to 99

        int ramId = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return ramId;
    }


    //
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        try (PrintWriter w = rs.getWriter()) {
            String email = rq.getParameter("email");
            String password = rq.getParameter("password");
            rs.setContentType("text/html");
            PrintWriter pw = rs.getWriter();
//userCollection.getAll();
//                if (user.users.contains(email) && user.users.contains(password)) {
//                    userCollection.getAll();
//                    System.out.println(user.users);
//
//                   // rs.sendRedirect("http://localhost:2022/likePage");
//
//                } else {
//                    userCollection.getAll();
//                    System.out.println(user.users);
//              //  rs.sendRedirect("http://localhost:2022/login");
//
//                }
//            pw.close();
//                } else if (!user.users.contains(email)) {
//
//                    user.id = randomId();
//                    user.username = email;
//                    user.password = password;
//                }
//                int a = 5;
//                User user = new User(a, user.username, user.password, "NewUser", "https://static.thenounproject.com/png/70749-200.png");
//                userDAO.insert(user);
            }
        }




    public void templateUsers() throws SQLException {
        User user1 = new User(11, "cristiano.ronaldo@gmail.com", "123456", "Cristiano", "photo");
        User user2 = new User(12, "leo.messi@gmail.com", "123456", "Leo", "photo");
        User user3 = new User(13, "elon.musk@gmail.com", "123456", "Elon", "photo");
        User user4 = new User(14, "selena.gomez@gmail.com", "123456", "Selena", "photo");
        int a = userDAO.insert(user1) + userDAO.insert(user2) + userDAO.insert(user3) + userDAO.insert(user4);

    }
}
