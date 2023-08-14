class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int counter = 0;

        for (int i : hours) {
            if (i >= target) {
                counter++;
            }
        }

        return counter;
    }
}