class Demo3 {
	public static void main(String[] args) {
		Animal a = new Animal(){
			public void run() {
				System.out.println("����");
			}
		};
		a.run();
	}
}

class Animal {
	public void run() {
		System.out.println("������");
	}
}
