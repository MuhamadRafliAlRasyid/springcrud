/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springcrud.rafli.ErrorHandler;

/**
 *
 * @author Muhamad Rafl Al Rasyid
 */
public class NotFound extends RuntimeException{
    String resourceName;
    String fieldName;
    Object fieldValue;

    public NotFound(String resourceName, String fieldName, Object fieldValue) {
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    
    
}
