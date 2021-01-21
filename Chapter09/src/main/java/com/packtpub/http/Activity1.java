package com.packtpub.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Activity1 {

    public static void main(String[] args) {

        try {
            String url = "https://hc.apache.org/";

            Document doc =
                    Jsoup.connect(url).get();

            Elements sections = doc.select("H3");

            for (Element div : sections) {

                for (Element child : div.children()) {

                    Elements links = child.getElementsByTag("A");
                    for (Element link : links) {
                        System.out.println(link.text());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
