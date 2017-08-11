class Demo2DuoTai {
	public static void main(String[] args) {
		/*Fu f = new Zi();
		System.out.println(f.num);

		Zi z = new Zi();
		System.out.println(z.num);*/

		Fu f = new Zi();
		//f.print();
		f.method();
		Fu.method();
	}
}
/*
多态中的
	成员变量:编译看左边,运行看左边
	成员方法:编译看左边,运行看右边(动态绑定)
	静态的成员方法:编译看左边,运行看左边
	静态的成员方法不存在覆盖的说法

	只有非静态的成员方法,编译看左边(父类)运行看右边(子类)
*/
class Fu {
	int num = 10;

	public void print() {
		System.out.println("Fu");
	}

	public static void method() {
		System.out.println("Fu static");
	}
}

class Zi extends Fu {
	int num = 20;

	public void print() {
		System.out.println("Zi");
	}

	public static void method() {
		System.out.println("Zi static");
	}
}
