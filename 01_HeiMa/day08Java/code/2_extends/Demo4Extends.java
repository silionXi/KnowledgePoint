class Demo4Extends {
	public static void main(String[] args) {
		//Student s = new Student("张三",23);
		Student s = new Student();
		System.out.println(s.getName() + "," + s.getAge());
	}
}

class Person {
	private String name;
	private int age;

	/*public Person() {
	
	}*/

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
}

class Student extends Person {
	public Student() {
		//super("李四",24);					//构造函数中有super没this,有this没super
											//this和super语句必须放在构造函数的第一行
											//无论如何子类必须要访问父类的构造函数
		this("李四",24);					//调用本类其他的构造方法
	}

	public Student(String name,int age) {	//name 李四,age 24
		super(name,age);
	}

}