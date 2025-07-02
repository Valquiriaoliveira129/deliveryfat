package Valquiria.model;
import lombok.Data; // lombok gera automaticamente getters e setters e toString.
import javax.persistence.*; // importa as anotações JPA.

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity // indica que esta classe sera entidade nessa base de dados.
@Table(name = "orders") // Define o nome da tabela no banco.
@Data // lombok : evita escrever manualmente os metodos padrao. 
public class Order {
  @Id // define a chave primaria
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id; // identificador unico do pedido.

  private String customerName; // nome do cliente que fez o pedido.

  private BigDecimal totalAmount; // valor total do pedido.

  private LocalDateTime createdat; // Data e hora m que foi feito o pedido

    
}
