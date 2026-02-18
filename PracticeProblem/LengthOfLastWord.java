class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

s = s.trim();  // remove spaces from start and end
int lastSpace = s.lastIndexOf(' ');  // find last space
return s.length() - lastSpace - 1;   // length of last word
    }
}