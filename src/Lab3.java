



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab3
{
    private static Scanner input = null;
    private static final String PUNCTUATION = "!@#$%^&*()_+-=[]\\{}|;:'\"`~,./<>?";


    public static void main(String[] args)
    {
        String fileName = (args.length == 0) ? "Hamlet.txt" : args[0];

        File file = new File(fileName);
        if (!file.exists() && args.length == 0)
        {
            File parentFile = new File("../Hamlet.txt");
            if (parentFile.exists())
            {
                file = parentFile;
            }
        }







        ListInterface[] Lists = new ListInterface[6];
        Lists[0] = new List3();
        Lists[1] = new SkipList();
        Lists[2] = new Hash1();
        Lists[3] = new Hash2();
        Lists[4] = new Hash3();
        Lists[5] = new BST();

        String[] listNumbers = {"3", "5", "6", "7", "8", "9"};

        String[] ListNames =
        {
            "Self-Adj (Front)",
            "Skip List",
            "Hash 1",
            "Hash 2",
            "Hash 3",
            "Binary Tree"
        };

        double[] runTimes = new double[Lists.length];

        try
        {
            long grossStart = System.currentTimeMillis();

            warmupPass(file);
            long overheadTime = runPass(file, null);

            for (int i = 0; i < Lists.length; i++)
            {
                runTimes[i] = runPass(file, Lists[i]) / 1000.0;
            }

            long grossElapsed = System.currentTimeMillis() - grossStart;

            System.out.println(" #    List Name      Run Time  Vocabulary  Total Words   Key Comp     Ref Chgs    h");
            System.out.println("-- ----------------- --------  ----------  ----------- ------------ ------------ ---");
            for (int i = 0; i < Lists.length; i++)
            {
                if (Lists[i] instanceof SkipList)
                {
                    System.out.printf("%2s %-17s %8.3f  %9d  %11d  %12d %12d %3d%n",
                        listNumbers[i], ListNames[i], runTimes[i],
                        Lists[i].getDistinctWords(), Lists[i].getTotalWords(),
                        Lists[i].getKeyCompare(), Lists[i].getRefChanges(),
                        ((SkipList) Lists[i]).getHeight());
                }
                else if (Lists[i] instanceof BST)
                {
                    System.out.printf("%2s %-17s %8.3f  %9d  %11d  %12d %12d %3d%n",
                        listNumbers[i], ListNames[i], runTimes[i],
                        Lists[i].getDistinctWords(), Lists[i].getTotalWords(),
                        Lists[i].getKeyCompare(), Lists[i].getRefChanges(),
                        ((BST) Lists[i]).getHeight());
                }
                else
                {
                    System.out.printf("%2s %-17s %8.3f  %9d  %11d  %12d %12d%n",
                        listNumbers[i], ListNames[i], runTimes[i],
                        Lists[i].getDistinctWords(), Lists[i].getTotalWords(),
                        Lists[i].getKeyCompare(), Lists[i].getRefChanges());
                }
            }

            System.out.printf("%nOverhead Time: %d ms%n", overheadTime);
            System.out.printf("Gross Elapsed Time: %.3f seconds%n%n", grossElapsed / 1000.0);

            ((BST) Lists[5]).printFirst100();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + fileName);
        }
    }

    private static void warmupPass(File file) throws FileNotFoundException
    {
        input = new Scanner(file);
        while (input.hasNext())
        {
            input.next();
        }
        input.close();
    }

    private static long runPass(File file, ListInterface target) throws FileNotFoundException
    {
        long startTime = System.currentTimeMillis();
        input = new Scanner(file);
        while (input.hasNext())
        {
            String word = cleanToken(input.next());
            if (target != null && word != null)
            {
                target.add(word);
            }
        }
        input.close();
        return System.currentTimeMillis() - startTime;
    }

    public static String cleanToken(String rawToken)
    {
        if (rawToken == null || rawToken.isEmpty())
        {
            return null;
        }

        int start = 0;
        int end = rawToken.length();

        while (start < end && PUNCTUATION.indexOf(rawToken.charAt(start)) >= 0)
        {
            start++;
        }

        while (end > start && PUNCTUATION.indexOf(rawToken.charAt(end - 1)) >= 0)
        {
            end--;
        }

        if (start == end)
        {
            return null;
        }

        String word = rawToken.substring(start, end).toLowerCase();

        for (int i = 0; i < word.length(); i++)
        {
            if (Character.isLetter(word.charAt(i)))
            {
                return word;
            }
        }
        return null;
    }
}
