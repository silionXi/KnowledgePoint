class ConDemo2 {
	public static void main(String[] args) {
		Student s = new Student("����",23);
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
	
	/*1.�����һ������û�ж��幹�췽��,ϵͳ��Ĭ�ϸ�һ���ղεĹ��췽��
	��ʽ��:public ����(Student)(){}
	2,��������вι��캯��,û�ж���ղι��캯��,ϵͳ����Ĭ���ٸ��ղι��캯��
	3,�ղ�ʲô��,�в�ʲô��?
		a �вεĹ��캯������Ϊ�˸������е����Խ��г�ʼ���õ�
		b �ղ��ڲ���Ҫ�����Խ��г�ʼ��,���ǻ�Ҫ���������ʱ��ʹ��
	4,�������вι��캯��,Ҫ��Ҫ�ٶ���ղε���?
		����ѿղεļ���,Ϊ�˴�������,���ó�Աʹ��
	*/
	public Student() {					//���췽��:�����������(����)���г�ʼ��
		/*name = "����";
		age = 23;
		System.out.println("���췽��");*/
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
