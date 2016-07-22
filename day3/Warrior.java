/*
		
*/

class Warrior{

	//	이름, 체력					: 멤버변수
	// 싸우는 행동, 움직임		: 함수

	//	자바와 자바스크립트는 모두 문자를 모아놓은 문자열을 객체로 간주한다.
	//	객체 이지만 반드시 new 연산자를 사용해야한다는 원칙을
	//	지키지 않는다. (암시적 생성법)
	String name = "홍길동";
	int hp=100;
	public void fight(){
	
		System.out.println("싸운다.");

	}			//	세미콜론은 필수 아님, 호출이 아닌 정의시엔 붙이지 않기로
	
	public void move(){
	
		System.out.println("움직인다.");

	}

}