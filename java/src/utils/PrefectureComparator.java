// 課題1-29
package utils;

import info.Prefecture;
import java.util.Comparator;

public class PrefectureComparator implements Comparator<Prefecture> {
    private boolean ascending;

    public PrefectureComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Prefecture p1, Prefecture p2) {
        return ascending ? Double.compare(p1.getArea(), p2.getArea()) : Double.compare(p2.getArea(), p1.getArea());
    }
}
