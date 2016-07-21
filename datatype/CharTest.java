//	문자 자료형에 대한 학습
class CharTest{

	public static void main( String [] args ){

		//	문자 자료형이란 사실상 존재하지 않는다
		//	문자는 곧 숫자로 바뀌기 때문
		//	단 이 숫자의 목적은 연산 수행이 아닌 키코드 값과 매핑 목적으로
		//	사용해야 한다.
		char x='a';
		char y=3;
		char k=7;
		//char z=-1;			//	 키코드 매핑이 목적이므로 음수는 지원하지 않는다.

		System.out.println(x);
		System.out.println(y+k);

	}

}