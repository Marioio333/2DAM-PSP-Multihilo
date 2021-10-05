package multihilo;

public class Main {

	public static void main(String[] args) {
		Thread hilo1 = new Thread(new Tarea());
		Thread hilo2 = new Thread(new Tarea());
		Thread hilo3 = new Thread(new TareaAlive(hilo1));

		System.out.println(hilo1.getThreadGroup() + "\n");
		hilo1.setName("Hilo1");
		
		hilo1.setPriority(1);
		hilo2.setPriority(9);
		
		hilo1.start();
		hilo2.start();
//		hilo3.start();

		System.out.println("Fin de la ejecución del hilo ppal");
	}

}
