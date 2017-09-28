class Demo3Interface {
	public static void main(String[] args) {
		/*DemoE d = new DemoE();
		d.method();
		d.show();*/

		DemoG d = new DemoG();
	}
}

/*
类与类,类与接口,接口与接口的关系
*/

interface DemoA {
	public void show();
} 

interface DemoB {
	public void method();
}

abstract class DemoC {
	public abstract void print();
}

/*class DemoD extends DemoC {				//类与类之间是继承关系,只能单继承
}*/

/*class DemoE implements DemoA,DemoB {		//类与接口直接是实现关系,既可以单实现也可以多实现
	public void show() {
		System.out.println("show");
	}

	public void method() {
		System.out.println("method");
	}
}*/

interface DemoF extends DemoA,DemoB{		//接口和接口直接是继承关系,既可以单继承也可以多继承

}

class DemoG implements DemoF {
	public void show() {
		System.out.println("show");
	}

	public void method() {
		System.out.println("method");
	}
}