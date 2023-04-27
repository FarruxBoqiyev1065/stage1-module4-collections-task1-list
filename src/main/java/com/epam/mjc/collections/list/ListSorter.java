package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int fx = 5 * aInt * aInt + 3;
        int fy = 5 * bInt * bInt + 3;
        if ( fx != fy){
            return fx - fy;
        }else
            return aInt - bInt;
    }
}
