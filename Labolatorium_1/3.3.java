import java.io.*;
import java.util.*;

public class Main {
    static int max_rec(ArrayList<Integer> lista){
        if(lista.size()>1){
    if(lista.get(0)>lista.get(1)){
        lista.remove(1);
        return max_rec(lista);
    }
    else{
        lista.remove(0);
        return max_rec(lista);
        }}
    else{
      return lista.get(0);
    }
    }

    public static void main(String[] args){
         
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista= new ArrayList<Integer>();
        int wynik;
        String liczby=in.nextLine();
        String[] numerki = liczby.split(" ");
        for(int i=0; i<numerki.length; i++) {
        lista.add(Integer.parseInt(numerki[i]));
        }
        wynik = max_rec(lista);
        System.out.print(wynik);
    }
}
