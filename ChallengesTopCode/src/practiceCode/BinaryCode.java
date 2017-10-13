/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceCode;

import java.util.Arrays;

/**
 *
 * @author Trevi
 */
public class BinaryCode {
    public int[] message;
    
    
    public void decode(String msg){
        int length = msg.length();
        String[] results = new String[2];
        int[] digits = new int[length];
        msg2Int(msg);
        for (int i=0;i<2;i++){
            digits[0]=i;
            results[i]=digits[0]+"";
            for (int j = 0; j < length; j++) {
                if (j==1) {
                    digits[j]=message[j-1]-'0'-digits[j-1];
                }
            }
        }
      
    }
    public void msg2Int(String msg){
        message = new int[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            message[i]=Character.getNumericValue(msg.charAt(i));
        }
    }
    
    
    
}
