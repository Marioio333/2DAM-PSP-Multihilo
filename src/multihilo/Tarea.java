package multihilo;

public class Tarea extends Thread implements Runnable{
	public Tarea() {}
	
	public Tarea(String nombre) {
		this.setName(nombre);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(this.getName() + ": Paso " + i + " durmiendo");
//			try {
////				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(this.getName() + ": Paso " + i + " despertado");
		}
	}
}
