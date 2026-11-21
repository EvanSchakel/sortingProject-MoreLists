



public class List1 extends BaseList
{

    public List1()
    {
        super();
    }




    @Override
    public void add(String word)
    {
        LLNode curr = list;

        while (curr != null)
        {
            keyCompare++;
            if (word.equals(curr.getWord()))
            {
                curr.incrementCount();
                return;
            }
            curr = curr.getNext();
        }


        LLNode newNode = new LLNode(word, list);
        refChanges++;
        list = newNode;
        refChanges++;
    }
}
