package threads;

import java.util.concurrent.Semaphore;

class Resource {
	public static int counter = 10;
}

public class MyThread extends Thread {

	Semaphore semaphore;
	String name;

	public MyThread(Semaphore sm, String name) {
		super(name);
		this.semaphore = sm;
		this.name = name;
	}

	public void run() {
		
		
		System.out.println("Thread " + this.currentThread().getName() + " started");
		try {
			semaphore.acquire();
			Resource.counter++;
			System.out.println("Value incremented for "+this.currentThread().getName()+" thread!");
			semaphore.release();
			System.out.println(Resource.counter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Semaphore sm = new Semaphore(1);
		MyThread thread1 = new MyThread(sm, "Alpha");
		MyThread thread2 = new MyThread(sm, "Beta");
		
		thread1.start();
		thread2.start();
	}
}
