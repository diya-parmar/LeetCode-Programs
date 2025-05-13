class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            int currentValue = getValue(s.charAt(i));
            if(i + 1 < s.length() && currentValue < getValue(s.charAt(i + 1))){
                result -= currentValue;
            }else{
                result += currentValue;
            }
        }
        return result;
    }
    private int getValue(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
    }
}
