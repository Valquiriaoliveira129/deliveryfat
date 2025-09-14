import org.antlr.v4.runtim.misc.NotNull;

import java.math.BigDecimal;

@Data

public class CreateOrderRequest {
    @NotBlank // valida que o campo não pode ser vazio.
    private String CustomerName; // Nome do cliente.
    @NotNull(mensage = "ID do restaurante é obrigatório") // O valor não pode ser nulo.
    private Long restaurantId: // Id do restaurante.
    @NotEmpty (message="Itens do pedido são obrigatórios")
    private List<OrderItemRequest> items;
    @NotBlank(mensage = "Endreço d entrega é obrigatório")
    private Strig deliveryAdress;
    

    
}
