package NewsFinder;



public class NewsDownloader {
    public void downloader (NewsInfo info){
        System.out.println("Скачивается " + "\n" + info);
        System.out.println(info.getPrettyExplanation());

    }
}
