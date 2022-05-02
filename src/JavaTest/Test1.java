package JavaTest;

public class Test1 {

    public static void main(String[] args) {

        String str1 = "Test1";
        String str2 = "Test2";
        String input = "test1";
        String result = "";

        if( str1.equalsIgnoreCase(input)) {
            result = str1;
        }else if( str2 == input ){
            result = str2;
        }
        System.out.println(result);

        /*=======================================================
            예상 결과
            Test1
        */
    }
}
