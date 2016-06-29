package com.qin.qthread.join;

/**
 * 无join，主线程不会等待子线程执行完毕
 * 
 * @author 秦先生
 *
 */
public class Nojoin extends Thread {

	private String name;

	/**
	 * Thread.currentThread().getName()获取super（）的值
	 * 
	 * @param name
	 * 
	 *            this.name = name;是本类直接使用的值
	 */
	public Nojoin(String name) {
		// 必须重写supper，否则getName拿不到
		super(name);
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "子线程开始");
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行" + i);
			try {
				sleep((int) (Math.random() * 10));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(Thread.currentThread().getName() + "子线程结束");
	}

	public static void main(String[] args) {
		System.out.println("主线程开始");
		new Nojoin("A").start();
		new Nojoin("B").start();

		System.out.println("主线程结束");
	}

}
