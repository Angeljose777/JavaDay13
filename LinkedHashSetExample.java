import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> playlist = new LinkedHashSet<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song B"); // Duplicate

        System.out.println("Playlist in order:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}

