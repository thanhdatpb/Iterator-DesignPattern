package vn.edu.husc.s_t1020124;

import java.util.List;

public class IteratorAll implements IteratorInteger {
    private List<Integer> list;
    private int currentIndex;

    public IteratorAll(List<Integer> list) {
        this.list = list;
        this.start();
    }

    @Override
    public void start() {
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        return list.get(currentIndex++);
    }
}