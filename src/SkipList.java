



import java.util.Random;

public class SkipList implements ListInterface
{
    private SLNode head;
    private SLNode tail;
    private int height;
    private int size;
    private long keyCompare;
    private long refChanges;
    private boolean found;
    private Random rand;


    public SkipList()
    {
        head = new SLNode(true);
        tail = new SLNode(true);
        head.setRight(tail);
        tail.setLeft(head);
        height = 1;
        size = 0;
        keyCompare = 0;
        refChanges = 0;
        found = false;
        rand = new Random();
    }


    public SLNode search(String word)
    {

        found = false;
        return head;
    }


    @Override
    public void add(String word)
    {

    }

    public int getHeight()
    {
        return height;
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
        return size;
    }

    @Override
    public int getTotalWords()
    {

        return 0;
    }
}
