package WhileForDoWhile;

public class PiFor {
    public static void main(String[] args) {
        double pi=0;
        for(int i=0;;i++){
            pi+=4*(Math.pow(-1,i)/(2*i+1));
            if(Math.abs(Math.PI-pi)<0.0001){
                System.out.println(i);
                break;
            }

        }
        System.out.println(pi);
    }
}
