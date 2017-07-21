//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Created by chamod on 7/20/17.
// */
//public class BloomFilterTest {
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @Test
//    public void mayContain() throws Exception {
//        BloomFilter<Integer> bloomFilter = BloomFilter.createBloomFilter(100, 0.1);
//
//        for (int i = 0; i < 100; i++){
//            bloomFilter.insert(i);
//        }
//
//        for (int i = 0; i < 100; i++){
//            assertEquals(true, bloomFilter.mayContain(i));
//        }
//    }
//
//}