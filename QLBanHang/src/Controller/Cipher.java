/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cipher {
    public static String HashPassword(String password){
        try{
            // Khởi tạo MessageDigest với thuật toán SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Chuyển mật khẩu sang dạng byte và hash
            byte[] hashedBytes = md.digest(password.getBytes());

            // Chuyển byte sang dạng chuỗi Hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Thuật toán hash không được hỗ trợ", e);
        }
    }
}
