package ru.ivmiit.form;

/**
 * 05.12.2018
 *
 * @author Robert Bagramov.
 */
public class CardForm {
    private int boardId;
    private int columnId;
    private String title;
    private String text;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
