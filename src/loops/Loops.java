package loops;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Collection;

public class Loops {

    public static void IterateThroughCollection(Collection<String> collection) {
        for (String element : collection) {
            System.out.println(element);
        }
    }

    public static void IterateThroughElements(int computers){
        for (int i = 3; i < 8; i++);
        System.out.println(computers);

    }

    public static void computers () {
        ArrayList<Integer> computers = new ArrayList<Integer>();
         computers.add(1);
        computers.add(2);
        computers.add(3);
        computers.add(4);
        IterateThroughElements(2);
    }



    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("color");
        collection.add("color1");
        collection.add("color2");
        collection.add("color3");
        collection.add("color4");
        collection.add("color7");
        collection.add("color5");
        collection.add("color6");
        collection.add("color7");
        IterateThroughCollection(collection);
    }







}

