package frege_jsoup;

public class JsoupHelper {

    public static org.jsoup.nodes.Element nodeAsElement(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.Element) {
            return (org.jsoup.nodes.Element) node;
        }
        return null;
    }

    public static org.jsoup.nodes.TextNode nodeAsTextNode(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.TextNode) {
            return (org.jsoup.nodes.TextNode) node;
        }
        return null;
    }

    public static org.jsoup.nodes.XmlDeclaration nodeAsXmlDeclaration(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.XmlDeclaration) {
            return (org.jsoup.nodes.XmlDeclaration) node;
        }
        return null;
    }

    public static org.jsoup.nodes.DocumentType nodeAsDocumentType(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.DocumentType) {
            return (org.jsoup.nodes.DocumentType) node;
        }
        return null;
    }

    public static org.jsoup.nodes.DataNode nodeAsDataNode(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.DataNode) {
            return (org.jsoup.nodes.DataNode) node;
        }
        return null;
    }

    public static org.jsoup.nodes.Comment nodeAsComment(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.Comment) {
            return (org.jsoup.nodes.Comment) node;
        }
        return null;
    }

    public static org.jsoup.nodes.Document nodeAsDocument(org.jsoup.nodes.Node node) {
        if (node instanceof org.jsoup.nodes.Document) {
            return (org.jsoup.nodes.Document) node;
        }
        return null;
    }
}
