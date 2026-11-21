// Hash3.java - 256-bucket hash table (rolling polynomial hash)
// Evan Schakel - 11/21/2026
// Resolves collisions using List3 move-to-front chaining in each bucket.

public class Hash3 implements ListInterface
{
    private static final int TABLE_SIZE = 256;
    private LLNode[] table;
    private long keyCompare;
    private long refChanges;

    public Hash3()
    {
        table = new LLNode[TABLE_SIZE];
        keyCompare = 0;
        refChanges = 0;
    }

    // 8-bit rolling polynomial hash from Lab 3 handout
    private int stringToHash(String s)
    {
        long hash = 0;
        for (int i = 0; i < s.length(); i++)
        {
            hash = (hash * 15) + s.charAt(i);
        }
        return (int) (hash & 255);
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
