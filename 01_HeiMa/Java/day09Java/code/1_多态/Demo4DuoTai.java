class Demo4DuoTai {
	public static void main(String[] args) {
		榨汁机 z = new 榨汁机();
		z.run(new 苹果());
		z.run(new 橙子());
	}
}

class 水果 {
	public void 榨汁() {
		System.out.println("榨水果汁儿");
	}
}

class 苹果 extends 水果 {
	public void 榨汁() {
		System.out.println("榨了一杯苹果汁儿");
	}
}

class 橙子 extends 水果 {
	public void 榨汁() {
		System.out.println("榨了一杯橙子汁儿");
	}
}

class 榨汁机 {
	/*public void run(苹果 a) {		//苹果 a = new 苹果();
		a.榨汁();
	}

	public void run(橙子 o) {		
		o.榨汁();
	}*/

	public void run(水果 f) {		//水果 f = new 苹果();
		f.榨汁();
	}
}