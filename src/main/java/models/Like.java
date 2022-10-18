package models;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Like {

    public Map<Integer,List<Integer>> liked;
    public Like(Map<Integer,List<Integer>> liked) {
        this.liked = liked;
    }

    public Like() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Like like = (Like) o;
        return Objects.equals(liked, like.liked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liked);
    }
}
