/*
Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases.
If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
You are responsible to gather all the input requirements up front.

Update (2015-02-10):
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
*/

public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        str = str.trim();
        
        char sgn = '+'; int i = 0;
        if(str.charAt(0) == '+') i++;
        else if(str.charAt(0) == '-') {
            sgn = '-'; i++;
        } 
        double res = 0; //long type would not be enough for digits
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            res = res * 10 + (str.charAt(i) - '0');
            i++;
        }
        if(sgn == '-') res = -res;
        if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int)res;
    }
}
