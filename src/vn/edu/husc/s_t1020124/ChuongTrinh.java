package vn.edu.husc.s_t1020124;

public class ChuongTrinh {
    public static void main(String[] args) {
        // Khởi tạo instance của MyList
        MyList myList = new MyList("NUMBERS.TXT");

        //In danh sách tất cả các phần tử của danh sách (sử dụng iterator đã cài đặt)
        System.out.println("Danh sách tất cả các phần tử:");
        IteratorInteger iteratorAll = myList.getIteratorAll();
        iteratorAll.start();
        while (iteratorAll.hasNext()) {
            System.out.println(iteratorAll.next());
        }

        //In danh sách tất cả các phần tử dương của danh sách (sử dụng iterator đã cài đặt)
        System.out.println("Danh sách tất cả các phần tử dương:");
        IteratorInteger iteratorSoDuong = myList.getIteratorSoDuong();
        iteratorSoDuong.start();
        while (iteratorSoDuong.hasNext()) {
            System.out.println(iteratorSoDuong.next());
        }
    }
}