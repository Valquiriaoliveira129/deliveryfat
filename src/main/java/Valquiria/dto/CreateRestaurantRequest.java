import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CreateRestaurantRequest {
  @NotBlank(message = "Nome é obrigatório")  
  private String name;
  @NotBlank(message = "Endereço  é obrigatório" )
  private String address;
  @Pattern(regexp = "\\d{8,}", message ="Telefone deve conter ao menos 8 digitos")
private String typeofkitchen;


}