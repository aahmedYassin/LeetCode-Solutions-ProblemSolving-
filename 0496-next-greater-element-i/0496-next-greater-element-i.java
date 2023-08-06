
class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int greaterElements[] = new int[nums1.length];
        int numbers[] = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            numbers[i] = -1;
        }

        Stack<Integer> index = new Stack<>();
        int i = 0;
        while (i < nums2.length) {

            if (index.isEmpty()) {
                index.push(i);
                i++;
            }

            else if (nums2[index.peek()] >= nums2[i]) {

                index.push(i);
                i++;

            } else {

                numbers[index.pop()] = nums2[i];
            }

        }

      

        for (int j = 0; j < nums1.length; j++) {
            for (int k = 0; k < nums2.length; k++) {

                if (nums1[j] == nums2[k]) {
                    greaterElements[j] = numbers[k];
                    break;
                }
            }
       }

        return greaterElements;
    }
}
