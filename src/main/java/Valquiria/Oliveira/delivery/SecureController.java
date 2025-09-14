package Valquiria.Oliveira.delivery;
import org.springframework.web.bind.annoation.GetMapping;
import org.springframework.web.bind.annoation.Westconroller;


@WestController
@RequestMapping("/api/secure/")

public class SecureController{
     @GetMapping("/info"){
         return "Informacoes Publicas";
     }
}
