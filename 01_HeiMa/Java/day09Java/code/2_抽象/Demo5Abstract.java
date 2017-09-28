class Demo5Abstract {
	public static void main(String[] args) {
		Teacher t = new BaseTeacher("冯佳",32);
		t.teach();
	}
}

/*
* A:案例演示
	* 具体事物：基础班老师，就业班老师
	* 共性：姓名，年龄，讲课。
*/
abstract class Teacher {
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

	public abstract void teach();
}

class BaseTeacher extends Teacher {
	public BaseTeacher(){}

	public BaseTeacher(String name,int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println("我的名字是:" +  this.getName() + ",我的年龄是:" + getAge() + ",我讲的javase");
	}
}	