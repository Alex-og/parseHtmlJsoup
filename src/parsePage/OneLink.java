package parsePage;

public class OneLink {
    private String url;
    private String name;

    public OneLink(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OneLink{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
