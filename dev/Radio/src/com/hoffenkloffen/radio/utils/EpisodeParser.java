package com.hoffenkloffen.radio.utils;

import android.util.Log;
import com.hoffenkloffen.radio.entities.Episode;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

public class EpisodeParser {

    private static final String TAG = "EpisodeParser";

    public Episode parse(InputStream stream) {
        Document doc = getDocument(stream);

        Episode episode = new Episode();
        episode.setUrl(getValue(doc, "//@href[1]"));

        return episode;
    }

    private Document getDocument(InputStream stream) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(stream);

            return db.parse(is);
        } catch (Exception e) {
            Log.e(TAG, "Get document failed.", e);
        }

        return null;
    }

    private String getValue(Document doc, String value) {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        XPathExpression expr;

        try {
            expr = xpath.compile(value);

            return expr.evaluate(doc);
        } catch (XPathExpressionException e) {
            Log.e(TAG, "Get value failed.", e);
        }

        return null;
    }
}
