import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter one of  :");
        String user = s.nextLine();

        if(user.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");
        }
        else if (user.equalsIgnoreCase("superuser"))
            System.out.println("Welcome superuser ");
        else if (user.equalsIgnoreCase("user"))
        System.out.println("Welcome user");
        else {
            System.out.println(" just one of,admin,superuser,user");
        }
}





    }
        //continue
//        System.out.println("Enter age ");
//        int age =s.nextInt();
//
//        if ( age <= 13 ){
//            System.out.println("He is chaild ");
//
//        } else if (age >=13 && age <= 17) {
//            System.out.println("He is teenager ");
//        } else if ((age >=18 && age <=64)) {
//
//            System.out.println("aa");
//
//        } else {
//            System.out.println("ed");
//        }
//


//
//        System.out.println("Enter mark :");
//        int mark = s.nextInt();
//        if(mark >=0 && mark <=100){
//            if (mark >=90){
//                System.out.println("A");
//            } else if (mark >=80) {
//                System.out.println("B");
//            } else if (mark >=70) {
//                System.out.println("c");
//            } else if (mark >=60) {
//                System.out.println("d");
//            }
//            else {
//                System.out.println("F");
//            }
//        }else{
//            System.out.println("not in the range of marks");
//        }
//



//        if(number1 > 0 ) {
//            System.out.println("pos");
//        }
//        else if (){
//            System.out.println("");
//
//
//
//        } else {
//            System.out.println("negtive");
//        }


//
//        System.out.println("Enter your word :");
//        String word = s.nextLine();
//
//        System.out.println("Enter your word :");
//        String word2 = s.nextLine();
//        if(word.equalsIgnoreCase(word2)){
//            System.out.println(" its same ");
//        }
//        else {
//
//            System.out.println(word);
//            System.out.println("its not same");
//        }











//
//        System.out.println("Enter your mark :");
//        int mark = s.nextInt();
//        if(mark >= 60 && mark <=100){
//            System.out.println("pass");
//        }
//        else{
//            System.out.println("failed ");
//        }















//
//        System.out.println("Enter your name :");
//        String name = s.nextLine();
//
//        if (name.length() < 8) {
//            System.out.println("the is short ");
//            System.out.println(name.length());
//        }
//        System.out.println("Enter your age :");
//        int age = s.nextInt();
//
//        if(age > 18 )
//            System.out.println("join to our bootcamp :");

//
//       else
//            System.out.println("odd");
//    }
//        System.out.println("Enter one word : ");
//        String word = s.nextLine();
//        System.out.println("Enter soc word :");
//        String word2 = s.nextLine();
//        if(word.equalsIgnoreCase(word2)){
//
//            System.out.println("it is same");



