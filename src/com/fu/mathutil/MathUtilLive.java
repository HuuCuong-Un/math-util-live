/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        long result = MathUtil.getFactorial(5);
        System.out.println("expected 5! = 120; actual: " + result);
        
        System.out.println("expected 6! = 720; actual: " + MathUtil.getFactorial(6));
        
        System.out.println("expected 0! = 1; actual: " + MathUtil.getFactorial(1));


        //MathUtil.getFactorial(-5); ném ngoại lệ thật
        
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SEVER 1:54AM 3/9/2022 
        System.out.println("expected 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected 3! = 6; actual: " + MathUtil.getFactorial(3));
        
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của làm gì
        //expected value: 5! = 120
        //hàm ai đó viết khi chạy thực té là mấy - actual, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
        
    }
    
}
