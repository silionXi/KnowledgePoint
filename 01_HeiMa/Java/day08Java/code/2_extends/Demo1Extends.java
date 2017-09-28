class Demo1Extends {
	/*
	 B:继承案例演示：
	* 动物类,猫类,狗类
	* 定义两个属性(颜色,腿的个数)两个功能(吃饭，睡觉)
	*/
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.color = "黑";
		d.leg = 2;

		System.out.println(d.color + "," + d.leg);
	}
}

class Animal {
	String color;
	int leg;

	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
}

class Cat extends Animal {
	/*String color;
	int leg;

	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}*/
}

class Dog extends Animal {
	
}
