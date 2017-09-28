class Demo2This {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setBrand("锤子");
		p.setPrice(2480);
		p.setColor("白色");

		System.out.println("罗永浩生产了" + p.getBrand() + "手机,价格是:" + p.getPrice() + ",颜色是:" + p.getColor());

		p.call();
		p.sendMessage();
		p.playGame();
	}
}
/*
请把手机类写成一个标准类，然后创建对象测试功能。
*/

class Phone {
	private String brand;			//品牌
	private int price;				//价格
	private String color;			//颜色

	public void setBrand(String brand) {		//setXxx方法,修改值
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {					//getXxx方法,获取值
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

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