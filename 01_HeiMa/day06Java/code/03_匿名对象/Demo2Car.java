class Demo2Car {
	public static void main(String[] args) {
		//Car c1 = new Car();
		/*c1.color = "black";
		c1.num = 4;
		c1.run();*/
		//method(c1);

		method(new Car());					//匿名对象可以当作参数传递

		Car c2 = new Car();
		/*c2.color = "black";
		c2.num = 4;
		c2.run();*/
		method(c2);
	}

	public static void method(Car cc) {		//Car cc = new Car();
		cc.color = "black";
		cc.num = 4;
		cc.run();
	}
}

class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color + "," + num);
	}
}
