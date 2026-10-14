class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        int nines = sum / 9;
        int rem = sum % 9;

        StringBuilder sb = new StringBuilder(num);
        sb.repeat("9", nines);

        if (rem > 0) {
            sb.append((char) ('0' + rem));
        }

        sb.repeat('0', num - sb.length());

        return sb.toString();
    }
}