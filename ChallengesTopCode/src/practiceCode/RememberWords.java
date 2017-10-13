/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceCode;

/**
 *
 * @author Trevi
 */
public class RememberWords {
    
    
//    public static void main(String[] args) {
//
//
//  
//        System.out.println(isPossible(2,3,7,18));
//        System.out.println(isPossible(1,1,3,5));
//        System.out.println(isPossible(3,5,300,500));
//        System.out.println(isPossible(100,1,0,2));
//        System.out.println(isPossible(1000000000,1000000000,
//                1000000000,1000000000));
//    }
    public static long leftValue(long x, long y){
        long left = Math.max(x-(y-1),0l);
        
        return (x+left)*(x-left+1)/2;
    }
    public static long rightValue(long x, long y){
        long right = x+(y-1);
        return (x+right)*(y)/2;
    }
    public static long lowest(int d, int w){
        long value = (1l<<30)-1;
        for (int i = 29; i > 0; i--) {
            if (rightValue(value-(1l<<i),d) >= w) {
                value-=1<<i;
            }
        }
        return value;
    }
    public static long highest(int d, int w){
        long value = 0;
        if (w==0) 
            return 0;
        for (int i = 29; i > 0; i--) {
            if (leftValue(value+(1l<<i),d)<=w) {
                value+=1l<<i;
            }
        }
        return value;
    }
    public static String isPossible(int d1, int d2, int w1, int w2){
        Long left1 = lowest(d1,w1);
        Long right1 = highest(d1,w1);
        Long left2 = lowest(d2,w2);
        Long right2 = highest(d2,w2);               

        if(left1 > right1 || left2 > right2)
            return "IMPOSSIBLE";
        if(right1+1 == left2)
            return "POSSIBLE";
        if(right2+1 == left1)
            return "POSSIBLE";
        if(Math.max(left1, left2) <= Math.min(right1, right2))
            return "POSSIBLE";        
        return "IMPOSSIBLE";
    }
}
    
    
    
    
   
    

