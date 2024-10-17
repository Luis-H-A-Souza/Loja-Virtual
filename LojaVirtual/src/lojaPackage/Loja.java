package lojaPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class Loja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		Produto ajuda = new Produto();
		int codigo = 0;

		System.out.println("Bem vindo ao Sistema de Manutenção de Produtos!\n");
		do {
			System.out.println(
					"1 - Cadastrar Produto\n2 - Exibir Produto\n3 - Atualizar Produto\n4 - Remover produto\n0 - Sair do Programa\n");
			System.out.print("Informe que função Deseja acessar: ");
			codigo = sc.nextInt();
			System.out.println();
			switch (codigo) {
			case 1: {
				Produto novoProduto = new Produto();
				novoProduto.preencherProduto();
				produtos.add(novoProduto);
				System.out.println("\nProduto Adicionado com sucesso!\n");
				break;
			}
			case 2: {
				System.out.println("Produtos disponíveis:");
				ajuda.exibirLista(produtos);
				System.out.print("Informe a ID do produto que deseja visualizar: ");
				int buscar = sc.nextInt();
				System.out.println("\nInformações do Produto: ");
				produtos.get(buscar - 1).exibirProduto();
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("Produtos disponíveis para atualização: ");
				ajuda.exibirLista(produtos);
				System.out.print("Informe o ID do produto que deseja alterar: ");
				int buscar = sc.nextInt();
				produtos.get(buscar - 1).preencherProduto();
				System.out.println("\nInformações Atualizadas!\n");
				break;
			}
			case 4: {
				System.out.println("Produtos disponíveis para remoção: ");
				ajuda.exibirLista(produtos);
				System.out.print("Informe o ID do produto que deseja remover: ");
				int buscar = sc.nextInt();
				System.out.println("\nItem Removido com Sucesso!\n");
				produtos.remove(buscar - 1);
				break;
			}
			case 0: {
				System.out.println("Encerrando programa...");
				break;
			}
			default:
				System.out.println("Informe um código válido!\n");
			}
		} while (codigo != 0);
		sc.close();
	}
}
