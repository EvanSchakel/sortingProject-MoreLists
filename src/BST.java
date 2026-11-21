

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
BSTNode current = root;
BSTNode parent = null;

while (current != null){
    parent = current;
    keyCompare++;

    int comparison = word.compareTo(current.getWord());

    if (comparison == 0){
current.incrementCount();
return;

    }

    else if( comparison < 0){

        current = current.getLeft();
    }

    else{

        current = current.getRight();
    }

    
}
BSTNode newNode = new BSTNode(word);

if (parent == null){

    root = newNode;
    refChanges++;

}
else if (word.compareTo(parent.getWord()) < 0)
    {
     parent.setLeft(newNode);
     newNode.setParent(parent);
     refChanges += 2;
    }
else
    {
        parent.setRight(newNode);
        newNode.setParent(parent);
        refChanges += 2;
    }

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
