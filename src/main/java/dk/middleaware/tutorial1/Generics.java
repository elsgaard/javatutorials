package dk.middleaware.tutorial1;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        //Example of generics where there is no need to cast
        // name where read from the list.

        List<String> names = new ArrayList();
        names.add("Thomas");
        String name = names.get(0);
        System.out.println("First name " + name);
    }

}
