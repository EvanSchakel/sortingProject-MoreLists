// BST.java - Binary Search Tree for Lab 3
// Evan Schakel - 11/21/2026
// Iterative add() plus recursive traversals and minimum/successor for top 100 output.

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

    // iterative add from class lecture (defer creating node until miss)
    @Override
    public void add(String word)
    {
        // TODO: implement iterative BST insert
    }

    // returns smallest node in subtree rooted at x
    public BSTNode minimum(BSTNode x)
    {
        // TODO: walk left pointers while non-null
        return x;
    }

    // returns next node in alphabetical order using parent pointer
    public BSTNode successor(BSTNode x)
    {
        // TODO: case 1 (minimum of right subtree) and case 2 (walk up right links)
        return null;
    }

    public int getHeight()
    {
        // TODO: recursive height calculation
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
        // TODO: recursive distinct word count
        return 0;
    }

    @Override
    public int getTotalWords()
    {
        // TODO: recursive total word sum
        return 0;
    }

    // prints first 100 alphabetical words using minimum() and successor()
    public void printFirst100()
    {
        // TODO: walk first 100 nodes via minimum(root) and successor()
    }
}
