package Algorithm.chapter02_Array;

import java.util.Arrays;

public class chapter3_copy2 {
    public static void main(String[] args) {
        String[] folderA = {"myComputer","myDocument"};
        String[] folderB = new String[folderA.length];

        System.out.println("[사본 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folderA));

        // 사본배열의 요소들을 초기화
        for (int i = 0; i<folderA.length; i++){
            folderB[i] = folderA[i];
        }

        folderB[0] = "newFolder";   // 사본 배열의 첫 번째 index 값 변경

        System.out.println("[사본 배열의 값 변경 후] 원본 배열: " + Arrays.toString(folderA));
        System.out.println("[사본 배열의 값 변경 후] 사본 배열: " + Arrays.toString(folderB));
    }

    /**
     * folderA,folderB 둘다 서로 다른 배열 공간을 바라보고 있으며, 참조 변수가 아닌 각각의 배열 요소들을 복사하였기 때문에 folderB의
     * 요소가 변경되어도 folderA에는 영향을 미치지 않는다. 그러므로 원본 배열을 보존이 가능하다.
     */


}
