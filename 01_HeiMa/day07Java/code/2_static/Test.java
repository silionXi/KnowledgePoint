class Test {
	public static void main(String[] args) {
		/*
		小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
		她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		*/
		/*double dayMoney = 2.5;
		double sum = 0;
		int day = 1;

		while (true) {
			sum = sum + dayMoney;
			if (day % 5 == 0) {					//如果是第五天或者5的倍数时
				sum = sum - 6;					//减去6元
			}

			if (sum >= 100) {
				System.out.println("小芳用了" + day + "天存够100元钱");
				break;
			}else {
				day++;
			}
		}*/
		/*
		1:杨辉三角形
		1
		1 1
		1 2 1
		1 3 3 1
		1 4 6 4 1 
		1 5 10 10 5 1

		分析：
			A:如果是n行，那么最后一行是n列。
			B:每一行的第一列和最后一列的元素是1。
			C:规律：
				每一行的第二列开始数据是：上一行的上一列+上一行的同一列
			D:把二维数组组成，然后遍历即可。
				遍历的时候，注意模仿九九乘法表的遍历。否则会有很多0。
		*/
		int[][] arr = new int[6][6];

		for (int x = 0;x < arr.length ;x++ ) {			//遍历二维数组
			for (int y = 0;y <= x ;y++ ) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}
		
		for (int x = 0;x < arr.length ;x++ ) {			//将每一行的第一个数和最后一个数赋值为1
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
		
		for (int x = 0;x < arr.length ;x++ ) {			//遍历二维数组,打印杨辉三角形
			for (int y = 0;y <= x ;y++ ) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}
		/*
		数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
		在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。 

		123456
		654321
		11 10 9 8 7 6 
		1 0 9 8 7 6
		6 0 9 8 7 1
		*/

		/*int num = 123456;								//定义一个数字
		int[] arr = new int[7];							//定义一个长度小于8的数组
		int pos = 0;									//定义一个指针
		
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
