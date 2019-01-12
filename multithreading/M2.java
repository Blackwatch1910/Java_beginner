class A implements Runnable {
	public void run() {
		for (int i = 0; i < 5 ; i++ ) {
			System.out.println("Thread of class A:"+i);
		}
		System.out.println("Normal flow of class A");
	}
}

class M2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5 ; i++ ) {
			System.out.println("Normal flow "+i);
		}
		A obj = new A();
		Thread objT = new Thread(obj);
		objT.start();
	}
}