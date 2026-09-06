class Solution {
    public String removeSpaces(String s) {
        // code here
        StringBuilder ans = new StringBuilder();

               for (char c : s.toCharArray()) {
                   if (c != ' ') {
                       ans.append(c);
                   }
               }

               return ans.toString();
    }
}