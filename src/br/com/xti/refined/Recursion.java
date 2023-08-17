package br.com.xti.refined;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursion {

    public static int sum(int x){
        if(x == 0){
            return 0;
        }else{
            return x + sum(x - 1);
        }
    }

    public static int pow(int x, int y){
        if(y == 1){
            return x;
        }else{
            return x * pow(x, y - 1);
        }
    }

    public static void list(Path path){
        if(Files.isRegularFile(path)){
            System.out.println(path.toAbsolutePath());
        }else{
            String s = "\n" + path.toAbsolutePath();
            System.err.println(s.toUpperCase());
            try {
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for (Path p : directoryStream ) {
                    list(p);
                }
            } catch (Exception exception) {}
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(pow(3, 4));
        list(Paths.get("C:/temp/"));
    }
}
