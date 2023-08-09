package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File2 {

	public static void main(String[] args) {
		
		Path path = Paths.get("C://temp//java_test//text.txt");
		Charset charset = StandardCharsets.UTF_8;
		
		// write
		try(BufferedWriter bufferWriter = Files.newBufferedWriter(path, charset)) {
			bufferWriter.write("text\n");
			bufferWriter.write("text2");
			bufferWriter.flush();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// read
		try(BufferedReader bufferedReader = Files.newBufferedReader(path, charset)){
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
