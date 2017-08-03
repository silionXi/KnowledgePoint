class Demo2Static {
	public static void main(String[] args) {
		//Test t = new Test();
		//t.print1();

		Test.print2();
		//method();								//method方法是静态的,直接能调用,是因为系统会默认加上类名.
		Demo2Static.method();
	}

	public static void method() {
		System.out.println();
	}
}

class Test {
	int num1 = 10;
	static int num2 = 20;

	/*public void print1() {					//非静态的成员方法可以访问静态的成员
		System.out.println(num1);
		System.out.println(num2);
	}*/

	public static void print2() {				//静态方法不能访问非静态的成员
		//System.out.println(this.num1);
		System.out.println(num2);				//静态只能访问静态
	}
}
