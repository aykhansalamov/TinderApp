package interfaces;

import models.Chat;

import java.sql.SQLException;
import java.util.List;

public interface ChatDAO {
    Chat get(int id) throws SQLException;
    List<Chat> getAll() throws SQLException;
    int save(Chat chat) throws SQLException;
    int insert(Chat chat) throws SQLException;
    int update(Chat chat) throws SQLException;
    int delete(Chat chat);
}
