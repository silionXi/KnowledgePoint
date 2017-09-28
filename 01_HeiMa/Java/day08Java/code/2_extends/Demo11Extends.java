/*
* A:猫狗案例分析
* B:案例演示
	* 猫狗案例继承版

	猫类:
		属性:颜色,腿的个数
		行为:吃饭,抓老鼠
	狗类:
		属性:颜色,腿的个数
		行为:吃饭,看家
	动物类:
		相同的属性和行为
		属性:颜色,腿的个数
		行为:吃饭

	1,定义属性(私有)
	2,定义空参和有参构造(构造是没有返回值类型)
	3,setXxx和getXxx方法(根据属性)
	4,定义行为(方法)
*/
class Demo11Extends {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setColor("花");
		d1.setLeg(4);

		System.out.println(d1.getColor() + "," + d1.getLeg());

		Dog d2 = new Dog("黑",2);
		System.out.println(d2.getColor() + "," + d2.getLeg());
	}
}

class Animal {
	private String color;
	private int leg;

	public Animal(){}

	public Animal(String color,int leg) {
		this.color = color;
		this.leg = leg;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public int getLeg() {
		return leg;
	}

	public void eat() {
		System.out.println("吃饭");
	}
}

class Cat extends Animal {
	public Cat(){}

	public Cat(String color,int leg) {
		super(color,leg);
	}

	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {
	public Dog(){}

	public Dog(String color,int leg) {
		super(color,leg);
	}

	public void lookHome() {
		System.out.println("看家");
	}
}