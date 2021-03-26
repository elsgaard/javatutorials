package dk.middleaware.tutorial1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'a','b'};
    static Integer[] intArray = {1, 2};
    static Boolean[] boolArray = {true, false};

    public static <T> List<T> arrayToList (T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;

    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(charList.get(0));
    }

}
