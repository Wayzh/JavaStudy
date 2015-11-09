package pers.studyjava.test.thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class TaskWithResult implements Callable<String>{
	private final int id;
	TaskWithResult(int id){
		this.id=id;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Task "+ id;
	}	
}


public class TestCallable {
	public static void main(String[] args){
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i= 0 ; i < 10 ; i++){
			results.add(exec.submit(new TaskWithResult(i)));
		}
		for(Future<String> fs : results){
			try{
					
					System.out.println(fs.get());
					//get 方法会自动阻塞，直至结果准备就绪
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			catch(ExecutionException e){
				System.out.println(e);
			}
			finally {
				exec.shutdown();
			}
		}
	}

}
