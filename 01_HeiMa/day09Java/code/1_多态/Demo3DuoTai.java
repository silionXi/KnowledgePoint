class Demo3DuoTai {
	public static void main(String[] args) {
		Person p = new SuperMan();				//父类引用指向子类对象(自动类型提升,向上转型)
		System.out.println(p.name);

		p.谈生意();
		
		SuperMan sm = (SuperMan)p;				//向下转型
		sm.fly();
	}
}
class Person {
	String name = "约翰";
	public void 谈生意() {
		System.out.println("谈生意");
	}
}

class SuperMan extends Person {
	String name = "超人";

	public void 谈生意() {
		System.out.println("谈几个亿的大单子");
	}

	public void fly() {
		System.out.println("飞出去救人");
	}
}