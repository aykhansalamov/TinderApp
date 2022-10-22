package interfaces;

import models.Like;

import java.sql.SQLException;
import java.util.List;

public interface LikeDAO {
    Like get(int id) throws SQLException;
    List<Like> getAll() throws SQLException;
    int save(Like like) throws SQLException;
    int insert(Like like) throws SQLException;
    int update(Like like) throws SQLException;
    int delete(Like like);
}
