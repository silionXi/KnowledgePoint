class Demo4Extends {
	public static void main(String[] args) {
		//Student s = new Student("����",23);
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
		//super("����",24);					//���캯������superûthis,��thisûsuper
											//this��super��������ڹ��캯���ĵ�һ��
											//��������������Ҫ���ʸ���Ĺ��캯��
		this("����",24);					//���ñ��������Ĺ��췽��
	}

	public Student(String name,int age) {	//name ����,age 24
		super(name,age);
	}

}