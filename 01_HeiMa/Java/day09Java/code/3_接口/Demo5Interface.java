class Demo5Interface {
	public static void main(String[] args) {
		Dog d = new Dog("�˹�",30);
		d.eat();
		d.sleep();
		d.jump();

		System.out.println(d.getName() + "," + d.getAge());
	}
}

/*
* A:������ʾ
	* �����ࣺ���������䣬�Է���˯����
	* è�͹�
	* ������ѵ�ӿڣ�����
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
		System.out.println("����");
	}

	public void sleep() {
		System.out.println("ſ��˯");
	}

	public void jump() {
		System.out.println("����");
	}
}

