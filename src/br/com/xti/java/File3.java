package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class File3 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C://temp//java_test//text.txt");

        // Create
        Files.createFile(path);
        Files.write(path, "My text".getBytes());

        // File information set
        System.out.println(Files.exists(path));  // check if file exists
        System.out.println(Files.isDirectory(path)); // check if it's a directory
        System.out.println(Files.isRegularFile(path)); // common file
        System.out.println(Files.isReadable(path)); // it's a readable file
        System.out.println(Files.isExecutable(path)); // it's a executable file
        System.out.println(Files.size(path)); // file size in bytes
        System.out.println(Files.getLastModifiedTime(path)); // file's last modified time
        System.out.println(Files.getOwner(path)); // returns the owner of a file
        System.out.println(Files.probeContentType(path)); // probes the content type of file.

        // Delete
        //Files.delete(path);
        //Files.deleteIfExists(path);

        // Copy
        Path copy = Paths.get("C://temp//java_test//text-copy.txt");
        Files.copy(path, copy, StandardCopyOption.REPLACE_EXISTING);

        // Move
        Path move = Paths.get("C://temp//java_test//move//text.txt");
        Files.createDirectories(move.getParent());
        Files.move(path, move, StandardCopyOption.REPLACE_EXISTING);

    }

}
