class Demo1This {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("��ѧ��");
		p.setAge(44);

		//System.out.println(p.getName() + "������:" + p.getAge() + "�ֽ�ȥ��");

		p.print();
		System.out.println(p);

		System.out.println("=========================");
		Person p2 = new Person();
		p2.print();
		System.out.println(p2);
	}
}

class Person {
	private String name;
	private int age;

	//������Ҫ�����ֻ��
	public void setName(String name) {	//name = "��ѧ��"
		this.name = name;				//this����ǰ���������
	}									//�ֲ��������Բ����ö���.����

	public String getName() {
		return name;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.println("print�����е�:" + this);
		method();
	}

	public void method() {
		System.out.println("method");
	}
	/*
	this�����������ֳ�Ա�����;ֲ���������,��this.���õ��ǳ�Ա����
	this���Ե��ó�Ա����
	*/
}
