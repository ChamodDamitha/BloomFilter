import java.util.BitSet;

/**
 * Created by chamod on 7/19/17.
 */
public class BloomFilter {

//  bit array to keep track of hashed values
    private BitSet bitSet;
    private int sizeOfBitSet;
    private int expectNoOfElements;
    private int insertedNoOfElements;
    private int noOfHashFunctions;

    /**
     *
     * @param sizeOfBitSet is the size of bit array
     * @param expectNoOfElements is the expected number of insertions
     * @param noOfHashFunctions is the number of hash functions to be used
     */
    private BloomFilter(int sizeOfBitSet, int expectNoOfElements, int noOfHashFunctions) {
        this.expectNoOfElements = expectNoOfElements;
        this.noOfHashFunctions = noOfHashFunctions;
        this.sizeOfBitSet = sizeOfBitSet;
        this.bitSet = new BitSet(sizeOfBitSet);
    }

    /**
     *
     * @param expectNoOfElements is the expected number of insertions
     * @param falsePositiveProbability is the false probability of the bloom filter
     */
    public static BloomFilter createBloomFilter(int expectNoOfElements, double falsePositiveProbability) {
//      m = -nln(p)/(ln(2))^2
        int sizeOfBitSet = - (int)Math.ceil(expectNoOfElements * Math.log(falsePositiveProbability)
                / Math.pow(Math.log(2),2));
//      k = mln(2)/n
        int noOfHashFunctions = (int)Math.ceil(sizeOfBitSet * Math.log(2) / expectNoOfElements);

        return new BloomFilter(sizeOfBitSet, expectNoOfElements, noOfHashFunctions);
    }

    /**
     * Compute a cell position in the bit array for a given hash value
     * @param hash is the integer hash value generated from some hash function
     * @return
     */
    private int getBitIndex(int hash){
        return Math.abs(hash % sizeOfBitSet);
    }


}
