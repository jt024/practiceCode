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
    
    
    public String[] decode(String msg){
        
        String results[] = new String[2];
        int length = msg.length();
        int digits[] = new int[length];
        msg2Int(msg);
        for (int i=0;i<2;i++){
            digits[0]=i;
            results[i]=digits[0]+"";
            for (int j = 1; j < length; j++) {
                if (j==1) {
                    digits[j]=message[j-1]-Character.getNumericValue('0')-digits[j-1];
                    System.out.println(Arrays.toString(digits));
                }
                else {
                    digits[j]=message[j-1]-Character.getNumericValue('0')-digits[j-1]-digits[j-2];
		}
                if (digits[j]!=0 && digits[j]!=1){
                    results[i]="NONE";
                    break;
                }
                results[i]+=digits[j];
            }
            if (!results[i].equals("NONE") && ((length==1 && digits[0]!=message[length-1]-Character.getNumericValue('0')) 
                    || (length > 1 && digits[length-2]+digits[length-1]!=message[length-1]-Character.getNumericValue('0')))) {
                results[i]="NONE";
            }

        }
        return results;
    }
    public void msg2Int(String msg){
        message = new int[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            message[i]=Character.getNumericValue(msg.charAt(i));
        }
    }
    
    
    
}
