package com.qin.qthread;

public class ThreadCon extends Thread {

	private String name;
	private int content = 5;

	public ThreadCon(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + ":运行" + content--);
			try {
				sleep((int) (1 + Math.random() * 10));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new ThreadCon("A").start();
		new ThreadCon("B").start();
	}

}
