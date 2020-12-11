package hashing;

public class ChainingHashTable implements HashTable {
    
    // YOUR CODE GOES HERE

    private int hash(String key) {
        final int z = 33;

        int code = 0;
        int factor = 1;
        for (int i = 0; i < key.length(); i++) {
            code += key.charAt(i) * factor;
            factor *= z;
        }
        return Math.abs(code) % hashTable.length;
    }

}
