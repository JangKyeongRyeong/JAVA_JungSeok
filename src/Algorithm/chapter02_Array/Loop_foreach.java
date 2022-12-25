package Algorithm.chapter02_Array;

import java.sql.Array;

public class Loop_foreach {
    public static void main(String[] args) {

        int students[] = {1,2,3,4,5,6,7,8,9,10};

        /**
         * 향상된 for문
         * ':'을 구분으로 왼쪽에 배열의 요소를 담을 변수를 선언하고 오른쪽에  순회할 배열의 참조 변수를 선언한다.
         * 배열의 요소를 저장하기 위해선 데이터 타입이 동일해야 한다.
         *
         *
         * foreach를 사용할 수 없는 경우
         * 배열의 연산으로 특정 위치에 값을 삽입, 삭제하거나 값을 읽어오는 경우.
         * 'for문처럼 index를 사용하지 않기 때문에' index기반으로 연산을 수행해야 한다면 for문을 사용해야 한다.
         */
        for (int student:students) {
            System.out.println("학생번호"+student);
        }


    }
}
