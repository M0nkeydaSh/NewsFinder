package NewsFinder;

public class NewsInfo {
    public String category;
    public String author;
    public String lyrics;

    public NewsInfo (String category, String author, String lyrics){
        this.category = category;
        this.author = author;
        this.lyrics = lyrics;
    }
    @Override
    public String toString() {
        return "Категория - " + this.category + "\n" +"Автор - " + this.author;
    }
    public  String getPrettyExplanation(){
        return this.lyrics.replaceAll("[.?!,]", "\n");
    }

}
