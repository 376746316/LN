package com.qin.qthread.join;

/**
 * add join、主线程会等待子线程执行完毕，并且也会拿到子线程的数据
 * 
 * @author 秦先生
 *
 */
public class Addjoin extends Thread {
	private String name;

	public Addjoin(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName() + "子线程开始");
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "线程" + i);
			try {
				sleep((int) (Math.random() * 10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "子线程结束");
	}

	public static void main(String[] args) {
		System.out.println("Main线程开始");
		Addjoin addjoinA = new Addjoin("A");
		Addjoin addjoinB = new Addjoin("B");
		addjoinA.start();
		addjoinB.start();

		try {
			addjoinA.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			addjoinB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main线程结束");
	}

}
