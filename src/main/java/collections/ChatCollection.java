package collections;

import interfaces.ChatDAO;
import models.Chat;

import java.sql.SQLException;
import java.util.List;

public class ChatCollection implements ChatDAO {

    @Override
    public Chat get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Chat> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Chat chat) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Chat chat) throws SQLException {
        return 0;
    }

    @Override
    public int update(Chat chat) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Chat chat) {
        return 0;
    }
}
