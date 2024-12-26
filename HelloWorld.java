import java.util.Scanner; //import scanner class for user i/p
public class HelloWorld{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
//Use next() to take a single word.
//Or nextLine() to take a full line.
//Or next().charAt(0) to take a single character.
	String text;
	System.out.println("Enter the text you wanna print");
	text = sc.nextLine();
	System.out.println(text);
	sc.close(); //close Scanner
    }
}