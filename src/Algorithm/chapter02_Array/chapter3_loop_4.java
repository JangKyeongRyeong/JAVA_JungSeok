package Algorithm.chapter02_Array;

import java.util.Random;

public class chapter3_loop_4 {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_LENGTH = 10;

        int [] arr = new int[ARRAY_LENGTH];
        for(int i =0; i<ARRAY_LENGTH; i++){ // 배열의 크기만큼 돈다
            boolean isPrimeNumber = true;
            int randomValue = random.nextInt(ARRAY_LENGTH); // 난수 생성

            if(randomValue == 1){
                continue;
            }

            if(randomValue == 2){
                arr[i] = randomValue;
                continue;
            }

            for(int j = 2; j<randomValue; j++){
                if(randomValue % j == 0){
                    isPrimeNumber = false;  // 의미없이 for문을 다 도는것이 아니라 중간에 소수가 아니면 for문 빠져나가도록
                    break;
                }
            }

            if(isPrimeNumber){
                arr[i] = randomValue;
            }
        }

        System.out.println("[배열에 저장된 소수]");
        for ( int k : arr ){
            if( k>0 ){
                System.out.println(k);
            }
        }

    }
}
