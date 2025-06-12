package com.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receitas")
public class RecipeController {

    @Autowired
    private ForkifyService forkifyService;

    @GetMapping
    public RecipeResponse getReceitas(@RequestParam String prato) {
        return forkifyService.buscarReceitas(prato);
    }
}