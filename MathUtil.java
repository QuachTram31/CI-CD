/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tram.mathutil.core;

/**
 *
 * @author PHUONG
 */
// đây là class mô phỏng lại các hàm tiện ích, dùng chung cho mọi class khác
// Mô phỏng lại clasa tiện ích java.Math ủa jdk
// phàm là cái gì dùng chung thì được thiết kế là static
public class MathUtil {

    public static final double PI = 3.14;

    // Hàm tiện ích tính n giai thừa
    // Lưu ý quy ước:
    // Không tính giai thừa âm
    // 0! = 1! = 1
    // Vì giai thừa tăng cực nhanh, nên 21! vượt qua 18 số 0
    // tràn kiểu long
    // ta không tinhs 21! trở lên
    public static long getFactorial(int n) {
        // vì hàm mới viết xong báo lỗi màu đỏ hàm chưa viết xong 
        // hàm chưa có câu lênh return
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n Must be between 0...20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // sống sót đến đây, sure n = 2 ...20
        // câm sài else nữa khi hàm đã có return phía trước
        long product = 1; // biến cộng dồn, biến con heo đất
        //;/ acc/ accumulation/ gửi góp
        for (int i = 2; i <= n; i++) {
            product *= i;
            return product;
        }
        return 0;
    }
    
    // Coding convention: Quy tắc viết code cty ép phải theo
    // căn code đúng chuẩn
    // TA SẼ HỌC SƠ VỀ KHÁI NIỆM TDD- TEST DRIVEN DEVELOPMENT
    // là kĩ thuật lập trình/ áp dụng cho dân dev để gia tăng
    // chất lượng code/ giảm thiểu công sức tìm bug/ phát hiện bug sớm
    // TDD yêu cần dev khi viết code/viết hàm viết class
    // viết luôn các bộ kiểm thử, các test cases, viết luôn các loại code
    // để kiểm tra tính đúng đắn của hàm/class
    // viết code viết kèm với viết test cases
    // viết code có ý thức, viết luôn phần kiểm thử hàm của code
    // ý thức tức là driven, dev, test

    // SAU KHI CÓ ĐƯỢC TÊN HÀM, VIẾT LUÔN CÁC TÌNH HUỐNG SÀI HÀM
    // CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI- DO CODE CHƯA XONG
    // SAU ĐÓ TA TỐI ƯU/ CHỈNH SỬACODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG
    // QUÁ TRÌNH SAI-ĐÚNG-SAI-ĐỨNG DIỄN RA LIÊN TỤC(CYCLE)
}
