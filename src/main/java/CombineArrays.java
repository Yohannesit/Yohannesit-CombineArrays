
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        int[] combined = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);

        return combined;
    }
}
