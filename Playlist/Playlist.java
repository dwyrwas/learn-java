import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList();
    desertIslandPlaylist.add("Hello");
    desertIslandPlaylist.add("Glamorous");
    desertIslandPlaylist.add("American Pie");
    desertIslandPlaylist.add("Mr. Brightside");
    desertIslandPlaylist.add("Tomorrowland");
    desertIslandPlaylist.add("Oasis");
    desertIslandPlaylist.remove(1);
    int song1 = desertIslandPlaylist.indexOf("Mr. Brightside");
    int song2 = desertIslandPlaylist.indexOf("Hello");
    String temp = desertIslandPlaylist.get(song1);
    desertIslandPlaylist.set(song1, desertIslandPlaylist.get(song2));
    desertIslandPlaylist.set(song2, temp);
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
  }
  
}
