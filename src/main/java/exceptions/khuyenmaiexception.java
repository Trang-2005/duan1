/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author maytinh
 */
public class khuyenmaiexception extends RuntimeException {
    public khuyenmaiexception(String message) {
        super(message);
    }

    public khuyenmaiexception(String message, Throwable cause) {
        super(message, cause);
    }
}
