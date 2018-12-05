package ru.ivmiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ivmiit.form.CardForm;
import ru.ivmiit.model.Board;
import ru.ivmiit.service.BoardService;
import ru.ivmiit.service.BoardService.CardDeleteRequest;

/**
 * 01.12.2018
 *
 * @author Robert Bagramov.
 */
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/{bid}")
    public String getBoard(Model model, @PathVariable int bid) {
        Board board = boardService.getById(bid);
        model.addAttribute("columnList", board.getColumnList());
        return "index";
    }

    @GetMapping("/board/{bid}/column/{cl-id}/card/{c-id}")
    public void deleteCard(@PathVariable int bid,
                            @PathVariable("c-id") int cid,
                            @PathVariable("cl-id") int clid) {

        CardDeleteRequest request = new CardDeleteRequest();
        request.setBoardId(bid);
        request.setColumnId(clid);
        request.setCardId(cid);

        boardService.deleteByCardDeleteRequest(request);
    }

    @GetMapping("/addCard")
    public String addCardForm(Model model) {
        CardForm cardForm = new CardForm();
        model.addAttribute("cardForm", cardForm);
        return "addCard";
    }

    @PostMapping("/addCard")
    public String addCardForm(@ModelAttribute("cardForm") CardForm cardForm) {
        boardService.saveCard(cardForm);
        return "addCard";
    }
}