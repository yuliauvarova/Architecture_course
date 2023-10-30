package Lesson10.dao;

public class User {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}