class MethodDemo4 {
	/*
	* A:��Ա��������
	* a:���ݷ���ֵ
		* ����ȷ����ֵ����
		* ����void���͵ķ���
	* b:������ʽ����
		* �޲η���
		* ���η���
	*/
	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4();
		int num = md.sum(20,40);
		System.out.println(num);

		md.add(30,40);
	}

	/*
	���������ĺ�(�з���ֵ)
	1,��ȷ����ֵ����int
	2,��ȷ�����б� int a,int b
	*/

	public int sum(int a,int b) {
		return a + b;
	}

	/*
	���������ĺ�(�޷���ֵ)
	1,��ȷ����ֵ����void
	2,��ȷ�����б� int a,int b
	*/

	public void add(int a,int b) {
		System.out.println(a + b);
	}

	/*
	�������������ֵ(�в���)
	1,��ȷ����ֵ����int
	2,��ȷ�����б�int a,int b
	*/

	public int max(int a,int b) {
		return a > b ? a : b;
	}

	/*
	�������������ֵ(�޲���)
	1,��ȷ����ֵ����int
	2,��ȷ�����б�
	*/

	public int getMax() {
		int a = 10;
		int b = 20;
		return a > b ? a : b;
	}
}
