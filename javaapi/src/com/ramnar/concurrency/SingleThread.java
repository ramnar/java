package com.ramnar.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {

	public static void main(String[] args) {

		/*
		 * useful for many shortlived async tasks.Creates threads as needed but reuses
		 * previous available threads.Threads not used for 60 seconds are terminated
		 * ExecutorService service = Executors.newCachedThreadPool();
		 */

		/*
		 * Thread pool of fixed number of threads is created 
		 * ExecutorService service = Executors.newFixedThreadPool(int nThreads);
		 */
		
		/*
		 * Creates fork join executor.Thread pool size equal to the total number of cores in the system
		 * ExecutorService service = Executors.newWorkStealingPool();
		 * 
		 */

		// single worker thread backed by an unbounded queue.Tasks are executed
		// sequentially
		ExecutorService service = Executors.newSingleThreadExecutor();
		for (int count = 1; count <= 10; count++) {

			service.execute(() -> {
				System.out.println("Thread number : " + Thread.currentThread().getName());
			});
			
			//service.submit(Runnable) - to submit runnable task. returns future whose value is null when task is completed
			//service.submit(Callable) - to submit callable task
			//service.invokeAll() - to submit multiple callable tasks
			//service.invokeAny() - to submit multiple callable tasks.But waits till the result of first completed task is returned
			//and cancels others
		}
		service.shutdown(); //shutdown after all tasks are completed
		//service.shutdownNow();shutdown right away

	}

}
