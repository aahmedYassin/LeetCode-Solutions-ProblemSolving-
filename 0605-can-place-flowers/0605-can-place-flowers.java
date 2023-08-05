class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean flag = false;
        int counter = 0;

        int i = 0;

        while (i < flowerbed.length) {

            if (flowerbed[i] == 0) {

                int previousElementIndex = i - 1, previousElement, nextElementIndex = i + 1, nextElement;

                if (previousElementIndex < 0) {
                    previousElement = 0;
                } else {
                    previousElement = flowerbed[previousElementIndex];
                }

                if (nextElementIndex == flowerbed.length) {
                    nextElement = 0;
                } else {

                    nextElement = flowerbed[nextElementIndex];
                }

                if (previousElement == 0 && nextElement == 0) {
                    flowerbed[i] = 1;
                    counter++;

                }
            }

            i++;

        }

        if (counter >= n) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }
}