class Test {
	public static void main(String[] args) {
		/*
		С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
		�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		*/
		/*double dayMoney = 2.5;
		double sum = 0;
		int day = 1;

		while (true) {
			sum = sum + dayMoney;
			if (day % 5 == 0) {					//����ǵ��������5�ı���ʱ
				sum = sum - 6;					//��ȥ6Ԫ
			}

			if (sum >= 100) {
				System.out.println("С������" + day + "��湻100ԪǮ");
				break;
			}else {
				day++;
			}
		}*/
		/*
		1:���������
		1
		1 1
		1 2 1
		1 3 3 1
		1 4 6 4 1 
		1 5 10 10 5 1

		������
			A:�����n�У���ô���һ����n�С�
			B:ÿһ�еĵ�һ�к����һ�е�Ԫ����1��
			C:���ɣ�
				ÿһ�еĵڶ��п�ʼ�����ǣ���һ�е���һ��+��һ�е�ͬһ��
			D:�Ѷ�ά������ɣ�Ȼ��������ɡ�
				������ʱ��ע��ģ�¾žų˷���ı�����������кܶ�0��
		*/
		int[][] arr = new int[6][6];

		for (int x = 0;x < arr.length ;x++ ) {			//������ά����
			for (int y = 0;y <= x ;y++ ) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}
		
		for (int x = 0;x < arr.length ;x++ ) {			//��ÿһ�еĵ�һ���������һ������ֵΪ1
			for (int y = 0;y <= x ;y++ ) {
				arr[x][0] = 1;
				arr[x][x] = 1;
			}
		}
		
		for (int x = 2;x < arr.length ;x++ ) {
			for (int y = 1;y < x; y++) {
				//arr[2][1] = arr[1][0] + arr[1][1];
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}
		
		for (int x = 0;x < arr.length ;x++ ) {			//������ά����,��ӡ���������
			for (int y = 0;y <= x ;y++ ) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}
		/*
		���ݼ�������
		ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
		�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 

		123456
		654321
		11 10 9 8 7 6 
		1 0 9 8 7 6
		6 0 9 8 7 1
		*/

		/*int num = 123456;								//����һ������
		int[] arr = new int[7];							//����һ������С��8������
		int pos = 0;									//����һ��ָ��
		
		while(num != 0) {
			arr[pos++] = num % 10;   
			num = num / 10;		
		}

		for (int x = 0;x < pos ;x++ ) {
			arr[x] = arr[x] + 5;
			arr[x] = arr[x] % 10;
		}

		int temp = arr[0];
		arr[0] = arr[pos-1];
		arr[pos-1] = temp;

		for (int x = 0;x < pos ;x++ ) {
			System.out.print(arr[x] + " ");
		}
		*/
	}
}
