public class Main {

    public static void main(String[] args) {
        writeTriangle(5);

    }

    public static void writeTriangle(int numb) throws IllegalArgumentException{
        if (numb < 0) throw new IllegalArgumentException("Argument nie może być wartością ujemną.");
        for (int i = numb; i >= 0; i--){
            for (int k = 0; k < i; k++) System.out.print("#");
            System.out.print("\n");
        }
    }
}
