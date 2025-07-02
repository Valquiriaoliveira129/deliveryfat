package Valquiria.Oliveira.delivery.controller;
import  Valquiria.Oliveira.delivery.model.Produtocontroller;
import  Valquiria.Oliveira.delivery.service.ProdutoService;
import  org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")

public class Produtocontroller {
    private final ProdutoService  service;
   
    public  ProdutoController(ProdutoService service){
        this.service = service;

    }

    @GetMapping
    public Produto criar (@RequestBody Produto  produto){
        return service.salvar( produto);
    }
    
}