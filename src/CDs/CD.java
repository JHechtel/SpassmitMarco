package CDs;

public class CD extends Entry{
    private int songs;

    public int getSongs() {
        System.out.println(this.songs);
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }
}
