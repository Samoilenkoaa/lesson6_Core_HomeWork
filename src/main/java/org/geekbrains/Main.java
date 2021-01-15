package org.geekbrains;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 1, 1, 4, 4, 1, 4, 4};

//        for(int i : subListArray(testArray)) {
//            System.out.println(i);
//        }
        System.out.println(chekArray(testArray));

    }

    public static int[] subListArray(int[] array) {
        if(!ArrayUtils.contains(array, 4)) {
            throw new RuntimeException();
        }
        return ArrayUtils.subarray(array, ArrayUtils.lastIndexOf(array, 4) + 1, array.length);

    }


    public static boolean chekArray(int[] array) {
        boolean flag = ArrayUtils.contains(array, 4 ) && ArrayUtils.contains(array, 1 );
        if(!flag) {
            return false;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : array) list.add(i);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(4);

        list.removeAll(list2);
        return list.size() == 0;
    }
}
