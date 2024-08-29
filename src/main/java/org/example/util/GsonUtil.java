package org.example.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.objects.Account;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class GsonUtil {
    public static void checkForExistingFiles() {
        if (!new File("run/data/accounts.json").exists()) {
            try {
                Files.createDirectory(Paths.get("run"));
                Files.createDirectory(Paths.get("run/data"));
                new File("run/data/users.json").createNewFile();
                new File("run/data/accounts.json").createNewFile();
                new File("run/config.json").createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> List loadFile(String filename, Class<T> input) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        Type listType = TypeToken.getParameterized(List.class, input).getType();
        FileReader reader = new FileReader(filename);
        return gson.fromJson(reader, listType);
    }

    public static <K, V> Map<K, V> loadMap(String filename, Class<String> keyClass, Class<Account> valueClass) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();

        Type mapType = TypeToken.getParameterized(Map.class, keyClass, TypeToken.getParameterized(List.class, valueClass).getType()).getType();

        FileReader reader = new FileReader(filename);
        return gson.fromJson(reader, mapType);
    }

    public static <T> void writeListToFile(String filename, List<T> list) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(list, writer);
        }
    }

    public static <K, V> void writeMapToFile(String filename, Map<K, V> map) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(map, writer);
        }
    }
}
