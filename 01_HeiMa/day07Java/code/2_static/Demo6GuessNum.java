import java.util.Scanner;
class Demo6GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		int result = (int)(Math.random() * 100) + 1;		//生成的随机数,在1到100范围内
		System.out.println("请输入一个1到100的数字:");

		while(true) {										//不清楚会猜几次,所以用无限循环
			int guessNum = sc.nextInt();					//获取键盘录入的数字
			if (guessNum > result) {
				System.out.println("大啦");
			}else if (guessNum < result) {
				System.out.println("小啦");
			}else {
				System.out.println("中啦");
				break;
			}
		}
	}
}
