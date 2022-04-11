package RecursiveCall;

// 1. FactorialTest Class 가 메모리에 로드되고, FactorialTest 클래스의 main 메서드가 호출되면서 프로그램은 시작된다.
public class FactorialTest {
    public static void main(String[] args) {

        // 2. long 타입의 변수 result 가 main 메서드의 지역변수로 생성된다. factorial 메서드를 호출하면서 매개변수 4를 넘겨준다.
        // 10. factorial 메서드의 수행결과로 반환값 24가 main 메서드의 지역변수 result에 저장된다.
        long result = factorial(4);

        // 11. println 메서드를 호출해서 result 의 값을  출력한다.
        System.out.println(result);

    }

    static long factorial(int n) {
        // 3. factorial 메서드의 지역변수 result를 생성하고 0으로 초기화 한다.
        long result = 0;

        if (n==1) { // 4. n의 값이 4 이므로 else블럭 {}의 문장이 수행된다.
            result =1 ;
        } else {
            /**
             * 5. n * factorial(n-1)을 수행하는 과정에서 다시 factorial 메서드가 호출된다.
             *   매개변수로는 n-1, 현재 n의 값이 4이므로 3이 넘겨진다. n이 1이 될 때까지 이 과정이 계속 반복된다.
             *
             * 6. n의 값이 1이되면 if문 조건식의 결과가 true가 된다.
             *    그래서 if 브럭{}의 result = 1;이 수행된 다음 전체 if문을 빠져나간다.
             *
             * 8. factorial 메서드를 호출했던 곳으로 돌아가서 다시 수행을 계속한다.
             *    factorial(n-1)대신 factorial(n-1)을 호출한 결과로 반환받은 값 1이 사용되어 계산된다.
             */
            result = n * factorial(n-1);
        }

        /**
         * 7. 지역변수 result의 값 1을 자신을 호출한 메서드에게 반환하면서 현재 수행중인 메서드는 종료된다.
         *
         * 9. 지역변수 result의 값 2를 자신을 호출한 메서드에게 반환하면서 현재 수행중인 메서드는 종료된다.
         *    main메서드에서 factorial메서드를 처음 호출한 곳으로 돌아갈 때까지 이 과정이 되풀이된다.
         */
        return result;
    }

}
