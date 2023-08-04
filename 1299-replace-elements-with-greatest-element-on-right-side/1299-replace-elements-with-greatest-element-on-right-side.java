class Solution {
  /*   public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                }

            }
            arr[i] = max;

        }
        arr[arr.length-1] = -1;

        return arr;
    }*/
    
       public int[] replaceElements(int[] arr) {
        int result[]=new int[arr.length];
        int max = arr[arr.length - 1];
        int j = arr.length - 2;
        for (int i = arr.length - 1; i > 0; i--) {

            max = Math.max(max, arr[i]);
            result[j] = max;
            j--;
        }
        result[arr.length - 1] = -1;

        return result;
    }

}