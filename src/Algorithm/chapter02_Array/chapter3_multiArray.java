package Algorithm.chapter02_Array;

public class chapter3_multiArray {
    public static void main(String[] args) {
        int[][] arr =   { // 선언과 동시에 초기화
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };

        int[][] arr2 = new int[2][3];   // 생성 후 기본값 초기화

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println("arr의 크기" + arr.length);
        System.out.println("arr2의 크기" + arr2.length);


        /**
         *  다차원 배열
         *  다차원 배열은 2차원부터 n차원까지 배열 안의 배열 형태로 생성할 수 있다.
         *
         *  ex) int[][] arr = new int[2][1];
         *      첫번째 []는 행의 크기를,
         *      두번째 []는 열의 크기를 나타낸다.
         */


    }
}
