package vn.edu.husc.s_t1020124;


//API của iterator
public interface IteratorInteger {
    // khởi tạo bộ duyệt
    void start();

    // cho biết còn phần tử kế tiếp hay không
    boolean hasNext();

    // lấy phần tử ở vị trí hiện tại và di chuyển đến vị trí tiếp theo
    Integer next();
}