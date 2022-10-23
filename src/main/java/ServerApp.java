import Servlet.*;
import collections.UserCollection;
import models.User;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
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
