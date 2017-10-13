/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import practiceCode.BinaryCode;

/**
 *
 * @author Trevi
 */
public class TestMain {
    
    public static void main(String args[]){
        
        BinaryCode bc = new BinaryCode();
        
//        String[] msg = bc.decode("123210122");
        System.out.println(Arrays.toString(bc.decode("22111")));
    }
    
    
}
