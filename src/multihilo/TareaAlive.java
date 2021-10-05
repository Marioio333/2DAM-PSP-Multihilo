package multihilo;

public class TareaAlive extends Thread implements Runnable{
	Thread otroHilo;
	
	public TareaAlive(Thread otroHilo) {
		this.otroHilo = otroHilo;
	}
	
	@Override
	public void run() {
		while(otroHilo.isAlive()) {
			System.out.println("Yo hago cosas mientras el otro hilo siga ejecutándose.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("El otro hilo ha terminado, yo también.");
	}
}
