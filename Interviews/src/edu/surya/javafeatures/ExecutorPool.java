package edu.surya.javafeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorPool {
	public static void main(String[] args){
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
		List<Future<String>> resultList = new ArrayList<>();
		final long startTime = System.nanoTime();
		FutureCall fc1 = new FutureCall("task1");
		Future<String> result1 = executor.submit(fc1);
		resultList.add(result1);
		FutureCall fc2 = new FutureCall("task2");
		Future<String> result2 = executor.submit(fc2);
		resultList.add(result2);

		for(Future<String> future : resultList){
			try{
				System.out.println("Future result is - " + " - " + future.get(1, TimeUnit.SECONDS) + "; And Task done is " + future.isDone() );
			} 
			catch (InterruptedException e){
				e.printStackTrace();
			} 
			catch (TimeoutException e) {
				e.printStackTrace();
				FutureCall fc3 = new FutureCall("task3");
				Future<String> result3 = executor.submit(fc3);
				try {
					System.out.println("Trying with 5 sec time out");
					System.out.println(result3.get(5, TimeUnit.SECONDS));

				} //catch (InterruptedException | ExecutionException | TimeoutException e1) {
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		//shut down the executor service now
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration/1000000000);
		executor.shutdown();
	}
}
class FutureCall implements Callable<String> {
	private String taskName ;
	FutureCall(String taskName){
		this.taskName = taskName;
	}
	@Override
	public String call() throws Exception {
		TimeUnit.SECONDS.sleep(2);
		return taskName;
	}
}