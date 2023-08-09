package br.com.xti.java;

import java.io.IOException;
import java.nio.file.*;

public class File4 {
    public static void main(String[] args) throws IOException {

        // Returns an object to iterate over the paths of the root directories.
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path path : dirs) {
            System.out.println(path);
        }

        // Lists directory content
        Path dir = Paths.get("c:/temp/");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for(Path path : stream){
                System.out.println(path.getFileName());
            }
        }catch (IOException | DirectoryIteratorException e){
            e.printStackTrace();
        }

        // Returns an object to iterate over the underlying file stores.
        FileSystem fileSystem = FileSystems.getDefault();
        for(FileStore store : fileSystem.getFileStores()){
            System.out.println("Drive: " + store.toString());
            System.out.println("Capacity: " + store.getTotalSpace() / 1024 / 1024 / 1024);
            System.out.println("Free Space: " + (store.getTotalSpace() - store.getUsableSpace()));
            System.out.println("Used Space: " + store.getUsableSpace());
        }
    }
}
