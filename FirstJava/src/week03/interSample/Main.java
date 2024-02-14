package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        // 자동 타입 변환 일어남
        A a1 = new B();
        a1.a();
        // a1.b(); // 불가능 -> b(); 구현체(자식) 에게만 존재하는 메서드

        System.out.println("\nB 강제 타입변환");
        // 자동 타입변환한 아이를 다시 강제 타입변환
        B b = (B) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        // C 는 B의 모든 것을 상속 받음
        // 아래 애는 A로 자동 타입변환 함
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능 -> A로 타입변환 했기 때문에 사용 불가
        //a2.c(); // 불가능 -> A로 타입변환 했기 때문에 사용 불가

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A { //interface A를 상속받음
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}