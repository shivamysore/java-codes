package com;

class MyThread1 extends Thread
{
	public void run() {
		for(int i=0;i<=2;i++) {
			System.out.println(" Child thread1 ");
		}
	}
}

public class while_loop {

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		MyThread1 t1=new MyThread1();
		System.out.println("t Thread_id: "+t.getId());
		System.out.println("t1 Thread_id: "+t1.getId());
		System.out.println("t Thread_name: "+t.getName());
		System.out.println("t1 Thread_name: "+t.getName());
		System.out.println("t Thread_Priority: "+t.getPriority());
		System.out.println("t1 Thread_Priority: "+t.getPriority());
		t.start();
		t1.start();
		for(int i=0;i<=2;i++) {
			System.out.println(" Parent thread ");
		}
		

	}

}
