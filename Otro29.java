public class Otro29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = Scanner.nextInt();
        switch (contadorDigitos(numero)){
                case 1: 
                System.out.println("pocos");
                break;
        default:
                System.out.println("muchos");
        }
}
