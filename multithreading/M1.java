class A extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) 
			System.out.println("Thread of class A:"+i);

		System.out.println("Normal flow of class A");
	}
}

class B extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) 
			System.out.println("Thread of class B:"+i);

		System.out.println("Normal flow of class B");
	}
}

class M1
{
	public static void main(String[] args) {
		A obja = new A();	//newborn state of thread A
		B objb = new B();	//newborn state of thread B
		obja.start();
		objb.start();
	}
}