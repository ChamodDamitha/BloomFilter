/**
 * Created by chamod on 7/19/17.
 */
public class Main {
    public static void main(String[] args) {
        BloomFilter<Integer> bloomFilter = BloomFilter.createBloomFilter(10000000, 0.3);

        for (int i = 0; i < 100; i++){
            bloomFilter.insert(i);
        }

        int j = 0;
        for (int i = 100; i < 10000000; i++){
            if(bloomFilter.mayContain(i)){
                j++;
            }
        }

        System.out.println("false positive probability = " + (j / 10000000.0) );
    }
}
