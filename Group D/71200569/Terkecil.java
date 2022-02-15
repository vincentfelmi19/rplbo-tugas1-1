public class Terkecil {
    public static void main(String[] args) {
        int bil1 = Integer.parseInt(args[0]);
        int bil2 = Integer.parseInt(args[1]);
        int bil3 = Integer.parseInt(args[2]);

        if (bil1 >= bil2 && bil1 >= bil2) {
            System.out.println("Bilangan terbesar = " + bil1);
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            System.out.println("Bilangan terbesar = " + bil2);
        } else if (bil3 >= bil1 && bil3 >= bil2) {
            System.out.println("Bilangan terbesar = " + bil3);
        }
    }
}