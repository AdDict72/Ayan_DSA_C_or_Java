// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer num, return its complement.

 

// Example 1:

// Input: num = 5
// Output: 2
// Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
// Example 2:

// Input: num = 1
// Output: 0
// Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 
//solution 1:
// class Solution {
//     public int findComplement(int num) {
//        String str = decimalToBinary(num);
//        System.out.println(str);
//         StringBuilder complement = new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == '0') {
//                 complement.append('1');
//             } else if (str.charAt(i) == '1') {
//                 complement.append('0');
//             }
//         }

//        System.out.println(complement.toString());

//        int num_com = binaryToDecimal(complement.toString());
//        return num_com;
//     }
//     public String decimalToBinary(int num){
//         StringBuilder binary = new StringBuilder();

//         while(num>0){
//             int remainder = num % 2;
//             binary.insert(0,remainder);
//             num = num / 2;
//         }


//         return binary.toString(); 
//     }
//     public int binaryToDecimal(String s) {
//         int decimal=Integer.parseInt(s,2);  
//         System.out.println(decimal);  

//         return decimal;
//     }
// }

// solution 2:
class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
    }
}
