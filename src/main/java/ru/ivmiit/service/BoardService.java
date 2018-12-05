package ru.ivmiit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ivmiit.exception.NotFoundException;
import ru.ivmiit.form.CardForm;
import ru.ivmiit.model.Board;
import ru.ivmiit.repository.BoardRepository;

/**
 * 05.12.2018
 *
 * @author Robert Bagramov.
 */
@Service
public class BoardService {
    public static class CardDeleteRequest {
        private int boardId;
        private int columnId;
        private int cardId;

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

        public int getCardId() {
            return cardId;
        }

        public void setCardId(int cardId) {
            this.cardId = cardId;
        }
    }

    @Autowired
    private BoardRepository boardRepository;

    public Board getById(int id) {
        return boardRepository.findOneById(id).orElseThrow(NotFoundException::new);
    }

    public void deleteByCardDeleteRequest(CardDeleteRequest request) {
        boardRepository.deleteOneCardByDeleteRequest(request);
    }

    public void saveCard(CardForm form) {
        boardRepository.saveOneCard(form);
    }
}
