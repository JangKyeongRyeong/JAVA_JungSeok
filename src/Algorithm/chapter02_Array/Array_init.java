package Algorithm.chapter02_Array;

import java.util.Arrays;

/**
 * 배열이란?
 * 데이터 타입이 같은 여러 개의 변수를 한데 모아서 묶어 놓은것
 */
public class Array_init {
    public static void main(String[] args) {

        int[] arr = new int[1000];    // 1,000개의 int 타입을 저장하는 배열을 생성한다

        /**
         * 배열의 3요소
         *
         * 1. 배열을 구헝하는 자료형 : 기본자료형,참조 자료형
         * 2. 배열의 이름
         * 3. 배열의 길이
         *
         * int[] arr new int[-1]; // Exception in thread "main" java.lang.NegativeArraySizeException
         *
         *
         * 배열의 선언
         */
        int[] array = new int[3];           //기본 자료형
        String[] strings = new String[3];   //참조 자료형


        /**
         * (2) 보다 (1)의 코드를 보았을 때, 왼쪽부터 읽으면서 int형의 '[]'배열임을 더 명확하게 알 수 있습니다.
         */
        int[] array_1; //  (1)자료형[] 변수명
        int array_2[]; //  (2)자료형 변수명[]


        /**
         *  배열의 생성과 초기화
         * 배열의 변수는 참조형 변수이며, 일반적인 변수와는 다른 성격을 가집니다.
         * 기본형 변수를 예로 들면 int num;의 변수를 선언 시에 num이라는 메모리 공간이 할당되고 값을 초기화 할 때 메모리 공간에 값이 저장됩니다.
         *
         * 배열의 변수도 위와 같이 동작할까요?
         * int[] arr; 의 배열을 선언하면 arr이라는 메모리 공간이 할당 되는데 이는 어떠한 메모리 주소 값을 가지는 형태가 됩니다.
         * 즉, "참조형 변수는 초기화 없이 선언한 상태에서는 null 값을 가집니다."
         *  int arr = new int[3];
         *      arr -> 0/0/0
         *      index :0,1,2
         */

        final int ARRAY_LENGTH = 1;

        String []Strings1   = new String[ARRAY_LENGTH];
        byte   []bytes      = new byte[ARRAY_LENGTH];
        short  []shorts     = new short[ARRAY_LENGTH];
        int    []ints       = new int[ARRAY_LENGTH];
        float  []floats     = new float[ARRAY_LENGTH];
        long   []longs      = new long[ARRAY_LENGTH];
        double []doubles    = new double[ARRAY_LENGTH];
        boolean[]booleen    = new boolean[ARRAY_LENGTH];

        System.out.println("참조 타입의 초기값: "    + strings[0]);
        System.out.println("byte 타입의 초기값: "   + bytes[0]);
        System.out.println("short 타입의 초기값: "  + shorts[0]);
        System.out.println("int 타입의 초기값: "    + ints[0]);
        System.out.println("float 타입의 초기값: "  + floats[0]);
        System.out.println("long 타입의 초기값: "   + longs[0]);
        System.out.println("double 타입의 초기값: " + doubles[0]);
        System.out.println("boolean 타입의 초기값: "+ booleen[0]);


        int[] arr1 = new int[1];        // 1) 선언과 동시에 0으로 초기화
        int[] arr2 = new int[]{1,2,3};  // 2) 배열 생성 시, 크기를 저장하지 않고 저장할 요소만 명시한다.
        int[] arr3 = {1,2,3,4,5};       // 3) 저장할 요소만 명시하는 방법.

        System.out.println("arr1: " + Arrays.toString(arr1) + ", length: " + arr1.length);
        System.out.println("arr2: " + Arrays.toString(arr2) + ", length: " + arr2.length);
        System.out.println("arr3: " + Arrays.toString(arr3) + ", length: " + arr3.length);


        /**
         *  아래 코드 해설 :
         *  index가 음수이거나 배열의 크기를 벗어나면 런타임(실행시점)에 예외 발생함('ArrayIndexOutOfBoundsException').
         */
        String[] strings1 = new String[3];
        System.out.println(strings1[0]);    // 정상
        System.out.println(strings1[1]);    // 정상
        System.out.println(strings1[2]);    // 정상
//      System.out.println(strings1[-1]);   // ArrayIndexOutOfBoundsException 발생
//      System.out.println(strings1[3]);    // ArrayIndexOutOfBoundsException 발생

    }
}
