class Demo1DuoTai {
	public static void main(String[] args) {
		Cat c = new Cat();
		//c.eat();

		Animal a = new Cat();					//父类引用指向子类对象
		a.eat();

		Animal a2 = new Dog();
		//a2.eat();

		/*
		多态的三个前提
		1,继承
		2,要有重写
		3,父类引用指向子类对象
		*/
	}
}

class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}
}
