class ConDemo5 {
	public static void main(String[] args) {
		
	}
}

class Person {								//javabean��
	private String name;					//��Ա������Ҫ˽��
	private int age;

	public Person(){}						//����ղεĹ��췽��

	public Person(String name, int age) {	//�����вεĹ��췽��
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//����set��get��Ա����
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