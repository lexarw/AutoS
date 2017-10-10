import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 08.02.2017.
 */
public class AutoSParse {
    public static void main(String[] args) {

    }
    public static List<AutoSMain.Article> ParseF(String link) {
        Document htmlFile = null;
        List<AutoSMain.Article> artList = new ArrayList<>();

        try {
            htmlFile = Jsoup.connect(link).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements el = htmlFile.select("h3.listing-item__name");
        for (Element elgl : el.select("a.link"))

        {
            String stel = elgl.attr("href");
            if (stel.substring(8, 15).toLowerCase() != "auto.ru") {
                System.out.println(stel);
            }
            System.out.println(stel.substring(8, 15).toLowerCase());
        }

        artList.forEach(System.out::println);
        return artList;
    }

    //public static void ParseS(ArrayList arrList ) {
    public static void ParseS( ) {
        Document htmlFile = null;

        //for (int i = 0;  i < arrList.size(); i = i+1){
        //    String inslink = arrList.get(i).toString();
        try {
            //htmlFile = Jsoup.connect(inslink).get();
            htmlFile = Jsoup.connect("https://auto.ru/cars/used/sale/mercedes/e_klasse/1048139117-db53/").get();
          //  System.out.println(htmlFile.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements els = htmlFile.getElementsByAttributeValue("class","card__info-value");
       // els.forEach(System.out::println);
       // Elements el = htmlFile.select("dl.card__info");
        for (Element elgl : els)

       {
           // String stel = elgl.attr("href");
           String stel = elgl.val();
         //   if (stel.substring(8, 15).toLowerCase()!= "auto.ru") {
                System.out.println(stel);
          //  }
            //System.out.println(stel.substring(8, 15).toLowerCase());
        }

        //artList.forEach(System.out::println);
    //}
    }
}

