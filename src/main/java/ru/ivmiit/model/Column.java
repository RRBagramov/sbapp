package ru.ivmiit.model;

import java.util.List;

/**
 * 02.12.2018
 *
 * @author Robert Bagramov.
 */
public class Column {
    private int id;
    private String name;
    private List<Card> cardList;

    public Column(String name, List<Card> cardList) {
        this.name = name;
        this.cardList = cardList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
