class ConDemo2 {
	public static void main(String[] args) {
		Student s = new Student("张三",23);
		Test t = new Test();
		t.print();
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
	
	/*1.如果在一个类中没有定义构造方法,系统会默认给一个空参的构造方法
	格式是:public 类名(Student)(){}
	2,如果定义有参构造函数,没有定义空参构造函数,系统不会默认再给空参构造函数
	3,空参什么用,有参什么用?
		a 有参的构造函数就是为了给对象中的属性进行初始化用的
		b 空参在不需要给属性进行初始化,但是还要创建对象的时候使用
	4,定义了有参构造函数,要不要再定义空参的呢?
		建议把空参的加上,为了创建对象,调用成员使用
	*/
	public Student() {					//构造方法:给对象的数据(属性)进行初始化
		/*name = "张三";
		age = 23;
		System.out.println("构造方法");*/
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Test {
	public void print() {
		System.out.println("print");
	}
}
