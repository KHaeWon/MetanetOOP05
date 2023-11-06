/*
변수 <>  상수
상수 : 한번 값이 [초기화] 되면 변경 불가
상수자원 : 고유값 >> 주민번호 , 수학 : PI=3.141591... , 시스템번호 (버전번호 v1.0 , v1.0.0)
상수 관용적으로 대문자 

JAVA : final int NUM=10;
C#   : const integer NUM=10;

final 키워드
1. final class Car {} >> 상속금지 
ex) public final class Math extends Object

2. public final void print(){} >> 상속관계에서 재정의 금지 

3. member field (상수) 중요
*/
class Vcard{
	
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI); //JAVA API 제공
	}
	
}

//설계자 입장에서 생각
//53개의 카드 생성시 카드마다 다른 상수값을 가지게 하고 싶다.
//한번 정해진거는 변화불가능

class Vcard2{
	
	final static int NUMBER = 100; //모든 객체에서 공유하므로 생성자 안 해도 됨
	
	//무조건 에러. 초기화를 하지 않았기 때문
	final String KIND; //나는 생성되는 객체마다 다른 상수값을 줄 것이다.
	final int NUM;
	
	//Vcard2(){}
	//상수의 초기화가 보장되므로 생성자 사용 시 에러 없어진다
	Vcard2(String kind, int num){
		this.KIND=kind;
		this.NUM=num;
	}

	@Override
	public String toString() {//toString()재정의
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
	
}


public class Ex05_final {

	public static void main(String[] args) {

		Vcard2 v1 = new Vcard2("spade",1);
		System.out.println(v1);
		//원래라면 주소값이 나오는데 위에서
		//재정의를 했기때문에 주소값이 아닌 문자열이 나온다.
		
		
	}

}
