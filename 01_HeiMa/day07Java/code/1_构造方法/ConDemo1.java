class ConDemo1 {
	public static void main(String[] args) {
		Student s = new Student();					//构造方法不用调用,一创建对象就执行
		System.out.println("--------------------");
		System.out.println(s.getName() + "," + s.getAge());

		Student s2 = new Student();	
		System.out.println(s2.getName() + "," + s2.getAge());

		System.out.println("--------------------");
		Student s3 = new Student("王五",25);
		System.out.println(s3.getName() + "," + s3.getAge());
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
		name = "张三";
		age = 23;
		System.out.println("构造方法");
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*public Student(int age, String name) {		//与上面的构造方法是重载关系,开发不用
		this.name = name;
		this.age = age;
	}*/

}
