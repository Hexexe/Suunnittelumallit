package Tehtävä_12_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Image> album = new ArrayList<>(List.of(new ProxyImage("AmphibianHateSymbol.png"), new ProxyImage("Cheerful_Trader.gif")));
        album.forEach(Image::showData);
        album.forEach(Image::displayImage);
    }
}

