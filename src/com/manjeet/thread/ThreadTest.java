package com.manjeet.thread;

public class ThreadTest {

	public static void main(String[] args) {
		HiThread t=new HiThread();
		HelloThread ht=new HelloThread();
		//t.start();
	
	}
}
 class HiThread extends Thread{
	 
	 public HiThread() {
		 super();
		 start();
	 }
	 
	 @Override
	 public void run() {
		 System.out.println("Run method in HiTest class Thread");
		 for(int i=0; i<10; i++) {
			 System.out.println(Thread.currentThread().getName()+"under the ThreadGroup of "+Thread.currentThread().getThreadGroup().getName());
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 }
	 }
 }
 
 class HelloThread implements Runnable{

	 public HelloThread() {
		 Thread t1=new Thread(this);
		 t1.start();
	 }
	@Override
	public void run() {
		System.out.println("Run method in HelloThread class Thread");
		 for(int i=0; i<10; i++) {
			 System.out.println(Thread.currentThread().getName()+"under the ThreadGroup of "+Thread.currentThread().getThreadGroup().getName());
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
 }
 }
 