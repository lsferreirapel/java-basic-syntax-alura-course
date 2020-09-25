
public class ScopeTest {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int age = 19;
		int quantityOfPeoples = 3;
		
//		boolean accompanied = quantityOfPeoples >= 2;
		
		boolean accompanied;
		if (quantityOfPeoples >= 2) {
			accompanied = true;
		} else {
			accompanied = false;
		}
		
		if (age >= 18 && accompanied) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
