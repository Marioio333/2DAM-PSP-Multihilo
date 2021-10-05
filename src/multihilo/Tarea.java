package multihilo;

public class Tarea extends Thread implements Runnable{
	int id;
	
	public Tarea(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hilo " + id + " paso " + i + " durmiendo");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hilo " + id + " paso " + i + " despertado");
		}
	}
}
