package parsePage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<OneLink> linkList = new ArrayList<>();
        Document document = Jsoup.connect("http://4pda.ru/").get();
        Elements elements = document.getElementsByAttributeValue("class", "list-post-title");
        elements.forEach(element -> {
            Element elem = element.child(0);
            String url = elem.attr("href");
            String title = elem.child(0).text();

            linkList.add(new OneLink(url, title));
        });

        linkList.forEach(System.out::println);
    }
}
