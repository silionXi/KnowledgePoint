/*
ѧ����
	����:����,����
	��Ϊ:ѧϰ,�Է�
��ʦ��
	����:����,����
	��Ϊ:����,�Է�
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
		System.out.println("ѧϰ");
	}

	public void eat() {
		System.out.println("ѧ���Է�");
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
		System.out.println("����");
	}

	public void eat() {
		System.out.println("��ʦ�Է�");
	}
}
