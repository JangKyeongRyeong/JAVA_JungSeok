package JavaTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("parent_cd", "");
        map1.put("child_cd", "ROOT");
        list.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map1.put("parent_cd", "ROOT");
        map1.put("child_cd", "CHILD-1");
        list.add(map1);

        Map<String, String> map3 = new HashMap<>();
        map1.put("parent_cd", "ROOT");
        map1.put("child_cd", "CHILD-2");
        list.add(map1);

        Map<String, String> map4 = new HashMap<>();
        map1.put("parent_cd", "ROOT");
        map1.put("child_cd", "CHILD-1-1");
        list.add(map1);

        for(Map<String, String> map: list){
            System.out.println( map.get("parent_cd") + "=" + map.get("child_cd"));
        }


        /*
        =======================================================
        예상 결과
        =ROOT
        ROOT=CHILD-1
        ROOT=CHILD-2
        ROOT=CHILD-1-1
        */
    }
}
