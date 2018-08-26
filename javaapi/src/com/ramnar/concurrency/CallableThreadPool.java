package com.ramnar.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService service = Executors.newFixedThreadPool(1);

		Callable<Integer> task = () -> {
			TimeUnit.SECONDS.sleep(5);
			return 123;
		};

		Future<Integer> result = service.submit(task);

		Integer output = result.get(10,TimeUnit.SECONDS);
		System.out.println(output);

		service.shutdown();

	}

}
