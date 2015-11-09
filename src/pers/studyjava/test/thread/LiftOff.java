package pers.studyjava.test.thread;

public class LiftOff implements Runnable {
	protected int count = 10;
	private static int taskCount = 0;
	private final int id =  taskCount++;
	private String status(){
		return "Thread#"+id+"("+
	    (count>0?count:"Liftoff!)")+"),";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count-->0){
			System.out.println(status());
		}
	}
}
