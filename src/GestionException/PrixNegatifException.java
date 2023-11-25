/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionException;

/**
 *
 * @author sanabenfadhel
 */
public class PrixNegatifException extends Exception{

    public PrixNegatifException(String msg) {
        super(msg);
    }
    
}
