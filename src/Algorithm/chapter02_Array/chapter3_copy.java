package Algorithm.chapter02_Array;

import java.util.Arrays;

public class chapter3_copy {
    public static void main(String[] args) {
        String[] folderA = {"myComputer", "myDocument"};
        String[] folderB = folderA;

        System.out.println("[사본 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folderA));

        folderB[0] = "newFolder"; // 사본 배열의 첫번째 index값 변경

        System.out.println("[사본 배열의 값 변경 후] 원본 배열: " + Arrays.toString(folderA));
        System.out.println("[사본 배열의 값 변경 후] 사본 배열: " + Arrays.toString(folderB));

        /**
         *  일반적으로 복사 동작의 기대결과는 원본을 보존하고 사본으로 작업하기 위한 것이다.
         *  위와 같은 경우는 folderA(원본배열) 와 folderB(사본배열) 둘다 같은 주소를 바라보고 있기 때문에
         *  원본의 보존성을 유지하지 못한다. 이것을 얕은 복사(shallow copy)라고 한다.
         *
         *  얕은 복사를 피하기 위해서 새 배열을 생성하고 원본 배열의 요소 값들을 저장해 주어야하며,
         *  사본 배열의 값이 변경되더라도 원본 배열의 값은 보존 되어야 한다.
         *  이것을 깊은 복사(deep copy)라고 한다.
         *
         */
    }
}
