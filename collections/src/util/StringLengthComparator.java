package util;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int comparatorResult = 0;
        if (o1.length() > o2.length()) {
            comparatorResult = 1;
        } else if (o1.length() < o2.length()) {
            comparatorResult = -1;
        }

        return comparatorResult;
    }
}
