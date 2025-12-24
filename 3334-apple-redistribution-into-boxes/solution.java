class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        int boxesUsed = 0;

        for (int a : apple) {
            totalApples += a;

        }

        Arrays.sort(capacity);

        for (int i = capacity.length - 1; i >=0 && totalApples > 0; i--) {
            totalApples -= capacity[i];
            boxesUsed++;
        }

        return boxesUsed;

    }
}
