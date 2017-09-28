class PhoneDemo6 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class Phone {
	private String brand;
	private String color;

	public Phone() {}				//空参的构造方法

	public Phone(String brand, String color) {		//有参的构造方法
		this.brand = brand;
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}
}
