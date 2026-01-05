import java.util.ArrayList;

class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> numberCount = new ArrayList<>();
        for (int i = 0 ; i < arr.length ; i++) {
            if (number.contains(arr[i])) {
                int num = number.indexOf(arr[i]);
                numberCount.set(num, numberCount.get(num) + 1);
            } else {
                number.add(arr[i]);
                numberCount.add(1);
            }
        }
        for (int i = 0; i < number.size() ; i++) {
            if (numberCount.get(i) == number.get(i) && number.get(i) > lucky) {
                lucky = number.get(i);
            }
        }
        return lucky;
    }
}