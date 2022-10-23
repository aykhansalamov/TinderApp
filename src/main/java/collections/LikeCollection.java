package collections;

import interfaces.LikeDAO;
import models.Like;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class LikeCollection implements LikeDAO {
    Like like = new Like();
    Map<Integer, List<Integer>> likedUsers = like.liked;

    @Override
    public Like get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Like> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Like like) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Like like) throws SQLException {
        return 0;
    }

    @Override
    public int update(Like like) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Like like) {
        return 0;
    }
}
