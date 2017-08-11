class Demo4Abstract {
	public static void main(String[] args) {
		Animal a = new Cat("�ӷ�",5);
		a.eat();

		System.out.println(a.getName() + "," + a.getAge());
	}
}

/*
* A:������ʾ
	* �������è����
	* ���ԣ����������䣬�Է�
	* è������:ץ����
	* ��������:����
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
}

class Cat extends Animal {
	public Cat(){}

	public Cat(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("����");
	}
}