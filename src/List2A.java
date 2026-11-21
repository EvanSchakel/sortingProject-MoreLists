



public class List2A extends BaseList
{
    private LLNode lastNode;


    public List2A()
    {
        super();
        lastNode = null;
    }





    @Override
    public void add(String word)
    {
        LLNode current;
        LLNode previous = null;

        if (lastNode != null)
        {
            keyCompare++;
            int lastComparison = word.compareTo(lastNode.getWord());

            if (lastComparison >= 0)
            {
                current = lastNode;
            }
            else
            {
                current = list;
            }
        }
        else
        {
            current = list;
        }

        while (current != null)
        {
            keyCompare++;
            int comparison = word.compareTo(current.getWord());

            if (comparison == 0)
            {
                current.incrementCount();
                lastNode = current;
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

        LLNode newNode;
        if (list == null)
        {
            newNode = new LLNode(word);
            list = newNode;
            refChanges++;
        }
        else if (previous == null)
        {

            newNode = new LLNode(word, list);
            refChanges++;
            list = newNode;
            refChanges++;
        }
        else if (current == null)
        {

            newNode = new LLNode(word);
            previous.setNext(newNode);
            refChanges++;
        }
        else
        {

            newNode = new LLNode(word, current);
            refChanges++;
            previous.setNext(newNode);
            refChanges++;
        }

        lastNode = newNode;
    }
}
