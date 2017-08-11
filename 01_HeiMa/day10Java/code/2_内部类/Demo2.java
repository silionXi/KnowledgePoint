class Demo2 {
	public static void main(String[] args) {
		Outer.Inner2 oi = new Outer.Inner2();
	}
}

class Outer {
	class Inner {
		public void print() {
			System.out.println("Hello World!");
		}
	}

	static class Inner2 {
		public static void method() {
			System.out.println("Hello World!");
		}
	}

	public void run() {
		int num = 10;
		class Inner3 {
			public void print() {
				System.out.println(num);
			}
		}
	}
}