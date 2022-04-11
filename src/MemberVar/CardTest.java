package MemberVar;

public class CardTest {
    // 1. MemberVar.CardTest 클래스의 main 메서드가 호출 되면서 프로그램 시작.
    public static void main(String[] args) {

        /**   MemberVar.Card c1 = new MemberVar.Card();
         * 2. MemberVar.Card 클래스의 instance 를 생성하기 위해 먼저 MemberVar.Card 클래스가 메모리에 로드된다.
         *    이때 , MemberVar.Card 클래스의 클래스변수(cv)인 width 와 height 가 메모리에 생성되고 각각 100,250으로 초기화 된다.
         *    (static 이기 때문)
         *
         * 3. MemberVar.Card 인스턴스가 생성되고, 인스턴스변수(iv)인 kind 가 기본값인 null 과 0으로 각각 초기화 된다.
         *    그리고 생성된 인스턴스의 주소가 참조변수 c1에 저장된다.
         */
        Card c1 = new Card();
        // 4. c1.kind 를 "Heart"로, c1.number 를 7로 변경
        c1.kind   = "Heart";
        c1.number = 7;

        // 5. MemberVar.Card 클래스가 이미 메모리에 로드 되었으므로 바로 MemberVar.Card 인스턴스가 생성되고 자동 초기화 된다. 그리고 그 주소가 참조변수 c2에 저장된다.
        Card c2 = new Card();
        // 6. c2.kind 를 "Spade"로, c2.number 를 4로 변경한다.
        c2.kind   = "Spade";
        c2.number = 4;

        /**
         *  7. 인스턴스 c1,c2의 값을 화면에 출력
         *     모든 인스턴스는 자신을 생성한 클래스의 주소를 갖고 있으므로,
         *     참조변수를 사용해서도 클래스 변수에 접근할 수 있다.
         */
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        // 8. 클래스변수 c1.width 와 c1.height의 값을 각각 50,80으로 변경
        c1.width  = 50;
        c1.height = 80;

        // 9. 인스턴스 c1과 c2의 값을 화면에 출력한다. 인스턴스 c1 과 c2는 클래스변수 width 와 height 를 공유하므로 같은 값이 출력된다
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        // 10. main 메서드의 마지막까지 모두 수행되었으므로, main 메서드는 호출스택에서 제거되고 프로그램은 종료된다
    }
}

class Card{
    // iv,cv는 클래스 내부에 있으므로 멤버변수이다

    // 인스턴스변수(iv)
    String kind;
    int number;
    // 클래스변수(cv)
    static int width  = 100;
    static int height = 250;
}
