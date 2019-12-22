
package profiling;

import java.util.Scanner;
public class Profiling {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("What is your name?");
        String wordInput = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Where do you live?");
        String address = sc.nextLine();
        System.out.println("What is your Gender?");
        String gender = sc.nextLine();
        System.out.println("What is your status?");
        String status = sc.nextLine();
        System.out.println("When is your birthday?");
        String birthday = sc.nextLine();
        System.out.println("What is your hobby?");
        String hobby = sc.nextLine();
        System.out.println("What is your blood type?");
        String bloodtype = sc.nextLine();
        
        System.out.println("Name:" +wordInput);
        System.out.println("Age:" +age);
        System.out.println("Address:" +address);
        System.out.println("Gender:" +gender);
        System.out.println("Status:" +status);
        System.out.println("Birthday:" +birthday);
        System.out.println("Hobby:" +hobby);
        System.out.println("Blood type:" +bloodtype);
    }
    }
    }
    
}\
