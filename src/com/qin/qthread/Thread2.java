package com.qin.qthread;

public class Thread2 extends Thread {

	private String name;

	public Thread2(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run:" + i + name);
			try {
				sleep((int) (1 + Math.random() * 10));

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		Thread2 threadA = new Thread2("A");
		Thread2 threadB = new Thread2("B");
		threadA.start();
		threadB.start();
	}
}
