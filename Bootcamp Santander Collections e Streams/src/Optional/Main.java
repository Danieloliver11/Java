package Optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// permite objetos que podem ser opcionais "Null". NullPointeXCEPTION acontece quando vc tenta acessar um valor que é nulo
		// possui 2 estados. Presente e Vazio
		
		Optional<String> optionString = Optional.of("Valor presente");// se tivemos certeza que temos um vslor aqui
		
		System.out.println("Valor esta presente");
		optionString.ifPresentOrElse(System.out::print,() -> System.out.println("não esta vazio"));//primeiro argumento caso o optional esteja presente, o segundo se nao estiver 

		System.out.println("Valor que não esta presente");

		Optional<String> optionalNull = Optional.ofNullable(null);// se nao sei se o valor vai ser nulo chamo o ofNullable
		
		optionalNull.ifPresentOrElse(System.out::println, ()-> System.out.printf("Null")); // Null
		
		System.out.println("Valor que não esta presente");
		
		Optional<String> empyOptional = Optional.empty();
		
		empyOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("empy = não esta presente"));// nao esta presente

		//isEmpy isPresent
	}

}
