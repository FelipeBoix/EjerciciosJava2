package edu.upc.eetac.dsa.exercises.java.lang.EjerciciosJava2;

public class PrincipalThreads {
	 public static void main(String[] args) throws InterruptedException {
		 
		 ThreadC threadCc = new ThreadC("thread class");
		 Thread thread = new Thread (new RunnableC(), "runnable");
		 
		 threadCc.start();
		 thread.start();
		 
		 threadCc.join();
	     thread.join();
	     
	     System.out.println(" Se acabó");
		 
		 
	 }

}
