class Demo1DuoTai {
	public static void main(String[] args) {
		Cat c = new Cat();
		//c.eat();

		Animal a = new Cat();					//��������ָ���������
		a.eat();

		Animal a2 = new Dog();
		//a2.eat();

		/*
		��̬������ǰ��
		1,�̳�
		2,Ҫ����д
		3,��������ָ���������
		*/
	}
}

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}
}
