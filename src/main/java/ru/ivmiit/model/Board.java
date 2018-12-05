package ru.ivmiit.model;

import java.util.List;

/**
 * 02.12.2018
 *
 * @author Robert Bagramov.
 */
public class Board {
    private int id;
    private List<Column> columnList;

    public Board(int id, List<Column> columnList) {
        this.id = id;
        this.columnList = columnList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }
}
