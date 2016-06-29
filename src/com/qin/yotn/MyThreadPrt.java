package com.qin.yotn;

public class MyThreadPrt implements Runnable {

	private String name;
	private Object prev;
	private Object self;

	public MyThreadPrt(String name, Object prev, Object self) {
		super();
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.println(name + count);
					count--;

					self.notify();
				}
				try {
					prev.wait();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();

		MyThreadPrt pa = new MyThreadPrt("A", c, a);
		MyThreadPrt pb = new MyThreadPrt("B", a, b);
		MyThreadPrt pc = new MyThreadPrt("C", b, c);

		new Thread(pa).start();
		Thread.sleep(100);
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);
	}

}
