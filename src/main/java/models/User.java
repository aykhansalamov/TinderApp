package models;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class User {
    public int id;
    public String username;
    public String password;
    public String photo;
    public Map<Integer, List<Integer>> liked;

    private boolean firstConstructor = false;
    private boolean secondConstructor = false;

    public User(int id, String username, String photo, Map<Integer, List<Integer>> liked) {
        this.id = id;
        this.username = username;
        this.photo = photo;
        this.liked = liked;
        firstConstructor = true;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        secondConstructor = true;

    }

    public User() {

    }

    @Override
    public String toString() {
        if (firstConstructor)
            return "models.User{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", photo='" + photo + '\'' +
                    ", liked='" + liked + '\'' +
                    '}';
        else if (secondConstructor)
            return "username='" + username + '\'' +
                    ", password='" + password;

else
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && username.equals(user.username) && photo.equals(user.photo) && liked.equals(user.liked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, photo, liked);
    }
}
