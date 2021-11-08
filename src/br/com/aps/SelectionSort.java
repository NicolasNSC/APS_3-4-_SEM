package br.com.aps;

public class SelectionSort {
	public static Resultado sort(int[] vetor){
		int trocas = 0;
		//Selection sort O(N²)
		int posicao_menor, aux;
		for(int i = 0; i < vetor.length; i++) {//o{n}
			posicao_menor = i;
			for(int j = i+1; j < vetor.length; j++) {//o{n}
				if(vetor[j] < vetor[posicao_menor]) {
					posicao_menor = j;
				}
			}
			aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux;
			trocas++;
		}
		return new Resultado(vetor, trocas);
	}
}
