package morecon.domain.model.order;

import java.util.ArrayList;
import java.util.List;

/**
 * 明細
 */
public class Lines {
    List<Line> list;

    public Lines() {
        list = new ArrayList<>();
    }

    public Lines(List<Line> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "list=" + list +
                '}';
    }
}
