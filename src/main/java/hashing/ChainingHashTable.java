package hashing;

public class ChainingHashTable implements HashTable {
    Student[] hashTable;
    
    // YOUR CODE GOES HERE
    public Student get(String key){
        return hashTable[key];
    }

    public Student put(String key, Student newValue){
        int hash = hash(key);
        if (this.hashTable[hash] == null){
            this.hashTable[hash] = newValue;
        }
        else{
            int newHash = rehash(hash);
            probeCount++;
            while (this.values.get(newHash) != null){
                newHash = rehash(newHash);
                probeCount++;
            }
            this.values.set(newHash, value);
        }
    }

    public Collection<String> keySet(){
        
    }

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
