package collections;

import models.Like;

import java.util.List;
import java.util.Map;

public class LikeCollection {
    Like like = new Like();
    Map<Integer, List<Integer>> likedUsers = like.liked;

}
