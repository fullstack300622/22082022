import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

//        int x = s.nextInt();
//        s.nextLine();
//        System.out.println(x);
//        String myString = s.nextLine();
//        System.out.println(myString);

        System.out.println("Please enter a id ");
        boolean isValidInput=false;
        while (!isValidInput){
            try {
                int id =s.nextInt();
                isValidInput=true;
            }catch (Exception e){
                s.nextLine();
                System.out.println("You should enter a valid number");
            }
        }





//        System.out.println("Please enter number");
//        try {
////            int x = s.nextInt();
//            String myString = "asdweqd";
//            int t = Integer.parseInt(myString);
//            System.out.println("Number is: "+t);
//
//        }catch (Exception e){
//            System.out.println("Mr you have to enter a valid input number");
//        }finally {
//            System.out.println("This will work no matter what");
//        }
//



    }
}
