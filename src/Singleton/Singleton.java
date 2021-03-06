package Singleton;

import java.util.ArrayList;

/*
	This class is responsible to have a contact with all Burger Kings. We need to inform them if we hire a person,they keep this record.
 */

public class Singleton {
	private static Singleton instance;
	private ArrayList<String> workers = new ArrayList<String>();

	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	}

	public void addWorker(String worker) {
		workers.add(worker);
	}

	public void printWorkers() {
		if(workers.isEmpty()){
			System.out.println("There is no worker!!");
			return;
		}
		for(String worker: workers) {
			System.out.println(worker);
		}
	}

	public void getHelp() {
		System.out.println("In order to get help from USA center call: +1 523 788 22 22");
	}
}
