package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {
    
    public void LinkedListExample01() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Heng Swee Kiat");
        linkedList.add("Leong Mun Wai");
        linkedList.add("Pritam Singh");
        linkedList.add("Gerald Giam");

        // System.out.println(linkedList);

        for (String itm : linkedList) {
            System.out.println(itm);
        }

        linkedList.remove("Leong Mun Wai");
        System.out.println(linkedList);

        linkedList.addFirst("Lee Hsien Loong");
        linkedList.addLast("Lee Kuan Yew");

        System.out.println(linkedList);
        
    }
}
