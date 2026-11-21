



public class SLNode
{
    private String word;
    private int count;
    private boolean isSentinel;
    private SLNode up;
    private SLNode down;
    private SLNode left;
    private SLNode right;


    public SLNode(boolean isSentinel)
    {
        this.word = null;
        this.count = 0;
        this.isSentinel = isSentinel;
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
    }


    public SLNode(String word)
    {
        this.word = word;
        this.count = 1;
        this.isSentinel = false;
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public void incrementCount()
    {
        count++;
    }

    public boolean isSentinel()
    {
        return isSentinel;
    }

    public SLNode getUp()
    {
        return up;
    }

    public void setUp(SLNode up)
    {
        this.up = up;
    }

    public SLNode getDown()
    {
        return down;
    }

    public void setDown(SLNode down)
    {
        this.down = down;
    }

    public SLNode getLeft()
    {
        return left;
    }

    public void setLeft(SLNode left)
    {
        this.left = left;
    }

    public SLNode getRight()
    {
        return right;
    }

    public void setRight(SLNode right)
    {
        this.right = right;
    }
}
