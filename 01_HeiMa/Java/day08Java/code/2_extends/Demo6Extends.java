class Demo6Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}

class Fu {
	public void show1() {
		System.out.println("show1");
	}
}

class Zi extends Fu {
	
	public void show1() {						//方法的复写(重写)
		super.show1();							//语句都需要定义在方法中
		System.out.println("Zi show1");			//如果子父类方法构成重写,想访问父类的方法需要用super.
	}

	public void show2() {
		System.out.println("show2");
	}

}
