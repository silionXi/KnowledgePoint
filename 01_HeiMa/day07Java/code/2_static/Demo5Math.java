class Demo5Math {
	public static void main(String[] args) {
		//double d = Math.random();		//������������ڵ���0.0С��1.0

		//System.out.println(d);

		for (int x = 1;x <= 100 ;x++ ) {
			int num = (int)(Math.random() * 100) + 1;	//��1��100�����������
			System.out.println(num);
		}
	}
}
