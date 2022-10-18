package collections;

import interfaces.UserDAO;
import models.User;

import java.util.HashMap;
import java.util.Map;

public class UserCollection implements UserDAO {
    static Map<Integer, User> userData = new HashMap<>();
    User user = new User();
    public static Map<Integer, User> save(){
        userData.put(1, new User("cristiano.ronaldo@gmail.com", "123456"));
        return userData;
    }
}
