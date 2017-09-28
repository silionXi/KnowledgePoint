class Demo1Car {
	public static void main(String[] args) {
		Car c1 = new Car();					//c1是对象的名字
		//new Car();							//匿名对象

		c1.color = "red";
		c1.num = 8;
		c1.run();

		new Car().color = "blue";			//匿名对象是否可以调用属性?可以但是没有意义
		new Car().num = 4;
		new Car().run();					//匿名对象是否可以调用方法?可以

		Car c2 = new Car();
		c2.print();
		c2.print();
		new Car().print();					//匿名对象调用方法的好处,只是节省了代码
		new Car().print();					//如果对同一个方法多次调用,必须用有名字的对象
		new Car().print();					//因为匿名对象会创建多个对象,浪费空间
	}
}

class Car {
	String color;
	int num;

	public void run() {
		System.out.println(color + "," + num);
	}

	public void print() {
		System.out.println("11111111111111111111111111");
	}
}
