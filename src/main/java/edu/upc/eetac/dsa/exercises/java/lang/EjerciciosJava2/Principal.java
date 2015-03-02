package edu.upc.eetac.dsa.exercises.java.lang.EjerciciosJava2;

import java.io.File;
import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException {
    	Binario testWrite = new Binario(5, 7.9, 'F');
        testWrite.saveToFile("EjercicioBinatio.txt");

        Binario testRead = Binario.readFromFile("EjercicioBinatio.txt");
        System.out.println("integer = " + testRead.getInteger());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("char = " + testRead.getCharacter());

        
        File file = new File("EjercicioBinatio.txt");
        file.delete();
    }
}