/*
学生类
	属性:姓名,年龄
	行为:学习,吃饭
老师类
	属性:姓名,年龄
	行为:讲课,吃饭
*/
class Demo9Extends {
	public static void main(String[] args) {
		
	}
}

class Student {
	private String name;
	private int age;

	public Student(){}

	public Student(String name,int age) {
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

	public void study() {
		System.out.println("学习");
	}

	public void eat() {
		System.out.println("学生吃饭");
	}
}

class Teacher {
	private String name;
	private int age;

	public Teacher(){}

	public Teacher(String name,int age) {
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

	public void teach() {
		System.out.println("讲课");
	}

	public void eat() {
		System.out.println("老师吃饭");
	}
}
