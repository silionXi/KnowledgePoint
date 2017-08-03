class Demo1This {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("王学兵");
		p.setAge(44);

		//System.out.println(p.getName() + "年龄是:" + p.getAge() + "又进去了");

		p.print();
		System.out.println(p);

		System.out.println("=========================");
		Person p2 = new Person();
		p2.print();
		System.out.println(p2);
	}
}

class Person {
	private String name;
	private int age;

	//变量名要求见名只意
	public void setName(String name) {	//name = "王学兵"
		this.name = name;				//this代表当前对象的引用
	}									//局部变量绝对不能用对象.调用

	public String getName() {
		return name;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.println("print方法中的:" + this);
		method();
	}

	public void method() {
		System.out.println("method");
	}
	/*
	this可以用来区分成员变量和局部变量重名,用this.调用的是成员变量
	this可以调用成员方法
	*/
}
