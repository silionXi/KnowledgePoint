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

abstract class Animal {						//������
	int num = 10;
	public abstract void eat();				//���󷽷�

	public void sleep() {					//�������ǲ��ܱ�ʵ����(��������)
		System.out.println("����˯��");
	}

	public Animal() {
		
	}
}

 class Cat extends Animal {
	public Cat(){
		super();
	}
	public void eat() {
		System.out.println("����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("����");
	}
}
