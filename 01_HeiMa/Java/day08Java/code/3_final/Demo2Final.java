class Demo2Final {
	public static void main(String[] args) {
		final int num = 10;				//final���λ����������ͱ������ı���ֵ
		System.out.println(num);

		final Person p1 = new Person("����",23);//0x0011
		//p1 = new Person("����",24);//0x0022
		p1.setName("����");				//final���������������ͱ������ı����ֵַ
		p1.setAge(24);					//���ǿ��Ըı���������ֵ

		System.out.println(p1.getName() + "," + p1.getAge());
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
}