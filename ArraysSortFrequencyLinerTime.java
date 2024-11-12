import java.util.*;;

public class ArraysSortFrequencyLinerTime {
    static void SortByFreq1(int arr[])
    {
   
     Map<Integer,Integer> m = new HashMap<>();
     
      for(int  i =0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        // System.out.println(m);
        // List<List<Integer>> al = new ArrayList<>();
        // int maxFreq = Collections.max(m.values());
        // for(int i =0;i<maxFreq;i++)
        // {
        //     al.add(new ArrayList<Integer>());
        // }
        int maxFreq = Collections.max(m.values());

        // Initialize `al` with `maxFreq + 1` empty lists
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i <= maxFreq; i++) {
            al.add(new ArrayList<Integer>());
        }

        for(Map.Entry<Integer,Integer> e : m.entrySet())
        {
            al.get(e.getValue()).add(e.getKey());
        }
        int index =0;
        // Start from the highest frequency to the lowest
        for (int i = maxFreq; i > 0; i--) {
            for (int x : al.get(i)) {
                for (int j = 0; j < i; j++) {
                    arr[index++] = x;
                }
            }
        }

     
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 5, 10, 10, 20};

		SortByFreq1(arr);
		
        for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
    }
    
}
