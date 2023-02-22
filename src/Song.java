import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> newArr;
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        newArr = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList<String> name){
        name.replaceAll(String::toLowerCase);
        int total = 0;
        for(int i = 0; i < name.size(); i++){
            if(!newArr.contains(name.get(i))){
                total++;
                newArr.add(name.get(i));
            }
        }
        return total;
    }
}
