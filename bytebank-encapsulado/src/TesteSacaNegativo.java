
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 12440);
		conta.deposita(100);
		System.out.println(conta.saca(101));

		conta.saca(101);

		System.out.println(conta.getSaldo());

	}
}