package JavaTest;

public class Test7 {
    public static void main(String[] args) {

        String strA = "1234A56789";
        String strB = "1234B56789";

        if (strA.contains("A")) {
            System.out.println("strA에 문자 'A'가 포함되어있습니다.");
        }

        if (!strB.contains("A")) {
            System.out.println("strB에 문자 'A'가 포함되어있지않습니다.");
        }

        // 예상 결과가 나오도록 코드를 완성하십시오.
        /*
        =======================================================
                예상 결과
                strA 에 문자’A’ 포함되어 있습니다.
                strB 에 문자’A’가 포함되어 있지 않습니다
        */
    }
}
