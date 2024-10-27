import java.util.*;
class UserList
{
    HashMap<Integer,Integer> m;
    UserList()
    {
        m = new HashMap<>();
    }
        int get(int id)
        {
            return m.get(id);
        }

    
    void set(int id,int bal)
    {
        m.put(id,bal);
    }
}
public class UseridAndBalancesHashMapC {

    public static void main(String[] args) {
        UserList users = new UserList();
        
        users.set(1, 100);
        users.set(2, 2000);
        
        System.out.println(users.get(1));
        
        users.set(1, 5000);
        users.set(1, 6000);
        
        System.out.println(users.get(1));
     
    }
}
