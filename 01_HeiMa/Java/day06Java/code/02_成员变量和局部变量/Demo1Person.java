class Demo1Person {
	public static void main(String[] args) {
		Person p = new Person();			//��������
		p.name = "����";					//���������Ը�ֵ
		p.age = 23;

		p.speak(20);
	}
}

class Person {
	String name;							//����������,������,��Ա����
	int age;

	public void speak(int y) {				//�����ڷ�����,�ֲ�����
		int x = 10;							//�����ڷ�����,�ֲ�����
		int age = 30;						//java���оͽ�ԭ��
		System.out.println(name+ "," + age);

		System.out.println(x + "," + y);
	}
}
