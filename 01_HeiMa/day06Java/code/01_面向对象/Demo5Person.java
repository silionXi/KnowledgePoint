class Demo5Person {
	public static void main(String[] args) {
		Person p = new Person();				//��������
		p.name = "����";						//��ȡ�����е����Բ���ֵ
		p.age = 23;

		p.speak();

		Person p2 = new Person();				//������һ������
		p2.name = "����";
		p2.age = 24;

		p2.speak();

		//System.out.println(p.name);

		Person p3 = p2;
		p3.speak();
	}
}

class Person {
	String name;
	int age;

	public void speak() {
		System.out.println(name + "," +  age);
	}
}
