package org.example.objects;

public class User {
    private String name;
    private String username;
    //TODO add hashing for passwords
    public User(String name, String username){
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }
}
