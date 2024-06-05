package vn.edu.husc.s_t1020124;

//API để tạo ra iterator
public interface IContainer {
    // Bộ duyệt qua các số dương của đối tượng chứa
    IteratorInteger getIteratorSoDuong();

    // Bộ duyệt qua tất cả các phần tử của đối tượng chứa
    IteratorInteger getIteratorAll();
}