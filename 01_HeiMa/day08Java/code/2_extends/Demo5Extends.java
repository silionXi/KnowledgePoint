class Fu {
	static {
		System.out.println("静态代码块Fu");
	}

	{
		System.out.println("构造代码块Fu");
	}

	public Fu() {
		System.out.println("构造方法Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("静态代码块Zi");
	}

	{
		System.out.println("构造代码块Zi");
	}

	public Zi() {
		super();
		System.out.println("构造方法Zi");
	}
}


class Demo5Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		/*
		1,Demo5Extends.class加载进内存
		2,主方法进栈
		3,需要执行Zi z = new Zi();这句话,但是在内存还没有加载Zi.class
		4,Zi继承了Fu,所以Fu.class先加载进内存,同时父类的静态代码块也加载进内存
		5,Zi.class加载进内存,同时子类的静态代码块也加载进内存
		6,执行Zi类的构造方法,子类构造方法中隐藏着super,super会访问父类中的构造方法
		7,在父类构造方法执行之前,会先看是否有构造代码块,有先执行构造代码块
		8,执行父类构造方法
		9,执行子类构造方法,在执行之前会看是否有构造代码块,有先执行
		10,执行子类构造方法
		*/
	}
}