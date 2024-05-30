import java.util.ArrayList;
import java.util.List;

public class SortedList
{
    private List<String> list = new ArrayList<String>();
    private SortStrategy sortstrategy;
    public void SetSortStrategy(SortStrategy sortstrategy)
    {
        this.sortstrategy = sortstrategy;
    }
    public void Add(String name)
    {
        list.add(name);
    }
    public void Sort()
    {
        sortstrategy.Sort(list);
        // Iterate over list and display results
        for(String name : list)
        {
            System.out.println(" " + name);
        }
    }
}