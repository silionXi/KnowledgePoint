class Demo1Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "dayone";
		//p.age = -17;
		p.setAge(-17);
		System.out.println(p.getAge());
	}
}

class Person {
	String name;
	private int age;							//private˽��,ֻ���ڱ������

	public void speak() {
		System.out.println(name + "," +  age);
	}

	/*
	�����ṩ�����ķ��ʷ���,�ֱ���setXxx()��getXxx()
	*/
	public void setAge(int a) {
		if (a > 0 && a < 200) {
			age = a;
		}else {
			System.out.println("�ػ��ǰ�");
		}
		
	}

	public int getAge() {
		return age;
	}
}
