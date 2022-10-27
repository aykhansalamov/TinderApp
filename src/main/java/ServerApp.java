import Servlet.*;
import collections.Database;
import collections.UserCollection;
import interfaces.UserDAO;
import models.User;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.sql.Connection;
import java.util.List;

public class ServerApp {
    public static void main(String[] args) throws Exception {

//        UserDAO userdao = new UserCollection();
//        User user = userdao.get(23);
//        System.out.println(user);


//        List<User> users;
//        UserDAO userDAO = new UserCollection();
//        users = userDAO.getAll();
//        for (User user : users){
//            System.out.println(user);
//        }


//        UserDAO userDAO = new UserCollection();
//        User user = new User(77,"Azar@gmail.com","456","Azar","photo");
//        int result = userDAO.insert(user);
//        System.out.println(result);


//        UserDAO userDAO = new UserCollection();
//        User user = new User(7,"Ibra@gmail.com","111","Ibr","photok");
//        int result = userDAO.update(user);
//        System.out.println(result);

//        UserDAO userDAO = new UserCollection();
//        User user = userDAO.get(23);
//        System.out.println(user);
//        int result = userDAO.delete(user);
//        System.out.println(result);



        UserCollection userCollection = new UserCollection();
       // userCollection.getAll();
        Server server = new Server(2022);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new TestServlet()), "/users");
        handler.addServlet(new ServletHolder(new PeopleListServlet()), "/show");
        handler.addServlet(new ServletHolder(new LikePageServlet()), "/likePage");
        handler.addServlet(new ServletHolder(new ChatServlet()), "/chat");
        handler.addServlet(new ServletHolder(new LoginServlet()), "/login");
        handler.addServlet(new ServletHolder(new StaticFileServlet()), "/*");
        server.setHandler(handler);
        server.start();
        server.join();

//        user.saved();
//        System.out.println( user.save());
    }
}
