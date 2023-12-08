package CDs;

public class Main {
    public static void main(String[] args) {
        VCD vcd= new VCD();

        vcd.setSongs(20);
        vcd.setTitle("Mama Mia");
        vcd.getSongs();
        vcd.getTitle();


        DVD dvd= new DVD();

        //dvd.setSongs(20);
        dvd.setTitle("Matrix");
        //dvd.getSongs();
        dvd.getTitle();
    }
}
