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
	private int age;							//private私有,只能在本类访问

	public void speak() {
		System.out.println(name + "," +  age);
	}

	/*
	对外提供公共的访问方法,分别是setXxx()和getXxx()
	*/
	public void setAge(int a) {
		if (a > 0 && a < 200) {
			age = a;
		}else {
			System.out.println("回火星吧");
		}
		
	}

	public int getAge() {
		return age;
	}
}
