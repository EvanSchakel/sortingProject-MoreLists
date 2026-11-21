

public abstract class BaseList implements ListInterface
{
    LLNode list;
    long refChanges;
    long keyCompare;


    public BaseList()
    {
        list = null;
        refChanges = 0;
        keyCompare = 0;
    }


    @Override
    public long getRefChanges()
    {
        return refChanges;
    }


    @Override
    public long getKeyCompare()
    {
        return keyCompare;
    }


    @Override
    public int getDistinctWords()
    {
        int count = 0;
        LLNode curr = list;
        while (curr != null)
        {
            count++;
            curr = curr.getNext();
        }
        return count;
    }


    @Override
    public int getTotalWords()
    {
        int count = 0;
        LLNode curr = list;
        while (curr != null)
        {
            count += curr.getCount();
            curr = curr.getNext();
        }
        return count;
    }


    public LLNode getList()
    {
        return list;
    }
}
