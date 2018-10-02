import java.util.Scanner;

public class Survey{

    public static void menu2(){
        String[] options = {"1) Create a new Survey","2) Display a Survey", "3) Load a Survey", "4) Save a Survey", "5) Quit"};
        for (String option : options) {
            System.out.println(option);
        }

        int val = getUserInput();
        if(val == 1){
            menu3();
        }
    }

    public static void menu3(){
        String[] options = {"1) Add a new T/F question",
                "2) Add a new multiple choice question",
                "3) Add a new short answer question",
                "4) Add a new essay question",
                "5) Add a new ranking question",
                "6) Add a new matching question",
                "7) Quit"};
        for (String option : options) {
            System.out.println(option);
        }
    }

    public static void createTrueOrFalseOption(){
        System.out.println("Enter the prompt for your True/False question:");
    }



    public static int getUserInput(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
}
