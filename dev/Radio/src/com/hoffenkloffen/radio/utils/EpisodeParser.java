package com.hoffenkloffen.radio.utils;

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

    private static final String TAG = EpisodeParser.class.getSimpleName();

    private ILogFacade log;

    public EpisodeParser(ILogFacade log) {
        this.log = log;
    }

    public Episode parse(InputStream stream) { // TODO: return File
        Document doc = getDocument(stream);

        Episode episode = new Episode();
        episode.setUrl(getValue(doc, "//@href[1]"));

        return episode;
    }

    private Document getDocument(InputStream stream) { // TODO: regex
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(stream);

            return db.parse(is);
        } catch (Exception e) {
            log.e(TAG, "Get document failed.", e);
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
            log.e(TAG, "Get value failed.", e);
        }

        return null;
    }
}
