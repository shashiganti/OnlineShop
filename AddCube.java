import java.util.Scanner;

public class AddCube{

public static void main(String args[]){

Scanner in = new Scanner(System.in);
System.out.println("Enter number of Iterations:  ");

int n = in.nextInt();

int sum = 0;

for(int i=1;i<=n;i++){

System.out.println(i*i*i);

sum += i*i*i*i;

}
System.out.println("The total Sum of Cube Numbers:  " +sum);

}
}
