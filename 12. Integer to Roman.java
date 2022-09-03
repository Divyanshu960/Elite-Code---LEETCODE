class Solution {
    
    public String intToRoman(int num) {
        if(num <= 0) return "";
	        String[] roman = {"M", "CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; num != 0; i++){
	            while(num >= n[i]){
	                num -= n[i];
	                sb.append(roman[i]);
	            }
	        }
	        return sb.toString();
    }
}aaaa
