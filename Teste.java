package tce1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {		
		BalaDeCanhao balaDeCanhao = new BalaDeCanhao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o angulo: ");
		double alpha = entrada.nextDouble();
		
		System.out.println("Digite a velocidade inicial: ");
		double v = entrada.nextDouble();

		entrada.close();
		
		ArrayList<Ponto> localizacao =  balaDeCanhao.atirar(alpha, v, 2);
		
		for (Ponto ponto : localizacao) {
			System.out.println("Coordenadas: (" + ponto.getX() + ", " + ponto.getY() + ")");
		}
	
	}
}
