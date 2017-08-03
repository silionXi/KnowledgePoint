/*
学生类
	属性:姓名,年龄
	行为:学习,吃饭
老师类
	属性:姓名,年龄
	行为:讲课,吃饭

	学生和老师的共性
	姓名,年龄,吃饭
人类(Person)
	属性:姓名,年龄
	行为:吃饭
*/
class Demo10Extends {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class Person {
	private String name;
	private int age;

	public Person(){}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

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

	public void eat() {
		System.out.println("吃饭");
	}
}

class Student extends Person {
	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void study() {
		System.out.println("学生学习");
	}
}

class Teacher extends Person {
	public Teacher(){}

	public Teacher(String name,int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println("老师讲课");
	}
}