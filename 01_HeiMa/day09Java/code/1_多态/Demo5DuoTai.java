class Demo5DuoTai {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		//a.catchMouse();				//���ܵ����������еķ���
		Cat c = (Cat)a;					//����ת��
		c.catchMouse();
	}
}

class Animal { 
	public void eat() {
		System.out.println("�Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("����");
	}

	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("����");
	}

	public void lookHome() {
		System.out.println("����");
	}
}