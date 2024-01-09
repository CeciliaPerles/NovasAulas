package AulaNove;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		BinaryOperator<Integer> soma = (acumulador, valorAtual) -> acumulador + valorAtual;
		
		int total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
	}

}
