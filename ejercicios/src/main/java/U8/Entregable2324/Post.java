package U8.Entregable2324;

public class Post {
    private String title;
    private String link;
    private String description;
    private String pubdate;
    private String guid;

    public Post(String title, String link, String description, String pubdate, String guid) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubdate = pubdate;
        this.guid = guid;
    }

    //Los Getters
    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getPubdate() {
        return pubdate;
    }

    public String getGuid() {
        return guid;
    }

    //Aqui los Setters y toString
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Link: " + link + ", Description: " + description + ", PubDate: " + pubdate + ", GUID: " + guid;
    }
}



