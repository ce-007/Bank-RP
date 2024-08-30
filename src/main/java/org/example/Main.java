package org.example;

import org.example.objects.Account;
import org.example.objects.User;
import org.example.util.GsonUtil;

import java.io.IOException;
import java.util.*;

public class Main {
    public static Map<String, List<Account>> map = new HashMap<>();
    public static List<User> users = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        GsonUtil.checkForExistingFiles();

        users = GsonUtil.loadFile("run/data/users.json", User.class);
        map = GsonUtil.loadMap("run/data/accounts.json", String.class, Account.class);

        if (map == null) {
            map = new HashMap<>();
        }
        if (users == null) {
            users = new ArrayList<>();
        }
        saveData();
    }

    public static void saveData() throws IOException {
        GsonUtil.writeListToFile("run/data/users.json", users);
        GsonUtil.writeMapToFile("run/data/accounts.json", map);
    }
}