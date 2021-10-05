package multihilo;

public class Main {

	public static void main(String[] args) {
		Thread hilo1 = new Thread(new Tarea(1));
		Thread hilo2 = new Thread(new TareaAlive(hilo1));

		hilo1.start();
		hilo2.start();

		System.out.println("Fin de la ejecución de los dos hilos");
	}

}
