



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


    private int stringToHash(String s)
    {
        long hash = 0;
        for (int i = 0; i < s.length(); i++)
        {
            hash = (hash * 15) + s.charAt(i);
        }
        return (int) (hash & 255);
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
