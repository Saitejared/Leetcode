class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder complement = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                complement.append('0');
            } else if (bit == '0') {
                complement.append('1');
            }
        }
         int result = Integer.parseInt(complement.toString(), 2);
         return result;
    }
}