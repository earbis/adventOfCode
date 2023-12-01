package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumCalibrationValues {
    public static void main(String[] args) throws IOException {
        String ruta = ".\\CalibrationDocument.txt";
        BufferedReader br = new BufferedReader(new FileReader(new File(ruta)));
        String line;
        String numbers = "0123456789";
        int sum;
        while ((line = br.readLine()) != null) {
        	String res="";
            char[] letters = line.toCharArray();
            for (int i = 0; i < line.length(); i++) {
                char letra = letters[i];
                if (numbers.contains(String.valueOf(letra))) {
                	res = res + letra;
                    break;
                }
            }for (int i = line.length()-1; i >0 ; i--) {
                char letra = letters[i];
                if (numbers.contains(String.valueOf(letra))) {
                	res = res + letra;
                    break;
                }
            }
            
        }
    }
}
