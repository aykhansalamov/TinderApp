package models;

import java.util.*;

public class User {
    public int id;

    public String name;
    public String username;
    public String password;
    public String photo;
    public List<Integer> idList = new ArrayList<>();
    public Map<Integer, List<Integer>> liked = new HashMap<>();

    private boolean firstConstructor = false;
    private boolean secondConstructor = false;
    private boolean thirdConstructor = false;
    private boolean fourthConstructor = false;


    /** Added */
    public User(int id,String username,String password,String name,String photo){
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.photo = photo;
        firstConstructor = true;
    }
    public User(int id, String username, String photo, Map<Integer, List<Integer>> liked) {
        this.id = id;
        this.username = username;
        this.photo = photo;
        this.liked = liked;
        secondConstructor = true;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        thirdConstructor = true;

    }
    public User(int id) {
        this.id = id;
        fourthConstructor = true;
    }

    public User() {

    }

    @Override
    public String toString() {
        if (firstConstructor)
            return "id=" + id + ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
        if (secondConstructor)
            return "models.User{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", photo='" + photo + '\'' +
                    ", liked='" + liked + '\'' +
                    '}';
        else if (thirdConstructor)
            return "username=" + username + '\'' +
                    ", password=" + password;
        else if (fourthConstructor)
            return "id=" + id;
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
