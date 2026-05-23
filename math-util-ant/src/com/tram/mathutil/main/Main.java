/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tram.mathutil.main;

import com.tram.mathutil.core.MathUtil;

/**
 *
 * @author PHUONG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tryTDDFirst();
       
    }
    
    // hàm này viết ra để dùng kĩ thuật viết code kiểu TDD
    // gọi thử dùng thử hàm chính bên core/ bên MathhUtil
    
    public static void tryTDDFirst(){
        // test case 1: tình huống sài thử hàm số 1
        // đưa vào n = 1
        // gọi hàm getF1
        // hy vọng hàm trả về 1 vì 1! = 1
        
       long expected = 1;
       long actual = MathUtil.getFactorial(1); 
       // so sánh expected với actual coi chúng nó có giống nhau k
       // giống => hàm đúng với case đang test
       // sai => bug rồi với case đangh test
        System.out.println("Test 1! | status: " +
                                    "Expected: " + expected+
                                    " | Actual: " + actual);
        
        // test case 2: tình huống sài thử hàm số 2
        // đưa vào n = 2
        // gọi hàm getF2
        // hy vọng hàm trả về 2 vì 2! = 2
        System.out.println("Test 2! | status: " +
                                    "Expected: 2" +
                                    " | Actual: " + MathUtil.getFactorial(2));
        
    }
}

// Test case là gì
// Là 1 tình huống xài app/ kiểm thử app/ kiểm thử tính năng/ mh
// chức năng/xử lí của app
// Test case là tình huống kiểm thử app/ chức năng mà khi đó
// ta phải 
// đưa data giả/mẫu/test
// đưa ra giá trị kì vọng ta mong chờ app trả ra
// sau đó chờ hàm/ tính năng xử lí xong trả ra kết quả!!!!!
// và ta nhì kết quả và ta so sánh với kì vọng ta đưa ra trước đó
// để kết luận hàm đó ổn/tính năng ổn, test case passed
//                                     test case failed


   