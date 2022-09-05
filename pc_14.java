import javax.swing.JOptionPane;
public class pc_14 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number equal or between 1-12 to display the month "));
        switch (num)
        {
            case 1:
                System.out.println("The name of month number1 is january");
                break;
            case 2:
                System.out.println("The name of month number 2 is February");
                break;
            case 3:

                System.out.println("The name of month number 3 is march");
                break;
            case 4:
                System.out.println("The name of month number 4 is April");
                break;
            case 5:
                System.out.println("The name of month number 5 is May");
                break;
            case 6:
                System.out.println("The name of month number 6 is june");
                break;
            case 7:
                System.out.println("The name of month number 7 is July");
                break;
            case 8:
                System.out.println("The name of month number 8 is August");
                break;
            case 9:
                System.out.println("The name of month number 9 is September");
                break;
            case 10:
                System.out.println("The name of month number 10 is October");
                break;
            case 11:
                System.out.println("The name of month number 11 is November");
                break;
            case 12:
                System.out.println("The name of month number 12 is December");
                break;
            default:
                System.out.println("You have entered an invalid input");

        }
    }
}
