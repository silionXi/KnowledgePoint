/*
ѧ����
	����:����,����
	��Ϊ:ѧϰ,�Է�
��ʦ��
	����:����,����
	��Ϊ:����,�Է�

	ѧ������ʦ�Ĺ���
	����,����,�Է�
����(Person)
	����:����,����
	��Ϊ:�Է�
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
		System.out.println("�Է�");
	}
}

class Student extends Person {
	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void study() {
		System.out.println("ѧ��ѧϰ");
	}
}

class Teacher extends Person {
	public Teacher(){}

	public Teacher(String name,int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println("��ʦ����");
	}
}