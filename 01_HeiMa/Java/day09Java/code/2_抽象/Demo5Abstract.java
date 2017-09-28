class Demo5Abstract {
	public static void main(String[] args) {
		Teacher t = new BaseTeacher("���",32);
		t.teach();
	}
}

/*
* A:������ʾ
	* ���������������ʦ����ҵ����ʦ
	* ���ԣ����������䣬���Ρ�
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
		System.out.println("�ҵ�������:" +  this.getName() + ",�ҵ�������:" + getAge() + ",�ҽ���javase");
	}
}	