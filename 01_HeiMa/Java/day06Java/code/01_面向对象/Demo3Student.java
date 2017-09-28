class Demo3Student {							//测试类,包含主函数,测试类的类名要与文件名一致
	public static void main(String[] args) {
		/*
		* 创建对象并使用
		* 格式：类名 对象名 = new 类名();
		*/

		Student s = new Student();				//创建对象
		//String name = s.name;					//获取对象的属性(成员变量)
		//int age = s.age;
		//char gender = s.gender;
		s.name = "张三";
		s.age = 23;
		s.gender = '男';

		s.study();								//获取对象的行为(成员方法)
		s.sleep();

		s.name = "李四";
		s.study();
	}
}


class Student {
	/*
	* 属性:姓名,年龄,性别(成员变量)
	* 行为:学习,睡觉(成员方法)
	*/

	String name ;
	int age ;
	char gender ;

	public void study() {
		System.out.println(name + "在学习");
	}

	public void sleep() {
		System.out.println(name + "在睡觉");
	}
}