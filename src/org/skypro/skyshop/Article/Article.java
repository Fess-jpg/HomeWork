package org.skypro.skyshop.Article;

public class Article implements Searchable {
    private final String nameArticle;

    public Article(String nameArticle, String textArticle) {
        this.nameArticle = nameArticle;
        this.textArticle = textArticle;
    }

    private final String textArticle;


    @Override
    public String getSearchTerm() {
        return nameArticle + " " + textArticle;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return nameArticle;
    }

    @Override
    public String toString() {
        return nameArticle + "\n" + textArticle;
    }
}
