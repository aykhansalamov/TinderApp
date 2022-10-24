import Servlet.*;
import collections.Database;
import collections.UserCollection;
import interfaces.UserDAO;
import models.User;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.sql.Connection;

public class ServerApp {
    public static void main(String[] args) throws Exception {

//        UserDAO userdao = new UserCollection();
//        User user = userdao.get(23);
//        System.out.println(user);
        UserCollection user = new UserCollection();
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
