/*
	* A:制作一个工具类
	* ArrayTool
	* 1,获取最大值
	* 2,数组的遍历
	* 3,数组的反转

	通过javadoc命令生成说明书
	* @author(提取作者内容)
	* @version(提取版本内容)
	* javadoc -d 指定的文件目录 -author -version ArrayTool.java
	* @param 参数名称//形式参数的变量名称@return 函数运行完返回的数据
	*/

/**
这是一个数组工具类,里面提供了获取最大值,数组反转,数组遍历方法
@author 冯佳
@version v1.0
*/
public class ArrayTool {
	/**
	这是一个空参数的构造方法
	*/
	private ArrayTool(){}

	/**
	这是获取数组最大值的方法
	@param arr 传递一个int类型的数组
	@return 返回一个int数
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];						//记录住零角标位置的值

		for (int x = 1;x < arr.length ;x++ ) {	//从数组的第二个位置开始遍历
			if (max < arr[x]) {
				max = arr[x];					//记录住较大的
			}
		}

		return max;
	}
	
	/**
	这是遍历数组的方法
	@param arr 传递一个int类型的数组
	*/
	public static void print(int[] arr) {
		for (int x = 0;x < arr.length ;x++ ) {	//遍历每一个元素
			System.out.print(arr[x] + " ");
		}
	}
	
	/**
	这是将数组反转的方法
	@param arr 传递一个int类型的数组
	*/
	public static void revArray(int[] arr) {
		for (int x = 0;x < arr.length / 2 ;x++ ) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
}
