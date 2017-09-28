class ConDemo3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(23);

		System.out.println(s1.getName() + "," + s1.getAge());

		Student s2 = new Student("李四",24);
		//s2 = new Student("李五",25);			//新对象将原来对象的地址值覆盖,原对象变成垃圾
		s2.setName("李五");
		s2.setAge(25);
		System.out.println(s2.getName() + "," + s2.getAge());

		/*
		构造方法和setXxx方法的区别
		1,构造方法是用来给对象中的属性进行初始化的
		2,setXxx是用来修改属性值的,在原对象的基础上
		*/
	}
}

class Student {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Student() {					//构造方法:给对象的数据(属性)进行初始化
	
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

