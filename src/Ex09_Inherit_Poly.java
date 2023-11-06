class Pbase {
	int p=100;
}

class Cbase extends Pbase{
	int c=200;
}

class Dbase extends Pbase{
	
}
//다형성 -> 하나의 참조 변수(부모타입)가 여러 개의 값(자식)을 가질 수 있는 것
public class Ex09_Inherit_Poly {

	public static void main(String[] args) {

		//다형성 -> 상속관계에서 부모타입의 참조변수는 여러 개의 자식타입 주소를 가질 수 있다.
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		//다형성
		Pbase pbase = cbase; //다형성
		//pbase. 누르면 c는 보이지 않음
		//cbase -> xx번지
		//pbase -> xx번지
		
		Dbase dbase = new Dbase();
		pbase = dbase;
		
		//자식은 부모에게 조건없이 줄 수 있다.
		//부모가 자식한테 줄 때는 문제가 발생
		//down casting
		//pbase는 부모 것밖에 못 봄, 다운캐스팅 필요
		Cbase ccc = (Cbase)pbase;
	}

}
