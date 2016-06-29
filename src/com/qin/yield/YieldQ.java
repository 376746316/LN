package com.qin.yield;

/**
 * sleep()和yield()的区别):sleep()使当前线程进入停滞状态，所以执行sleep()的线程在指定的时间内肯定不会被执行；yield()
 * 只是使当前线程重新回到可执行状态，所以执行yield()的线程有可能在进入到可执行状态后马上又被执行。
 * 
 * @author 秦先生 sleep一定会暂停当前Thread，sleep可能会让优先级较低的线程执行（yield都不会）
 */
public class YieldQ extends Thread {

	// private String name;

	public YieldQ(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "------RunNing!" + i);
			if (i == 10) {
				this.yield();
			}
		}
	}

	public static void main(String[] args) {
		new YieldQ("A").start();
		new YieldQ("B").start();
	}
}
