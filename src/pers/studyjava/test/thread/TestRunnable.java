package pers.studyjava.test.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is just an another case of multi threads!");	
	}
	public static void main(String[] args){
		TestRunnable tR = new TestRunnable();
		Thread t = new Thread(tR);
		t.start();
	}
}
