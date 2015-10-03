package frege_jsoup;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;

public class JsoupHelper {

    public static Element nodeAsElement(Node node) {
        if (node instanceof Element) {
            return (Element) node;
        }
        return null;
    }

    public static org.jsoup.nodes.TextNode nodeAsTextNode(Node node) {
        if (node instanceof org.jsoup.nodes.TextNode) {
            return (org.jsoup.nodes.TextNode) node;
        }
        return null;
    }

    public static org.jsoup.nodes.XmlDeclaration nodeAsXmlDeclaration(Node node) {
        if (node instanceof org.jsoup.nodes.XmlDeclaration) {
            return (org.jsoup.nodes.XmlDeclaration) node;
        }
        return null;
    }

    public static org.jsoup.nodes.DocumentType nodeAsDocumentType(Node node) {
        if (node instanceof org.jsoup.nodes.DocumentType) {
            return (org.jsoup.nodes.DocumentType) node;
        }
        return null;
    }

    public static org.jsoup.nodes.DataNode nodeAsDataNode(Node node) {
        if (node instanceof org.jsoup.nodes.DataNode) {
            return (org.jsoup.nodes.DataNode) node;
        }
        return null;
    }

    public static org.jsoup.nodes.Comment nodeAsComment(Node node) {
        if (node instanceof org.jsoup.nodes.Comment) {
            return (org.jsoup.nodes.Comment) node;
        }
        return null;
    }

    public static org.jsoup.nodes.Document nodeAsDocument(Node node) {
        if (node instanceof org.jsoup.nodes.Document) {
            return (org.jsoup.nodes.Document) node;
        }
        return null;
    }

    public static Document createDocument(String baseUri, Node[] contents) {
    	Document doc = new Document(baseUri);
    	for (Node n : contents) {
    		doc.appendChild(n);
    	}
        return doc;
    }

    public static Element createElement(Tag tag, String baseUri, Attributes attrs, Node[] contents) {
    	Element el = new Element(tag, baseUri, attrs);
    	for (Node n : contents) {
    		el.appendChild(n);
    	}
        return el;
    }

    public static Attributes createAttributes(String[] keys, String[] values) {
    	Attributes attrs = new Attributes();
    	for (int i = 0; i < keys.length; i += 1) {
    		attrs.put(keys[i], values[i]);
    	}
        return attrs;
    }
}
