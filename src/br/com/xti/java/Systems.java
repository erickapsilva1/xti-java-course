package br.com.xti.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Systems {
    public static void main(String[] args) throws IOException {

        // Properties
        Properties properties = System.getProperties();
        System.out.println(properties.getProperty("java.version"));

        properties.setProperty("xti.course.java.version", "1.0.0");  // set property
        System.out.println(properties.getProperty("xti.course.java.version"));

        Set<Object> pk = properties.keySet();
        for(Object key : pk){
            System.out.println(key + " = " + properties.get(key));
        }

        // Console
        Console console = System.console();
        System.out.print("User: ");
        String user = console.readLine();
        System.out.print("Password: ");
        char[] userPasswd = console.readPassword();
        System.out.println("User=" + user + " | Passwd=" + new String(userPasswd));

        // Runtime
        Runtime.getRuntime().exec("notepad");

    }
}
