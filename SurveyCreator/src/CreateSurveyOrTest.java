import java.util.Scanner;

public class CreateSurveyOrTest {

    public static void main(String[] args) {

        String[] options = {"1) Survey", "2) Test"};
        for (String option : options) {
            System.out.println(option);
        }

        int input = getUserInput();
        if(input == 1){
            Survey.menu2();
        }
        else if(input == 2){
            Test.menu2();
        }
        else{
            System.out.println("Please enter a valid choice.");
        }
    }

    public static int getUserInput(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
}
