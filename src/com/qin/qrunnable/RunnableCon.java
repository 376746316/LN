package com.qin.qrunnable;

public class RunnableCon implements Runnable {

	private int content = 15;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 获取当前线程的name
			System.out.println(Thread.currentThread().getName() + "运行：" + content--);
			try {
				Thread.sleep((int) (Math.random() * 10));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		RunnableCon conmy = new RunnableCon();
		new Thread(conmy, "E").start();
		new Thread(conmy, "F").start();
		new Thread(conmy, "G").start();
	}

}
