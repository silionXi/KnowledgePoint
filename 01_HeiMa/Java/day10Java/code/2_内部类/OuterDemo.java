interface Inter { 
	abstract void show(); 
}
class Outer { 
	//�������
	public static Inter method() {		//Inter i = Inter���������
		return new Inter(){
			public void show() {
				System.out.println("1111111111");
			}
		};
	}
}
class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();					//��ʽ���:���÷������ص��Ƕ���,�����Լ������÷���
	}
}
