package multihilo;

public class Join {

	public static void main(String[] args) {
		Thread hilo1 = new Thread(new Tarea(1));
		Thread hilo2 = new Thread(new Tarea(2));

		try {
			
			hilo1.start();
			hilo1.join();
			
			hilo2.start();
//		    hilo2.join();
		    
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Fin de la ejecución de los dos hilos");
	}

}
