package edu.upc.eetac.dsa.exercises.java.lang.EjerciciosJava2;

public class Producer implements Runnable {
	    private Buffer buffer = null;
	    private String line = null;

	    public Producer(Buffer buffer, String line) {
	        this.buffer = buffer;
	        this.line = line;
	    }

	    
	    public void run() {
	        char chars[] = line.toCharArray();
	        for (char c : chars) {
	            buffer.put(c);
	        }
	    }

}
