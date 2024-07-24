import java.util.Scanner;
public class CheckevenNoUsingForContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(i%2 == 0){
                System.out.println("odd" +i);
            }
              else{
                  System.out.println("even" +i);
            }
        }
    }
}
