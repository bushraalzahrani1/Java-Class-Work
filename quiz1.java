public class quiz1 {
    public static void main(String[] args) {
            Scanner SC = new Scanner(System.in);
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            System.out. printf ("What's %d * %d ? ", X, Y) ;
            int answer = sc.nextInt();

        while (answer == x*y) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            System.out printf("What's %d * %d ? ", x, Y);
            answer = sc. nextInt();
        }
        System.out. printf("Game Over!!");
    }
}
