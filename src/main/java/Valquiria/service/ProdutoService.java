package Valquiria.Oliveira.delivery.service;
import  Valquiria.Oliveira.delivery.model.Produto;
import  Valquiria.Oliveira.delivery.repository.ProdutoRepository;
import  org.springframework.stereotype.service;
import  java.util.List;

@service


public class ProdutoService {
   private final ProdutoRepository repository;

   public ProdutoService(ProdutoRpository repository){
   this.repository = repository;

   }
    public List<Produto> ListarTodos(){
     return repository.findAll();
    } 
public Produto salvar(Produto produto){
 return repository.save(produto);
}

}