package U8.Entregable2324;

import com.google.gson.Gson;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ProcessPosts {
    private Document docum1;
    List<Post> posts = new ArrayList<>();

    public void parseDOM(String filename) {
        try{
            File file = new File(filename);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            docum1 = dBuilder.parse(file);
            System.out.println("parseDOM terminado correctamente");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void addPost(Post post) {
        try{
            Element root = docum1.getDocumentElement();

            Element newPost = docum1.createElement("post");

            Element title = docum1.createElement("title");
            title.appendChild(docum1.createTextNode(post.getTitle()));
            newPost.appendChild(title);

            Element link = docum1.createElement("link");
            link.appendChild(docum1.createTextNode(post.getLink()));
            newPost.appendChild(link);

            Element description = docum1.createElement("description");
            description.appendChild(docum1.createTextNode(post.getDescription()));
            newPost.appendChild(description);

            Element pubdate = docum1.createElement("pubDate");
            pubdate.appendChild(docum1.createTextNode(post.getPubdate()));
            newPost.appendChild(pubdate);

            Element guid = docum1.createElement("guid");
            guid.appendChild(docum1.createTextNode(post.getGuid()));
            newPost.appendChild(guid);

            root.appendChild(newPost);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource source = new DOMSource(root);
            StreamResult result = new StreamResult(new File("C:\\Users\\DAW_M\\Desktop\\Programacion_Entregable\\programacion_23_24\\ejercicios\\src\\main\\java\\U8\\Entregable2324\\posts.xml"));
            transformer.transform(source, result);

            System.out.println("add post realizado correctamente");

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public List<Post> getPosts() {

        NodeList nList = docum1.getElementsByTagName("post");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                String title = eElement.getElementsByTagName("title").item(0).getTextContent();
                String link = eElement.getElementsByTagName("link").item(0).getTextContent();
                String description = eElement.getElementsByTagName("description").item(0).getTextContent();
                String pubdate = eElement.getElementsByTagName("pubDate").item(0).getTextContent();
                String guid = eElement.getElementsByTagName("guid").item(0).getTextContent();

                Post post = new Post(title, link, description, pubdate, guid);
                posts.add(post);
            }
        }
        return posts;
    }

    public String convertToJSON() {

        try{
            Gson gson = new Gson();

            String json = gson.toJson(getPosts());

            try (BufferedWriter escribir = new BufferedWriter(
                    new FileWriter("C:\\Users\\DAW_M\\Desktop\\Programacion_Entregable\\programacion_23_24\\ejercicios\\src\\main\\java\\U8\\Entregable2324\\posts.json")

            )){

                escribir.write(json);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            return json;


        } catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}

