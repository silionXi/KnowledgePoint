class Demo3Student {							//������,����������,�����������Ҫ���ļ���һ��
	public static void main(String[] args) {
		/*
		* ��������ʹ��
		* ��ʽ������ ������ = new ����();
		*/

		Student s = new Student();				//��������
		//String name = s.name;					//��ȡ���������(��Ա����)
		//int age = s.age;
		//char gender = s.gender;
		s.name = "����";
		s.age = 23;
		s.gender = '��';

		s.study();								//��ȡ�������Ϊ(��Ա����)
		s.sleep();

		s.name = "����";
		s.study();
	}
}


class Student {
	/*
	* ����:����,����,�Ա�(��Ա����)
	* ��Ϊ:ѧϰ,˯��(��Ա����)
	*/

	String name ;
	int age ;
	char gender ;

	public void study() {
		System.out.println(name + "��ѧϰ");
	}

	public void sleep() {
		System.out.println(name + "��˯��");
	}
}