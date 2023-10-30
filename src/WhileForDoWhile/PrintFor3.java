package WhileForDoWhile;

public class PrintFor3 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int i = 0; i < 5; i++) {
                if(i%2==0){
                System.out.print('#');}
                else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
