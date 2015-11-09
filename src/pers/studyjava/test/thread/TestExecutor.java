package pers.studyjava.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
	public static void main(String[] args){
		
//		//线程池
//		ExecutorService exec = Executors.newCachedThreadPool();
//		for (int i=0;i<5 ; i++){
//			exec.execute(new LiftOff());
//		}
//		exec.shutdown();
//		
		//限制线程个数 (测试结果：并不能限制线程的个数？ 答疑：当前面0,1线程完成时，5,6线程就可以同事运行了，限制的是同时的个数)
		ExecutorService exec1 = Executors.newFixedThreadPool(5);
		for (int i=0;i<7 ; i++){
			exec1.execute(new LiftOff());
		}
		exec1.shutdown();
	}
}
