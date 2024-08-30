package org.example.util;

import org.example.objects.Account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.example.Main.map;
import static org.example.Main.saveData;

public class CreateAccount {
    public static void createAccount(String user, String name, double balance, long creationDate) throws IOException {
        if(map.containsKey(user)){
            map.get(user).add(new Account(name, balance, creationDate));
        } else {
            List<Account> accounts = new ArrayList<>();
            accounts.add(new Account(name, balance, creationDate));
            map.put(user, accounts);
        }
        saveData();
    }
}
