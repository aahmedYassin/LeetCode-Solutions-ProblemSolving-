
class Solution {

 public int countPrimes(int n) {

        Boolean flag[] = new Boolean[n];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = false;
        }
        int counter = 0;
        for (int i = 2; i < n; i++) {

            if (flag[i] == false) {

                for (int j = i; j < n; j += i) {
                    flag[j] = true;
                }
                counter++;

            }
        }
        return counter;

    }

}
