class Demo1Static {
	public static void main(String[] args) {
		//Person p1 = new Person();
		//p1.name = "����ʦ";
		//p1.country = "�ձ�";					//������þ�̬
		

		//Person p2 = new Person();
		//p2.name = "С����ʦ";					//�Ǿ�̬��ֻ���ö������
		Person.country = "�ձ�";				//�������þ�̬

		//p1.speak();
		//p2.speak();

		System.out.println(Person.country);
	}
}

class Person {
	String name;								//�����þ�̬,�����÷Ǿ�̬
	static String country;						//����

	public void speak() {
		System.out.println(name + "," +  country);
	}
}