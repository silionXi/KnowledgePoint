/*
final是最终的
final可以修饰类,方法和变量
final修饰的类,不可以被继承(丁克家庭)
final修饰的方法,不可以被重写
final修饰的变量,又称之为常量
*/
class Demo1Final {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.method();
	}
}

/*final class Fu {
	public  void method() {
		System.out.println("访问底层文件");
	}
}*/

class Zi /*extends Fu*/ {
	final double PI = 3.14;
	public void method() {
		System.out.println("哈哈,被我干掉了");
	}
}
