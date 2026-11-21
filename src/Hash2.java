// Hash2.java - 256-bucket hash table (first character ASCII value)
// Evan Schakel - 11/21/2026
// Resolves collisions using List3 move-to-front chaining in each bucket.

public class Hash2 implements ListInterface
{
    private static final int TABLE_SIZE = 256;
    private LLNode[] table;
    private long keyCompare;
    private long refChanges;

    public Hash2()
    {
        table = new LLNode[TABLE_SIZE];
        keyCompare = 0;
        refChanges = 0;
    }

    // uses ASCII value of the first character (0-255)
    private int stringToHash(String s)
    {
        // TODO: return first char value
        return 0;
    }

    // hashes lowercase word and updates or inserts in bucket chain
    @Override
    public void add(String word)
    {
        // TODO: lowercase word, hash it, and run List3 move-to-front on table[bucket]
    }

    @Override
    public long getKeyCompare()
    {
        return keyCompare;
    }

    @Override
    public long getRefChanges()
    {
        return refChanges;
    }

    @Override
    public int getDistinctWords()
    {
        // TODO: count nodes across all 256 buckets
        return 0;
    }

    @Override
    public int getTotalWords()
    {
        // TODO: sum counts across all 256 buckets
        return 0;
    }
}
