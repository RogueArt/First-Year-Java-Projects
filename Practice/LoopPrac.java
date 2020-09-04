public class LoopPrac {
    private int x = 3;
    private int y = 2;
    private int z = 1;
    public int[] biggerArray(int x, int y, int z) {
    int[] nums = {x, y, z};
    int[] largeArray = new int[nums.length * 2];
    for (int n = 0; n < nums.length; n++){
       largeArray[n] = nums[n];
    }
    return largeArray;
}
}