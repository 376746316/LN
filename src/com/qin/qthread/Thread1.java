package com.qin.qthread;

public class Thread1 extends Thread {

	//声明变量》线程名字
	private String name;

	//构造器
	public Thread1(String name) {
		this.name = name;
	}

	//run（）
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行  :  " + i);
			try {
				// 休眠
				int J = (int) (Math.random() * 10);
				// System.out.println("J:==================>>>"+J);
				sleep(J);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread1 mTh1 = new Thread1("A");
		Thread1 mTh2 = new Thread1("B");
		mTh1.start();
		mTh2.start();

	}

}
