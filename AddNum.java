
import java.util.Scanner;

public class AddNum{

public static void main(String args[]){

//int i = 0;
int n = 0;
int sum = 0;

Scanner in = new Scanner(System.in);
System.out.println("Enter any number: ");
n = in.nextInt();
for(int i=0; i<=10; i++){

System.out.println(i);
sum += i; 
}
System.out.println("The total Sum of Natural Numbers:  " +sum);


}

}