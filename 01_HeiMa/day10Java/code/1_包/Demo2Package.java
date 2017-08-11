package cn.itcast;								//包名要放在第一行,分号结束
//import com.heima.*;								//将这个包下所有的类可见
//import com.heima.Person;
import com.baidu.Student;
class Demo2Package {
	public static void main(String[] args) {
		//Person p1 = new Person("张三",23);

		//System.out.println(p1.getName() + "," + p1.getAge());
		Student s1 = new Student("李四",24);
		s1.print();
	}
}
