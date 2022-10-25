package collections;

import interfaces.UserDAO;
import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCollection implements UserDAO {
    static Map<Integer, User> userData = new HashMap<>();
     User user = new User();
    public static Map<Integer, User> save(){
        userData.put(1, new User("cristiano.ronaldo@gmail.com", "123456"));
        userData.put(2, new User("leo.messi@gmail.com", "123456"));
        userData.put(3, new User("elon.musk@gmail.com", "123456"));
        userData.put(4, new User("selena.gomez@gmail.com", "123456"));
        return userData;
    }
    public void newUser() {
        userData.put(user.id, new User(user.username, user.password));
    }

    @Override
    public User get(int id) throws SQLException {
        Connection con = Database.getConnection();
        User user = null;
        String sql = "SELECT id, username, password,name, photo FROM data WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int oid = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String name = rs.getString("name");
            String photo = rs.getString("photo");
            user = new User(oid, username, password, name, photo);
        }
        return user;
    }

    @Override
    public List<User> getAll() throws SQLException {
        Connection con = Database.getConnection();
        String sql = "SELECT id, username, password,name , photo FROM data";
        List<User> users = new ArrayList<>();

        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String name = rs.getString("name");
            String photo = rs.getString("photo");
            User user1 = new User(id, username, password, name, photo);
            users.add(user1);
        }
        return users;

    }

    @Override
    public int save(User user) throws SQLException {
        return 0;
    }

    @Override
    public int insert(User user) throws SQLException {
        return 0;
    }

    @Override
    public int update(User user) throws SQLException {
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }
}
