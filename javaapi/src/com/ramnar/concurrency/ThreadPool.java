package com.ramnar.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int count = 1; count <= 10; count++) {

			service.execute(() -> {
				System.out.println("Thread number : " + Thread.currentThread().getName());
			});
		}
		service.shutdown();

	}

}
