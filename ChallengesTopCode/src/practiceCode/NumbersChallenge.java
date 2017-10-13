/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Trevi
 */
public class NumbersChallenge {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static Integer targetSum = 1;
    public static Integer sumInStack = 0;
    public static String stringCombo;
    public static boolean minGood;
    
    


    public static class GetAllSubsetByStack{
        
        public static void populateSubset(int[] data, int fromIndex, int endIndex){
        
            if (sumInStack == targetSum) {
                print(stack);
            }
            for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++){
                if (sumInStack + data[currentIndex] <= targetSum){
                    stack.push(data[currentIndex]);
                    sumInStack += data[currentIndex];

                    populateSubset(data, currentIndex + 1, endIndex);
                    sumInStack -= (Integer) stack.pop();
                }
            }
        }
    
        public static void print(Stack<Integer> stack) {
            StringBuilder sb = new StringBuilder();
            sb.append(targetSum).append(" = ");
            for (Integer i : stack) {
                sb.append(i).append("+");
            }
            String check = sb.deleteCharAt(sb.length() - 1).toString();
            if (check.matches("^([0-9].\\=.)$")) {
                System.out.println(true);
            }
            
            System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
        }
    
    
    }
    
    public static int MinNumber(int[] s){
        
        
        s = sort(s);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length  ; i++) {
            list.add(s[i]);
        }
        
        int minNotOnList = findMin(list, 1);
//        minNotOnList = checkMin(list,0,minNotOnList);
        System.out.println(minNotOnList);
        
        return minNotOnList;
    }
   
    public static int findMin(List<Integer> list, int min){
        for(int i : list){
            if(i==min){
                min++;
                return findMin(list, min);
            }
        }
        return min;
    }
    
    public static int checkMin(List<Integer> list, int min){

        int size=list.size();
        int k = size;
        while(k > 0){
        }
        
        
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (min == list.get(i)+list.get(j)) {
                    min++;

                }
            }

        }
        return min;    
    }

    public static int[] sort(int[] s) {
        for (int i=1; i<s.length; ++i)
        {
            int key = s[i];
            int j = i-1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && s[j] > key)
            {
                s[j+1] = s[j];
                j = j-1;
            }
            s[j+1] = key;
        }
        return s;
    }

    
    
}
