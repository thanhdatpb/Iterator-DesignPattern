package vn.edu.husc.s_t1020124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyList implements IContainer {
    private List<Integer> a;

    public MyList(String filename) {
        this.a = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                this.a.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IteratorInteger getIteratorSoDuong() {
        return new IteratorDuyetQuaSoDuong(this.a);
    }

    public IteratorInteger getIteratorAll() {
        return new IteratorAll(this.a);
    }
}