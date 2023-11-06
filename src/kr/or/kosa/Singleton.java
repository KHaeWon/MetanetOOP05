package kr.or.kosa;

/*
디자인 패턴(생성에 관련된 이야기) : new
싱글톤 : 객체 하나를 만들어서 공유하겠다. 공유하면 static이지?
의도는? 하나의 객체를 공유하는 보장성 코드를 만들어라.
하나의 객체만. 자유롭게 new 못하도록
new 할 때 함수가 보이지 않아야 함
그러려면 접근자를 private으로 하면 됨

Singleton s = new Singleton();
Singleton s2 = new Singleton();
이거 하지 말자고.
 
 */

public class Singleton {
	
	private static Singleton p;
	//private은 밖에선 안 보이지만 내부에서는 사용 가능하다는 것이 중요한 포인트!
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(p==null) {
			//클래스 내부에선 private, public 의미 없으니까.
			p = new Singleton(); //생성자 함수 호출(클래스 내부에서 private, public)
		}
		return p;
	}//싱글톤 1번은 new 되지만 그 다음부턴 null이 아니니까
	
}
