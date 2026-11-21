

public class Hash1 implements ListInterface
{
    private static final int TABLE_SIZE = 256;
    private LLNode[] table;
    private long keyCompare;
    private long refChanges;

    public Hash1()
    {
        table = new LLNode[TABLE_SIZE];
        keyCompare = 0;
        refChanges = 0;
    }


    private int stringToHash(String s)
    {

        return 0;
    }


    @Override
    public void add(String word)
    {

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

        return 0;
    }

    @Override
    public int getTotalWords()
    {

        return 0;
    }
}
