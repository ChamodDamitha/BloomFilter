/*
* Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/
public class Main {
    public static void main(String[] args) {
        BloomFilter<Integer> bloomFilter = BloomFilter.createBloomFilter(10000000, 0.1);

        for (int i = 0; i < 100; i++){
            bloomFilter.insert(i);
        }

        int j = 0;
        for (int i = 100; i < 1000000000; i++){
            if(bloomFilter.mayContain(i)){
                j++;
            }
        }

        System.out.println("false positive probability = " + (j / 1000000000.0) );
    }
}
