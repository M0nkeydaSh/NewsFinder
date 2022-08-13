package NewsFinder;

public class NewsShowroom {
    public void show() {
        NewsFinder finder = new NewsFinder();
        System.out.println("Поиск новостей");
        NewsInfo news = finder.findNews();
        System.out.println("Новости найдены: ");
        NewsDownloader downloader = new NewsDownloader();
        downloader.downloader(news);
    }
}
