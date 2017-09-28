class Demo5Person {
	public static void main(String[] args) {
		Person p = new Person();				//创建对象
		p.name = "张三";						//获取对象中的属性并赋值
		p.age = 23;

		p.speak();

		Person p2 = new Person();				//创建另一个对象
		p2.name = "李四";
		p2.age = 24;

		p2.speak();

		//System.out.println(p.name);

		Person p3 = p2;
		p3.speak();
	}
}

class Person {
	String name;
	int age;

	public void speak() {
		System.out.println(name + "," +  age);
	}
}
