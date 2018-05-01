/*
* Виведення слова JAVA
*
 */
import java.util.Scanner;

public class Slovo {

    // ввести в консолі слово
    public static void main(String[] args)
    {
        String slovo;
        String propusk = "   ";
        Scanner inputeDevice=new Scanner(System.in);

        System.out.print("Введіть slovo ");
        slovo=inputeDevice.next();

        char l0= slovo.charAt(0);
        char l1 = slovo.charAt(1);
        char l2= slovo.charAt(2);
        char l3 = slovo.charAt(3);

        System.out.println("      " + l0 + propusk + "    " + l1 + "    " + propusk + l2 + "       " + l2 + propusk  + "    " + l3 + "    " + propusk );
        System.out.println("      " + l0+ propusk + "   " + l1 + " " + l1 + "   "+ propusk + " " + l2 + "     " + l2 +" " + propusk + "   " + l3 + " " + l3 + "   "+ propusk );
        System.out.println("      " + l0+ propusk + "  " + l1 + "   " + l1 + "  " + propusk + "  " + l2 + "   " + l2 + "  " + propusk + "  " + l3 + "   " + l3 + "  " + propusk);
        System.out.println(" " + l0 + "    " + l0+ propusk + " " + l1 + l1 + l1 + l1 + l1 +l1 + l1 + " " + propusk + "   " + l2 + " " + l2 + "   " + propusk  + " " + l3 + l3 + l3 + l3 + l3 +l3 + l3 + " " + propusk);
        System.out.println(" " + l0 + l0 + l0 + l0 + l0 + l0+ propusk + l1 + "       " + l1 + propusk + "    " + l2 + "    " + propusk + l3 + "       " + l3 + propusk);
    }


}
