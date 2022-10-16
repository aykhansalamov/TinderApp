import java.util.List;
import java.util.Map;
import java.util.Objects;

public class User {
    public int id;
    public String username;
    public Integer age;
    public String photo;
    public Map<Integer,List<Integer>> liked;

    public User(int id, String username, int age, String photo) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", photo='" + photo + '\'' +
                ", liked='" + liked + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && username.equals(user.username)&& photo.equals(user.photo) && liked.equals(user.liked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, age, photo, liked);
    }
}
