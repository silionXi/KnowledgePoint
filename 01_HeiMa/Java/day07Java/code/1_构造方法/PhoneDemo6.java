class PhoneDemo6 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class Phone {
	private String brand;
	private String color;

	public Phone() {}				//�ղεĹ��췽��

	public Phone(String brand, String color) {		//�вεĹ��췽��
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
