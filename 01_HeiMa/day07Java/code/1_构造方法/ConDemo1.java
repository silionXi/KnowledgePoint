class ConDemo1 {
	public static void main(String[] args) {
		Student s = new Student();					//���췽�����õ���,һ���������ִ��
		System.out.println("--------------------");
		System.out.println(s.getName() + "," + s.getAge());

		Student s2 = new Student();	
		System.out.println(s2.getName() + "," + s2.getAge());

		System.out.println("--------------------");
		Student s3 = new Student("����",25);
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

	public Student() {					//���췽��:�����������(����)���г�ʼ��
		name = "����";
		age = 23;
		System.out.println("���췽��");
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*public Student(int age, String name) {		//������Ĺ��췽�������ع�ϵ,��������
		this.name = name;
		this.age = age;
	}*/

}
