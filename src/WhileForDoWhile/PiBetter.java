package WhileForDoWhile;

public class PiBetter {
    public static void main(String[] args) {
        double pi=0;
        int i=0;
        do{
            pi+=4*(Math.pow(-1,i)/(2*i+1));
            i++;

        }while(Math.abs(Math.PI-pi)>0.0001);
        System.out.println(i-1);
        System.out.println(pi);
    }
}
