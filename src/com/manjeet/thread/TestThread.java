package com.manjeet.thread;

public class TestThread {

	public static void main(String[] args) {
		System.out.println("Main in TestThread");
		
		Thread t=Thread.currentThread();
		System.out.println("Thread::"+t);
		
		String tname=t.getName();
		System.out.println("Thread Name::"+tname);
		
		System.out.println(Thread.currentThread().getName()+"..."+Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(t.getPriority());
		
		Thread th=new Thread();
		System.out.println(th);
		System.out.println("Thread before set Priority::"+th.getPriority());
		th.setPriority(10);
		System.out.println(th);
		System.out.println("Thread after set Priority::"+th.getPriority());
		
		System.out.println(".........");
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
	}
}
