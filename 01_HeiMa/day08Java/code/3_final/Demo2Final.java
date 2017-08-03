class Demo2Final {
	public static void main(String[] args) {
		final int num = 10;				//final修饰基本数据类型变量不改变其值
		System.out.println(num);

		final Person p1 = new Person("张三",23);//0x0011
		//p1 = new Person("李四",24);//0x0022
		p1.setName("李四");				//final修饰引用数据类型变量不改变其地址值
		p1.setAge(24);					//但是可以改变对象的属性值

		System.out.println(p1.getName() + "," + p1.getAge());
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
}