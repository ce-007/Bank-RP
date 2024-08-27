package org.example.util;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
}
