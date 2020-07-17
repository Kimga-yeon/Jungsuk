
public class Method {
	int iv;
	static int cv;
	
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod( ) {
		//System.out.println(iv);
		System.out.println(cv);
	}
	
	// static 메소드는 인스턴스 메소드 호출 불가능.

}


