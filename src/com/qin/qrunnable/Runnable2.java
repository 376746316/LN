package com.qin.qrunnable;

public class Runnable2 implements Runnable {

	private String name;

	public Runnable2(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 6; i++) {
			System.out.println(name + "Run" + i);
			try {
				Thread.sleep((int) (1 + Math.random() * 10));
			} catch (Exception e) {
				System.out.println("Run err!");
			}
		}
	}

	public static void main(String[] args) {

		new Thread(new Runnable2("A")).start();
		new Thread(new Runnable2("B")).start();
	}

}
