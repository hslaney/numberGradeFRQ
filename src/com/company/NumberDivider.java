package com.company;

import java.util.Arrays;

/***
 A positive integer is called a number divider if every decimal digit of
 the number is a divisor of the number.  That is, if the number is evenly
 divisible by each one of its digits.  For example, 128 is a number divider
 because it is evenly divisible by 1, 2 and 8.  However, 26 is not a number
 divider because if is not evenly divisible by 6.  Note that 0 is not
 considered to be a divisor of any number, so any number containing a 0
 digit is NOT a number divider.
 ***/
public class NumberDivider {
    /** @param number the number to be tested
     *		Precondition: number >0
     * 	@return true if every decimal digit of number divides evenly
     *		into the number, false otherwise
     */
    public static boolean isNumberDivider(int number)
    {
        //TODO add code here

        for(int i = number; i > 0; i/=10){
            int last = i%10;
            if (last==0){
                return false;
            }
            if (!(number%last == 0)){
                return false;
            }
        }
        return true;
    }

    /** @param start starting point for values to be checker
     *		Precondition: start >0
     *	@param num the size of the array to be returned
     *		Precondition: num > 0
     *	@return an array containing the first num integers >= start
     *		that are number dividers
     **/
    public static int [] firstXNumberDividers(int start, int num)
    {
        int [] a = new int [num];
        //TODO add code here
        for(int i = 0; i < num; i++){
            if(isNumberDivider(start)){
                a[i] = start;
            }
            else{
                i--;
            }
            start++;
        }
        return a;
    }

    public static void main(String[] args) {

        int a = 128, b = 124, c= 26, d = 101;
        System.out.println(isNumberDivider(a));
        System.out.println(isNumberDivider(b));
        System.out.println(isNumberDivider(c));
        System.out.println(isNumberDivider(d));

        int [] divArr = firstXNumberDividers(128, 4);
        System.out.println(Arrays.toString(divArr));
    }

}
/*
true
true
false
false
[128, 132, 135, 144]
 */