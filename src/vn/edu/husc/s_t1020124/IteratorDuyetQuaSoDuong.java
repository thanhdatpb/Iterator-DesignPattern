package vn.edu.husc.s_t1020124;

import java.util.List;

public class IteratorDuyetQuaSoDuong implements IteratorInteger {
    private List<Integer> list;
    private int currentIndex;

    public IteratorDuyetQuaSoDuong(List<Integer> list) {
        this.list = list;
        this.start();
    }

    @Override
    public void start() {
        this.currentIndex = 0;
        // Move to the first positive element
        while (currentIndex < list.size() && list.get(currentIndex) <= 0) {
            currentIndex++;
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        Integer currentElement = list.get(currentIndex);
        do {
            currentIndex++;
        } while (currentIndex < list.size() && list.get(currentIndex) <= 0);
        return currentElement;
    }
}