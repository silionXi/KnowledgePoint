class ConDemo5 {
	public static void main(String[] args) {
		
	}
}

class Person {								//javabean类
	private String name;					//成员变量需要私有
	private int age;

	public Person(){}						//定义空参的构造方法

	public Person(String name, int age) {	//定义有参的构造方法
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//定义set和get成员方法
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