class Demo1Person {
	public static void main(String[] args) {
		Person p = new Person();			//创建对象
		p.name = "张三";					//给对象属性赋值
		p.age = 23;

		p.speak(20);
	}
}

class Person {
	String name;							//定义在类中,方法外,成员变量
	int age;

	public void speak(int y) {				//定义在方法上,局部变量
		int x = 10;							//定义在方法内,局部变量
		int age = 30;						//java中有就近原则
		System.out.println(name+ "," + age);

		System.out.println(x + "," + y);
	}
}
