class Demo6 {
	public static void main(String[] args) {
		//Cat c = new Cat();
		//Animal a = c;
		Animal a = new Cat();

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

	public void catchMouse() {
		
	}
}
