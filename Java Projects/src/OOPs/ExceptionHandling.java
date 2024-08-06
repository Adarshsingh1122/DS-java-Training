package OOPs;

public class ExceptionHandling
 {
    public static void main(String[] args) {
        try {
            System.out.println("100/0");
        }  catch(Exception exception) {
            System.out.println(exception);
        }
        String name =null;
        try {
            System.out.println(name.length());
        }
        catch(Exception nam){
            System.out.println(nam);

        }
        String fullname ="Adarsh";
        try {
            int z=Integer.parseInt(fullname);
        }
        catch(Exception it) {
            System.out.println(it);
        }
        int arr[] = {1,2,3,4,};
        try {
            System.out.println(arr[6]);
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }
    }
}
