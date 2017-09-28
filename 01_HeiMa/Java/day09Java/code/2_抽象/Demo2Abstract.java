class Demo2Abstract {
	public static void main(String[] args) {
		岳不群 小岳子 = new 岳不群();
		小岳子.自宫();
	}
}

/*
葵花宝典
*/

abstract class 葵花宝典 {
	public abstract void 自宫();			//声明一种规则,强制子类重写
}

class 岳不群 extends 葵花宝典 {
	public void 自宫() {
		System.out.println("牙签");
	}
}

class 林平之 extends 葵花宝典 {
	public void 自宫() {
		System.out.println("指甲刀");
	}
}

class 东方不败 extends 葵花宝典 {
	public void 自宫() {
		System.out.println("锤子,不忍直视");
	}
}