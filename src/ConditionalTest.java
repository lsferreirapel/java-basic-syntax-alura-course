
public class ConditionalTest {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int age = 19;
		int quantityOfPeoples = 3;
		boolean accompanied = quantityOfPeoples >= 2;
		if (age >= 18 && accompanied) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}
}
