package demo;

import java.util.ArrayList;

public class UserData {

    static ArrayList<User> users= new ArrayList<>();

    public static ArrayList<User> getAll(){
        return users;
    }

    public static void add(User newUser){
        users.add(newUser);
    }
}