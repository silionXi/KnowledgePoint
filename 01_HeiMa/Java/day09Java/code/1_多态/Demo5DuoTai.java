class Demo5DuoTai {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		//a.catchMouse();				//不能调用子类特有的方法
		Cat c = (Cat)a;					//向下转型
		c.catchMouse();
	}
}

class Animal { 
	public void eat() {
		System.out.println("吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("吃鱼");
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃肉");
	}

	public void lookHome() {
		System.out.println("看家");
	}
}