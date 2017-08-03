class Demo1Static {
	public static void main(String[] args) {
		//Person p1 = new Person();
		//p1.name = "苍老师";
		//p1.country = "日本";					//对象调用静态
		

		//Person p2 = new Person();
		//p2.name = "小泽老师";					//非静态的只能用对象调用
		Person.country = "日本";				//类名调用静态

		//p1.speak();
		//p2.speak();

		System.out.println(Person.country);
	}
}

class Person {
	String name;								//共性用静态,特性用非静态
	static String country;						//国家

	public void speak() {
		System.out.println(name + "," +  country);
	}
}