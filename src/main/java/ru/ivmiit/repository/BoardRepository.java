package ru.ivmiit.repository;

import org.springframework.stereotype.Repository;
import ru.ivmiit.form.CardForm;
import ru.ivmiit.model.Board;
import ru.ivmiit.model.Card;
import ru.ivmiit.model.Column;
import ru.ivmiit.service.BoardService.CardDeleteRequest;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

/**
 * 02.12.2018
 *
 * @author Robert Bagramov.
 */
@Repository
public class BoardRepository {
    private static List<Board> boards = new LinkedList<>();
    private static List<Column> columns = new LinkedList<>();

    static {
        columns.add(0,
                new Column("First Column", new LinkedList<>(asList(
                        new Card("Card 1", "Some Text"),
                        new Card("Card 2", "Some Text"),
                        new Card("Card 3", "Some Text")))
                )
        );
        columns.add(1,
                new Column("Second Column", new LinkedList<>(asList(
                        new Card("Card 1", "Some Text"),
                        new Card("Card 2", "Some Text"),
                        new Card("Card 3", "Some Text"),
                        new Card("Card 4", "Some Text")))
                )
        );
        boards.add(0, new Board(1, columns));
    }

    public Optional<Board> findOneById(int id) {
        if (id < boards.size()) {
            return Optional.ofNullable(boards.get(id));
        } else {
            return Optional.empty();
        }
    }

    public void deleteOneCardByDeleteRequest(CardDeleteRequest request) {
        if (request.getBoardId() < boards.size()) {
            Board board = boards.get(request.getBoardId());
            List<Column> columnList = board.getColumnList();
            if (request.getColumnId() < columnList.size()) {
                Column column = columnList.get(request.getColumnId());
                List<Card> cardList = column.getCardList();
                if (request.getCardId() < cardList.size()) {
                    for (Card card : cardList) {
                        if (request.getCardId() == card.getId())
                            cardList.remove(request.getCardId());
                    }
                }
            }
        }
    }

    public void saveOneCard(CardForm form) {
        if (form.getBoardId() < boards.size()) {
            Board board = boards.get(form.getBoardId());
            List<Column> columnList = board.getColumnList();
            if (form.getColumnId() < columnList.size()) {
                Column column = columnList.get(form.getColumnId());
                List<Card> cardList = column.getCardList();
                cardList.add(new Card(form.getTitle(), form.getText()));
            }
        }
    }
}