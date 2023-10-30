package WhileForDoWhile;

public class PrintFor4 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int i = 0; i < 5; i++) {
                if(i<=x){
                    System.out.print('#');}
                else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
