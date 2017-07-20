/**
 * Created by chamod on 7/19/17.
 */
public class Main {
    public static void main(String[] args) {
        BloomFilter<Integer> bloomFilter = BloomFilter.createBloomFilter(100, 0.5);

        bloomFilter.insert(34);

        System.out.println("False Positive Probability : " + bloomFilter.getFalsePositiveProbability());
    }
}
