class ConDemo3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(23);

		System.out.println(s1.getName() + "," + s1.getAge());

		Student s2 = new Student("����",24);
		//s2 = new Student("����",25);			//�¶���ԭ������ĵ�ֵַ����,ԭ����������
		s2.setName("����");
		s2.setAge(25);
		System.out.println(s2.getName() + "," + s2.getAge());

		/*
		���췽����setXxx����������
		1,���췽���������������е����Խ��г�ʼ����
		2,setXxx�������޸�����ֵ��,��ԭ����Ļ�����
		*/
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
	
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

