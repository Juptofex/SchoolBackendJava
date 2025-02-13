package be.vinci.cae.fiche1.controller;

import be.vinci.cae.fiche1.models.Quote;
import be.vinci.cae.fiche1.service.QuotesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuotesController {
    private final QuotesService quotesService;

    public QuotesController(QuotesService  quotesService) {
        this.quotesService = quotesService;
    }
    @GetMapping("/")
    public Iterable<Quote> all() {
        return quotesService.getAllQuotes();
    }
}