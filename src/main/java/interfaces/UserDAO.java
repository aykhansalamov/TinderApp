package interfaces;

import models.User;

import java.sql.SQLException;

public interface UserDAO {
    User get(int id) throws SQLException;
    void getAll() throws SQLException;
    int save(User user) throws SQLException;
    int insert(User user) throws SQLException;
    int update(User user) throws SQLException;
    int delete(User user) throws SQLException;
}
