package JavaTest;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {

        String str = "abcdefg/hijklmn/opqrstu/vwxyz";

        String[] strArr = str.split("/");

        String firstStr = "";
        String otherStr = "";
        for (String s : strArr) {
            firstStr = s.substring(0, 1).toUpperCase();
            otherStr = s.substring(1, s.length());

            System.out.println(firstStr + otherStr);
        }


        // 예상 결과가 나오도록 코드를 완성하십시오.
        /*=======================================================
        예상 결과
        Abcdefg
        Hijklmn
        Opqrstu
        Vwxyz
        */
    }
}
