/*
	* A:����һ��������
	* ArrayTool
	* 1,��ȡ���ֵ
	* 2,����ı���
	* 3,����ķ�ת

	ͨ��javadoc��������˵����
	* @author(��ȡ��������)
	* @version(��ȡ�汾����)
	* javadoc -d ָ�����ļ�Ŀ¼ -author -version ArrayTool.java
	* @param ��������//��ʽ�����ı�������@return ���������귵�ص�����
	*/

/**
����һ�����鹤����,�����ṩ�˻�ȡ���ֵ,���鷴ת,�����������
@author ���
@version v1.0
*/
public class ArrayTool {
	/**
	����һ���ղ����Ĺ��췽��
	*/
	private ArrayTool(){}

	/**
	���ǻ�ȡ�������ֵ�ķ���
	@param arr ����һ��int���͵�����
	@return ����һ��int��
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];						//��¼ס��Ǳ�λ�õ�ֵ

		for (int x = 1;x < arr.length ;x++ ) {	//������ĵڶ���λ�ÿ�ʼ����
			if (max < arr[x]) {
				max = arr[x];					//��¼ס�ϴ��
			}
		}

		return max;
	}
	
	/**
	���Ǳ�������ķ���
	@param arr ����һ��int���͵�����
	*/
	public static void print(int[] arr) {
		for (int x = 0;x < arr.length ;x++ ) {	//����ÿһ��Ԫ��
			System.out.print(arr[x] + " ");
		}
	}
	
	/**
	���ǽ����鷴ת�ķ���
	@param arr ����һ��int���͵�����
	*/
	public static void revArray(int[] arr) {
		for (int x = 0;x < arr.length / 2 ;x++ ) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
}
