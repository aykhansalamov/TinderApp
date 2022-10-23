package collections;

import interfaces.UserDAO;
import models.User;

import java.sql.SQLException;
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
        return null;
    }

    @Override
    public List<User> getAll() throws SQLException {
        return null;
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
