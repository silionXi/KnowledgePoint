class Demo7Extends {
	public static void main(String[] args) {
		Iphone4s i = new Iphone4s();			//创建子类对象,先从子类找方法,如果没有找父类的
		i.siri();
		i.call();
	}
}

class Iphone4 {
	public void siri() {
		System.out.println("speak english");
	}

	public void call() {
		System.out.println("call");
	}

	public Iphone4(){}
}

class Iphone4s extends Iphone4 {
	public void siri() {
		super.siri();
		System.out.println("说中文");
	}

	public Iphone4s(){
		super();					//super()语句和this()语句必须放在构造方法中
	}
}
