import java.util.*;
class User
{
    int id,balance;
    User(int i , int b)
{
    id=i;
    balance=b;
}
class UserList
{
    ArrayList<User>  al;
    UserList()
    {
        al = new ArrayList<>();
    }
    int get(int id)
        {
            for(User x :al)
            {
                if(x.id==id)
                {
                    return x.balance;
                }
    
            }
            return -1;
        }
        void set(int id, int bal)
        {
            for(User x : al)
            {
                if(x.id==id)
                {
                    x.balance=bal;
                    return ;
                }
            }
            al.add(new User(id,bal));
        }
    }

}

public class UseridAndBalancesHashMap {
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
