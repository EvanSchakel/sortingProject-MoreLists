






public class List2 extends BaseList
{

    public List2()
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
            int comparison = word.compareTo(current.getWord());

            if (comparison == 0)
            {
                current.incrementCount();
                return;
            }
            else if (comparison < 0)
            {
                break;
            }
            else
            {
                previous = current;
                current = current.getNext();
            }
        }


        if (list == null)
        {

            list = new LLNode(word);
            refChanges++;
        }
        else if (previous == null)
        {

            LLNode newNode = new LLNode(word, list);
            refChanges++;
            list = newNode;
            refChanges++;
        }
        else if (current == null)
        {

            LLNode newNode = new LLNode(word);
            previous.setNext(newNode);
            refChanges++;
        }
        else
        {

            LLNode newNode = new LLNode(word, current);
            refChanges++;
            previous.setNext(newNode);
            refChanges++;
        }
    }
}
