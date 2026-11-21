

public class BST implements ListInterface
{
    private BSTNode root;
    private long keyCompare;
    private long refChanges;

    public BST()
    {
        root = null;
        keyCompare = 0;
        refChanges = 0;
    }


    @Override
    public void add(String word)
    {

    }


    public BSTNode minimum(BSTNode x)
    {

        return x;
    }


    public BSTNode successor(BSTNode x)
    {

        return null;
    }

    public int getHeight()
    {

        return 0;
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


    public void printFirst100()
    {

    }
}
