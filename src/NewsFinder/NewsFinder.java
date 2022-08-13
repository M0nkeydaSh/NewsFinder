package NewsFinder;


import NewsFinder.utils.PageDownloader;

public class NewsFinder implements NewsScanner {
    public NewsInfo findNews(){

//       Scanner sc = new Scanner(System.in);
//        System.out.print("Ведите категорию: ");
//        String newCategory = sc.next();
        NewsScanner newsScanner = new NewsFinder();
       String newCategory =  newsScanner.printCategory();
        System.out.println("Идет скачивание...");
        String url = "https://inshortsapi.vercel.app/news?category=" + newCategory;
        PageDownloader downloader = new PageDownloader();
        String page = downloader.downloadWebPage(url);

        String category = getTagValue(page, "category");
        String author = getTagValue(page, "author");
        String content = getTagValue(page, "content");

        return new NewsInfo(category, author, content);
    }


    private String getTagValue (String page, String tagName){
        int begin =   page.indexOf('"' + tagName + '"') + 4 + tagName.length();
        int end = page.indexOf('"'  , begin);
        return page.substring(begin, end);
    }


}
