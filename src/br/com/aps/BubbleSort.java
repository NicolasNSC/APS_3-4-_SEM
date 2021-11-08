package br.com.aps;



public class BubbleSort {
	public static Resultado sort(int[] vetor){
		int trocas = 0;
		//BUBBLE SORT O(N²)
		int aux;
		for(int i=0; i < vetor.length; i++) { // O(N)
			for(int j = i + 1; j < vetor.length; j++) { // O(N)
				if(vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
					trocas++;
				}
			}
		}
		return new Resultado(vetor, trocas);
	}
}
