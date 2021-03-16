/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Sitti Mahmudah
 */
public class Person {
    
    String fName;     
    int stuId;        
    String stuStatus; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student studentku = new student();
        
        studentku.fName    ="Lisa Palombo";
        studentku.stuId    ="12345678";
        studentku.stuStatus="Active";
        
        
        System.out.println ("Student Name   :" + studentku.fName);
        System.out.println ("Student ID     :" + studentku.stuId);
        System.out.println ("Student Status :" + studentku.stuStatus);
        
        
     
    }
            
        }