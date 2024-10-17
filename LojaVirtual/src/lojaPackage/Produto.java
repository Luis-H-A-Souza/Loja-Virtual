package lojaPackage;

import java.util.List;
import java.util.Scanner;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	Scanner sc = new Scanner(System.in);

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido!");
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			System.out.println("Quantidade inválida!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void preencherProduto() {
		do {
			System.out.print("Informe o Nome do Produto: ");
			nome = sc.nextLine();
			System.out.print("Informe o Preço do Produto: ");
			preco = sc.nextDouble();
			System.out.print("Informe a Quantidade do Produto: ");
			quantidade = sc.nextInt();
			sc.nextLine();
			if (preco <= 0 || quantidade <= 0) {
				System.out.println(preco <= 0 ? "\nPreço Inválido!\n" : "\nQuantidade Inválida!\n");
			}
		} while (preco <= 0 || quantidade <= 0);
		setNome(nome);
		setPreco(preco);
		setQuantidade(quantidade);
	}

	public void exibirProduto() {
		System.out.println("\nNome: " + getNome());
		System.out.printf("Preço: %.2f\n", getPreco());
		System.out.println("Quantidade: " + getQuantidade());
	}
	
	public void exibirLista (List<Produto> produtos) {
		int aux = 1;
		for (Produto i : produtos) {
			System.out.println(aux + " - " + i.getNome());
			aux++;
		}
		System.out.println();
	}
	
	public void confirmarLeitura () {
		 try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		System.out.println("Para continuar aperte ENTER\n");
		sc.nextLine();
	}
}
