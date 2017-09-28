class Demo2InnerClass {
	public static void main(String[] args) {
		//外部类名.内部类名 对象名 = 外部类名.内部类对象;
		/*Outer.Inner oi = new Outer.Inner();
		oi.print();

		Outer.Inner.method();*/

	}
}

class Outer {
	static class Inner {
		public void print() {
			System.out.println("Hello World!");
		}

		public static void method() {
			System.out.println("method");
		}
	}

	/*class Inner2 {							//非静态的成员内部类中不可以定义静态的成员
		public static void run() {
			System.out.println("run");
		}
	}*/
}