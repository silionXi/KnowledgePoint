class Demo1Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();
		//a.eat();

		//Animal a = new Cat();
		//a.eat();

		Cat c = new Cat();
		c.eat();

		Dog d = new Dog();
		d.eat();

		System.out.println(c.num);
	}
}

abstract class Animal {						//抽象类
	int num = 10;
	public abstract void eat();				//抽象方法

	public void sleep() {					//抽象类是不能被实例化(创建对象)
		System.out.println("动物睡觉");
	}

	public Animal() {
		
	}
}

 class Cat extends Animal {
	public Cat(){
		super();
	}
	public void eat() {
		System.out.println("吃鱼");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃肉");
	}
}
