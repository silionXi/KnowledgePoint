class Demo4Static {
	public static void main(String[] args) {
		//ArrayTool at = new ArrayTool();
		int[] arr = {66,44,33,11,22,55,77};

		//int max = at.getMax(arr);
		//System.out.println(max);

		int max = ArrayTool.getMax(arr);	//��һ���������еķ������Ǿ�̬��,��Ҫ�ٶ���һ��
		System.out.println(max);			//�����캯��˽��,Ŀ���ǲ��������ഴ���������
	}
}

