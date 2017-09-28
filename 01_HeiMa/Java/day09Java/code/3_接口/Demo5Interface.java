class Demo5Interface {
	public static void main(String[] args) {
		Dog d = new Dog("八公",30);
		d.eat();
		d.sleep();
		d.jump();

		System.out.println(d.getName() + "," + d.getAge());
	}
}

/*
* A:案例演示
	* 动物类：姓名，年龄，吃饭，睡觉。
	* 猫和狗
	* 动物培训接口：跳高
*/
abstract class Animal {
	private String name;
	private int age;

	public Animal(){}

	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public abstract void eat();

	public abstract void sleep();
}

interface Jump {
	public void jump();
}

class Dog extends Animal implements Jump {
	public Dog(){}

	public Dog(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("吃肉");
	}

	public void sleep() {
		System.out.println("趴着睡");
	}

	public void jump() {
		System.out.println("跳高");
	}
}

