/*

	변수에 데이터를 담아서 선언할 때는 반드시 변수가 담게 될
	데이터의 용량을 표시해야 하는데
	이 용량 표시를 자료형이라 한다.
	불편하지만 개발자가 메모리 용량을 결정지을 수 있다.

	1. 문자
		- char (2byte)

	2. 숫자
		- byte (1byte)
		- short (2byte)
		- int (4byte)
		- long (8byte)
	
	3. 논리값
		- boolean (1byte)


	

*/

class DataType{

	public static void main( String [] args){

		// 문자 자료형 ( 캐릭터형 )
		char c = '대';				//	문자열이 아닌 하나의 문자는 홑따옴표를 쓴다.
		
		//	2byte짜리 데이터가 총 4개 확보 = 8byte
		char[] arr = new char[4];

		arr[0] = '대';
		arr[1] = '한';
		arr[2] = '민';
		arr[3] = '국';

		char[] arr2 = {'아', '메', '리', '카'};

		for( int i=0 ; i<arr.length ; i++ ){

			System.out.print(arr[i]);

		}

		System.out.println();

		for( int i=0 ; i<arr2.length ; i++ ){

			System.out.print(arr2[i]);

		}


		System.out.println();
		System.out.println("c의 값은 "+c);


		byte a = 77;
		long k = 8821;

		//	a+k =				작은 타입이 큰 타입으로 변형되어 long + long 형식으로 합쳐진다.

		//	boolean true;



	}

}