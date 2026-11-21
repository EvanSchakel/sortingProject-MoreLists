// BSTNode.java - Node class for Binary Search Tree
// Evan Schakel - 11/21/2026
// Holds word, count, and left/right/parent links.

public class BSTNode
{
    private String word;
    private int count;
    private BSTNode left;
    private BSTNode right;
    private BSTNode parent;

    public BSTNode(String word)
    {
        this.word = word;
        this.count = 1;
        this.left = null;
        this.right = null;
        this.parent = null;
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

    public BSTNode getLeft()
    {
        return left;
    }

    public void setLeft(BSTNode left)
    {
        this.left = left;
    }

    public BSTNode getRight()
    {
        return right;
    }

    public void setRight(BSTNode right)
    {
        this.right = right;
    }

    public BSTNode getParent()
    {
        return parent;
    }

    public void setParent(BSTNode parent)
    {
        this.parent = parent;
    }
}
