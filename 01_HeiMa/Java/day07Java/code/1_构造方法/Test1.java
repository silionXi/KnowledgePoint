class Test1 {
	public static void main(String[] args) {
		RectangleTest rt = new RectangleTest(10,5);
		System.out.println(rt.perimeter());
		System.out.println(rt.area());
	}
}

/*
* A:������ʾ
	* ����
		* ����һ����������,���� ���ܳ�������ķ�����
		* Ȼ����һ��������Test2�����в��ԡ�

	����(Rectangle)
	��(length)
	��(width)
	�ܳ�(perimeter)
	���(area)
*/

class RectangleTest {
	private int length;
	private int width;

	public RectangleTest(){}					//�ղεĹ��췽��

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

	public int perimeter() {						//���ܳ�
		return 2 * (length + width);
	}

	public int area() {								//�����
		return length * width;
	}
}