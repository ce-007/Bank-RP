package org.example.util;

import org.example.objects.Account;

import java.util.List;

import static org.example.Main.map;

public class GetAccounts {
    public static List<Account> getAccount(String user) {
        return map.get(user);
    }
}
