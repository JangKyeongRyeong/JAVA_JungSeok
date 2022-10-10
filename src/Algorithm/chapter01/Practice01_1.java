package Algorithm.chapter01;

public class Practice01_1 {
    public static void main(String[] args) {
        int min = minVlaue(5,9,2,13);

        System.out.println("최솟값: " + min);
    }

    private static int minVlaue(int data1, int data2, int data3, int data4){

        int min = data1;

        if(min>data2){
            min = data2;
        }

        if(min>data3){
            min = data3;
        }

        if(min>data4){
            min = data4;
        }

        return min;
    }
}
