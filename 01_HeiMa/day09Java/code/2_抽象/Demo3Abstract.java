class Demo3Abstract {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.print();					//直接调用子类中的print方法
		z.method();
		Fu f = new Zi();
		f.print();					//编译看父类,运行看子类
		f.method();
	}
}

abstract class Fu {
	public abstract void print();	//抽象方法必须有子类重写后使用

	public void method() {			//非抽象方法子类可以直接继承用
		System.out.println("Hello World!");
	}
}

class Zi extends Fu {
	public void print() {
		System.out.println("Zi");
	}
}