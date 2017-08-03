class Demo4Phone {
	public static void main(String[] args) {
		Phone p = new Phone();						//创建对象在最后有小括号
		p.brand = "三星";							//调用属性的时候后面没有括号
		p.price = 14999;
		p.color = "天空灰";

		p.call();									//调用方法的时候后面有括号

		System.out.println("我是一部" + p.brand + "手机,价格是:" + p.price + ",颜色是:" + p.color);
	}
}

/*
 属性:品牌(brand)价格(price)
* 行为:打电话(call),发信息(sendMessage)玩游戏(playGame)
*/

class Phone {
	String brand;
	int price;
	String color;

	public void call() {
		System.out.println("打电话");
	}

	public void sendMessage() {
		System.out.println("发信息");
	}

	public void playGame() {
		System.out.println("玩游戏");
	}
}