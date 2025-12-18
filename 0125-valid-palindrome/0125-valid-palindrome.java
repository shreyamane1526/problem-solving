class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder p=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                p.append(s.charAt(i));
            }
        }
        String m=p.toString();
        if(m.equals(p.reverse().toString())){
            return true;
        }
        return false;
    }
}