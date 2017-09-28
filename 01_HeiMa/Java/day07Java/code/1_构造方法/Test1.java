class Test1 {
	public static void main(String[] args) {
		RectangleTest rt = new RectangleTest(10,5);
		System.out.println(rt.perimeter());
		System.out.println(rt.area());
	}
}

/*
* A:案例演示
	* 需求：
		* 定义一个长方形类,定义 求周长和面积的方法，
		* 然后定义一个测试了Test2，进行测试。

	矩形(Rectangle)
	长(length)
	宽(width)
	周长(perimeter)
	面积(area)
*/

class RectangleTest {
	private int length;
	private int width;

	public RectangleTest(){}					//空参的构造方法

	public RectangleTest(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int perimeter() {						//求周长
		return 2 * (length + width);
	}

	public int area() {								//求面积
		return length * width;
	}
}