package com.masai.question03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		List<D> list = new ArrayList<>();
		
		list.add(new D(5));
		list.add(new D(10));
		list.add(new D(15));
		list.add(new D(12));
		list.add(new D(25));
		list.add(new D(30));
		
		for(D ans:list) {
			Future<Integer> f =  service.submit(ans);
			System.out.println("Product value =>"+ f.get());
		}
		
		service.shutdown();
		
	}

}
