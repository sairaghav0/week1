
import java.util.Scanner;
public class week1_lab_program1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int state=0,i=0;
        char current;
        String input=sc.nextLine();

        for(i=0;i<input.length();i++){

            current=input.charAt(i);

            switch (state)
            {

                case 0:
                    if(current=='a'){
                        state=1;
                    }
                    else if(current=='b'){
                        state=2;

                    }
                    else{
                        System.out.println("Invalid token");
                    }
                    break;
                case 1:
                    if(current=='a'){
                        state=0;

                    }
                    else if(current=='b'){
                        state=3;
                    }
                    else {
                        System.out.println("Invalid token");
                    }
                    break;
                case 2:
                    if(current=='a'){
                        state=3;
                    }
                    else if(current=='b'){
                        state=0;
                    }
                    else{
                        System.out.println("Invalid token");
                    }
                    break;
                case 3:
                    if(current=='a'){
                        state=2;

                    }
                    else if(current=='b'){
                        state=1;

                    }
                    else{
                        System.out.println("Invalid token");
                    }
                    break;
            }

        }
        if(state==0){
            System.out.println("String is accepted");
        }
        else {
            System.out.println("String not accepted");
        }

    }
}

