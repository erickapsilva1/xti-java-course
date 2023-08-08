package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

	public static void main(String[] args) throws IOException {
		
		// Basic information
		Path path = Paths.get("C://temp//java_test//text.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		System.out.println(path.getFileSystem());
		
		// Create file (dir)
		Files.createDirectories(path.getParent());
		
		// Create file (read and write files)
		byte[] bytes = "My text".getBytes();
		Files.write(path, bytes);
		
		byte[] fileReturn = Files.readAllBytes(path);
		System.out.println(new String(fileReturn));
	}

}
