package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Exceptions01 {
    public static void main(String[] args) {
        
    	//File dosyasi icin File'a sag klik yap, Properties'i sec, Location'i kopyala ve buraya yapistir.
    			// Sikayete hala devam ediyor ustune gel Surrond with try catch'i sec
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ARIK\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\Exceptions01.java");
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
	}

}









