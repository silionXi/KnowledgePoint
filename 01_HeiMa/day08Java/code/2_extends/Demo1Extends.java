class Demo1Extends {
	/*
	 B:�̳а�����ʾ��
	* ������,è��,����
	* ������������(��ɫ,�ȵĸ���)��������(�Է���˯��)
	*/
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.color = "��";
		d.leg = 2;

		System.out.println(d.color + "," + d.leg);
	}
}

class Animal {
	String color;
	int leg;

	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}

class Cat extends Animal {
	/*String color;
	int leg;

	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}*/
}

class Dog extends Animal {
	
}
