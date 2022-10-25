package models;

import java.util.*;

public class User {
    public int id;

    public String name;
    public String username;
    public String password;
    public String photo;
    public int userID;
    public List<Integer> idList = new ArrayList<>();
    public Map<Integer, List<Integer>> liked = new HashMap<>();
    public static Map<String, String> loginPass = new HashMap<>();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public Map<Integer, List<Integer>> getLiked() {
        return liked;
    }

    public void setLiked(Map<Integer, List<Integer>> liked) {
        this.liked = liked;
    }

    public boolean isFirstConstructor() {
        return firstConstructor;
    }

    public void setFirstConstructor(boolean firstConstructor) {
        this.firstConstructor = firstConstructor;
    }

    public boolean isSecondConstructor() {
        return secondConstructor;
    }

    public void setSecondConstructor(boolean secondConstructor) {
        this.secondConstructor = secondConstructor;
    }

    public boolean isThirdConstructor() {
        return thirdConstructor;
    }

    public void setThirdConstructor(boolean thirdConstructor) {
        this.thirdConstructor = thirdConstructor;
    }

    public boolean isFourthConstructor() {
        return fourthConstructor;
    }

    public void setFourthConstructor(boolean fourthConstructor) {
        this.fourthConstructor = fourthConstructor;
    }
}

