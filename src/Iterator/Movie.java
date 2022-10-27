package src.Iterator;

public class Movie {
    private String name;
    private String description;
    private String category;

    public Movie(String name, String category, String description){
        this.name = name;
        this.description = description;
        this.category =  category;
    }

    public Movie(int i, String string) {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
