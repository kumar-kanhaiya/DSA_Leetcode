class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] noOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int aliceCome = getDay(arriveAlice, noOfDays);
        int aliceExit = getDay(leaveAlice, noOfDays);
        int bobCome = getDay(arriveBob, noOfDays);
        int bobExit = getDay(leaveBob, noOfDays);

        int start = Math.max(aliceCome, bobCome);
        int end = Math.min(aliceExit, bobExit);

        return Math.max(0, end - start + 1);
    }

    private int getDay(String date, int[] noOfDays) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int totalDays = day;

        for (int i = 0; i < month - 1; i++) {
            totalDays += noOfDays[i];
        }

        return totalDays;
    }
}