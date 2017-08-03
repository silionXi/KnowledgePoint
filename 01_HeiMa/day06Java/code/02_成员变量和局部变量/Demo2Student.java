class Demo2Student {
	public static void main(String[] args) {
		Test1 t = new Test1();
		//Student stu = new Student();				//s = 0x0011
		//t.run(stu);

		Student stu = t.aaa();						//s = 0x0022
		int x = t.xxx();
	}
}

class Student {
	String name;
	int age;

	public void speak() {
		System.out.println(name + "," +  age);
	}
}

class Test1 {
	public void run(Student s) {			//参数是引用数据类型,调用这个方法时传递的是该类的对象
		System.out.println("run");
	}

	public Student aaa() {					//返回值类型是引用数据类型,返回的就是该类对象
		Student s = new Student();			//s = 0x0022
		return s;
	}

	public int xxx() {
		int x = 10;
		return x;
	}

	public String bbb() {
		return "aaa";
	}
}
