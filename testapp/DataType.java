/*

	������ �����͸� ��Ƽ� ������ ���� �ݵ�� ������ ��� ��
	�������� �뷮�� ǥ���ؾ� �ϴµ�
	�� �뷮 ǥ�ø� �ڷ����̶� �Ѵ�.
	���������� �����ڰ� �޸� �뷮�� �������� �� �ִ�.

	1. ����
		- char (2byte)

	2. ����
		- byte (1byte)
		- short (2byte)
		- int (4byte)
		- long (8byte)
	
	3. ����
		- boolean (1byte)


	

*/

class DataType{

	public static void main( String [] args){

		// ���� �ڷ��� ( ĳ������ )
		char c = '��';				//	���ڿ��� �ƴ� �ϳ��� ���ڴ� Ȭ����ǥ�� ����.
		
		//	2byte¥�� �����Ͱ� �� 4�� Ȯ�� = 8byte
		char[] arr = new char[4];

		arr[0] = '��';
		arr[1] = '��';
		arr[2] = '��';
		arr[3] = '��';

		char[] arr2 = {'��', '��', '��', 'ī'};

		for( int i=0 ; i<arr.length ; i++ ){

			System.out.print(arr[i]);

		}

		System.out.println();

		for( int i=0 ; i<arr2.length ; i++ ){

			System.out.print(arr2[i]);

		}


		System.out.println();
		System.out.println("c�� ���� "+c);


		byte a = 77;
		long k = 8821;

		//	a+k =				���� Ÿ���� ū Ÿ������ �����Ǿ� long + long �������� ��������.

		//	boolean true;



	}

}