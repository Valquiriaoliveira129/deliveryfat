package Valquiria.Oliveira.delivery;
import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgaConstructor
@AllargsConstructor

public class Produto { 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY);
    private Long id;
    private String nome;
    private Double preco;
    

    
}