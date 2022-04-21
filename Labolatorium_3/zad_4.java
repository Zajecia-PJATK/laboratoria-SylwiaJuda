import java.util.Random;

class RandomNumbers{
private static int tab[]={9,19,29,39,49,59,69,79,89,99};
    public static int randomElements(){
       Random r1 = new Random();
       return tab[r1.nextInt()%10];

    }
}
public class Main {

    public static void main(String[] args) {
       String r= Integer.toString(RandomNumbers.randomElements());
System.out.printf(r);

    }
}
