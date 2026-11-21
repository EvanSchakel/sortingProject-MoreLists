




public class List3 extends BaseList
{

    public List3()
    {
        super();
    }




    @Override
    public void add(String word)
    {
        LLNode current = list;
        LLNode previous = null;

        while (current != null)
        {
            keyCompare++;

            if (word.equals(current.getWord()))
            {
                current.incrementCount();


                if (previous != null)
                {
                    previous.setNext(current.getNext());
                    refChanges++;

                    current.setNext(list);
                    refChanges++;

                    list = current;
                    refChanges++;
                }
                return;
            }

            previous = current;
            current = current.getNext();
        }


        LLNode newNode = new LLNode(word, list);
        refChanges++;
        list = newNode;
        refChanges++;
    }
}
