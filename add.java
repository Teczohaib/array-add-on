import java.util.*;
public class add{
    public static void solution(ArrayList<Integer> al){
for(int i =al.size()-1;i>=0;i--){
    if(isprime(al.get(i))==true){
        al.remove(i);
    }
}
    }
    public static boolean isprime(int n){
        for(int div=2;div*div<=n;div++){
            if(n%div==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        for (int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
}