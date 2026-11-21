// SkipList.java - Multi-lane Skip List
// Evan Schakel - 11/21/2026
// Uses SLNode sentinels and coin flips to build express lanes above the slow lane.

import java.util.Random;

public class SkipList implements ListInterface
{
    private SLNode head;      //top-left sentinel
    private SLNode tail;      //top-right sentinel
    private int height;       //number of lanes
    private int size;         //distinct words in slow lane
    private long keyCompare;
    private long refChanges;
    private boolean found;    //set by search() if word is already in slow lane
    private Random rand;

    // sets up empty slow lane with left and right sentinels
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

    // look-and-leap search returning slow-lane node <= word
    public SLNode search(String word)
    {
        // TODO: implement search and set found flag
        found = false;
        return head;
    }

    // adds word to skip list or increments count if already present
    @Override
    public void add(String word)
    {
        // TODO: implement add + coin-flip lane promotion
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
        // TODO: walk slow lane and sum counts
        return 0;
    }
}
