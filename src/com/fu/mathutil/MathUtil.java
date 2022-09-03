/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */

//VIẾT CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ GÌ CHO 
//RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    //n! = 1.2.3.4.5.6..n 
    //0! = 1! = 1
    //ko tính giai thừa âm cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm hay 21!, ta ko tính vào đập mặt ai xài hàm này
    //Chửi éo tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        //gặp throw new hàm dừng liền éo cần return
        
        if (n == 0 || n == 1)
            return 1;   //dừng ngay khi n đặc biệt
        
        //xuống đến đây, n = 2..20 ròi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất
        
        long product = 1; //tích khởi đầu bằng 1, sau đó nhồi vào
        for (int i = 2; i <= n; i++) 
            product *= i;
            //product = product * i;
            
        return product;
        
    System.out.println("l cuong");
        
        
        
    } 
}
