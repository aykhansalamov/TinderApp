package interfaces;

import models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    User get(int id) throws SQLException;
    List<User> getAll() throws SQLException;
    int save(User user) throws SQLException;
    int insert(User user) throws SQLException;
    int update(User user) throws SQLException;
    int delete(User user) throws SQLException;
}
