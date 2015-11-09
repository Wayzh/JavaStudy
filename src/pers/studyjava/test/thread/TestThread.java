package pers.studyjava.test.thread;

public class TestThread extends Thread {
	int id=0;
	TestThread(){
		
	}
	TestThread(int id){
		this.id=id;
	}
	public void run(){
		
		System.out.println("TestThread "+id+" is running");
	}
	public static void main(String[] args){
		TestThread tThread1 = new TestThread(1);
		tThread1.start();
		TestThread tThread2 = new TestThread(2);
		tThread2.start();
	}
}
