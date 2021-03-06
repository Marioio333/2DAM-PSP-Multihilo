package multihilo;

public class TareaAlive extends Tarea implements Runnable{
	Thread otroHilo;
	
	public TareaAlive(Thread otroHilo) {
		this.otroHilo = otroHilo;
	}
	
	public TareaAlive(Thread otroHilo, String nombre) {
		super(nombre);
		this.otroHilo = otroHilo;
	}
	
	@Override
	public void run() {
		while(otroHilo.isAlive()) {
			System.out.println(this.getName() + ": Yo hago cosas mientras " + otroHilo.getName() + " siga ejecut?ndose.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + ": " + otroHilo.getName() + " ha terminado, yo tambi?n.");
	}
}
