package com.qin.qrunnable;

public class Runnable1 implements Runnable {

	private String name;

	public Runnable1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行" + i);
			try {
				// 需要调用Thread的sleep方法
				Thread.sleep((int) (1 + Math.random() * 10));
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		// 需要调用Thread的启动方法
		new Thread(new Runnable1("A")).start();
		new Thread(new Runnable1("B")).start();
	}
}
