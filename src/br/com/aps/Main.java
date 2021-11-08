package br.com.aps;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Desenvolvido por:
		 * - Nicolas Castanha 
		 * - Mateus Teixeira
		 * - Letícia Coutinho
		 * - Monique Mota
		 * - Giuliana Costacurta
		 * - Felipe Fragoso
		 * - Lucas Vinícius Mercadante
		 */

		FileInputStream planilha = null;
		int[] vetor = new int[100];
		int aux = 0;

		try {
			
			//Variavel que vai acessar diretorio do arquvio
			File file = new File("C:\\Users\\User\\Desktop\\projetos-java\\Dados.xlsx");
			
			//Variavel que vai armazenar o arquivo
			planilha = new FileInputStream(file);

			// Cria um workbook = planilha toda com todas as abas
			XSSFWorkbook workbook = new XSSFWorkbook(planilha);

			// Recuperamos apenas a primeira aba(planilha)
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Retorna todas as linhas da planilha 0 (aba 01)
			Iterator<Row> rowIterator = sheet.iterator();

			// Varre todas as linhas da planilha
			while (rowIterator.hasNext()) {

				// Recebe cada linha da planilha
				Row row = rowIterator.next();

				// Pegamos todas as células desta linha
				Iterator<Cell> cellIterator = row.iterator();

				// Varremos todas as células da linha atual
				while (cellIterator.hasNext()) {

					// Criamos uma celula
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {

					case NUMERIC:
						
						vetor[aux] = (int) cell.getNumericCellValue();
						aux++;
						break;
						
					}
				}
			}

		} catch (FileNotFoundException ex) {
			// Logger.getLogger(Leitura2.class.getName()).log(Level.SEVERE, null, ex);
			
		} catch (IOException ex) {
			// Logger.getLogger(Leitura2.class.getName()).log(Level.SEVERE, null, ex);
			
		} finally {
			
			try {
				
				planilha.close();
				
			} catch (IOException ex) {
				// Logger.getLogger(Leitura2.class.getName()).log(Level.SEVERE, null, ex);
			}

			// Ordenadores
			//Variaveis utilizadas dentro dos algoritmos
			long inicio, fim;
			Resultado resultado;
			
			//Vetor que está armazenando os dados internos
			int[] i = { 8965, 587, 968, 68, 2565, 5986, 3025, 240, 3185, 5, 5862, 517, 5369, 247, 1569, 789, 6014, 5879,
					687, 456, 237, 9821, 268, 437, 619, 598, 1204, 2356, 745, 128, 4, 68, 201, 547, 963, 257, 126, 341,
					120, 2457, 638, 596, 2410, 236, 739, 251, 2036, 7541, 6358, 1589, 2004, 3015, 2552, 54, 96, 24, 260,
					565, 365, 3660, 6352, 2661, 1551, 1565, 1548, 1215, 5472, 54, 56, 54, 45, 2452, 14221, 2055, 252552,
					22550, 2515, 21555, 5512, 21556, 220351, 223203, 25285, 2165, 2515, 22035, 256556, 23265, 6541,
					1215, 1215, 3200, 257, 552, 2454, 255632, 14552, 2663, 255, 245 };
			
			System.out.println("---------------------------------------------------------------------------------\n");
			System.out.println("     SISTEMA PARA ANÁLISE DE PERFORMANCE DE ALGORITMOS DE ORDENAÇÃO DE DADOS\n");
			System.out.println("---------------------------------------------------------------------------------");
			
			System.out.println("\n   Este sistema utiliza técnicas de alguns dos principais algoritmos de ordenação\npara comparar o desempenho entre si. \n   Os dados atribuídos estão sendo representados através de análises baseadas em\num controle de desmatamento de árvores realizado na ambientação amazônica.\n");
			
			System.out.println("---------------------------------------------------------------------------------");
			
			System.out.println("\nTécnica 01 - Bubble Sort");
			
			System.out.println("\nUtilizando Dados Internos");
			inicio = System.currentTimeMillis();
			resultado = BubbleSort.sort(i);
			fim = System.currentTimeMillis();
			System.out.println("Tempo: " + (fim - inicio) + "ms");
			System.out.println("Trocas: " + resultado.getTrocas());
			
			System.out.println("\nUtilizando Dados Externos");
			inicio = System.currentTimeMillis();
			resultado = BubbleSort.sort(vetor);
			fim = System.currentTimeMillis();
			System.out.println("Tempo: " + (fim - inicio) + "ms");
			System.out.println("Trocas: " + resultado.getTrocas() + "\n");
			
			System.out.println("---------------------------------------------------------------------------------");
			
			System.out.println("\nTécnica 02 - Selection Sort");
			
			System.out.println("\nUtilizando Dados Internos");
			inicio = System.currentTimeMillis();
			resultado = SelectionSort.sort(i);
			fim = System.currentTimeMillis();
			System.out.println("Tempo: " + (fim - inicio) + "ms");
			System.out.println("Trocas: " + resultado.getTrocas() + "\n");
			
			System.out.println("\nUtilizando Dados Externos");
			inicio = System.currentTimeMillis();
			resultado = SelectionSort.sort(vetor);
			fim = System.currentTimeMillis();
			System.out.println("Tempo: " + (fim - inicio) + "ms");
			System.out.println("Trocas: " + resultado.getTrocas() + "\n");
			
			System.out.println("---------------------------------------------------------------------------------");
			
			System.out.println("\nTécnica 03 - Quick Sort");
			
			System.out.println("\nUtilizando Dados Internos");
			inicio = System.currentTimeMillis();
			resultado = QuickSort.sort(i, 0, i.length);
			fim = System.currentTimeMillis();
			System.out.println("Tempo: " + (fim - inicio) + "ms");
			System.out.println("Trocas: " + resultado.getTrocas());
			
			System.out.println("\nUtilizando Dados Externos");
			inicio = System.currentTimeMillis();
			resultado = QuickSort.sort(vetor, 0, vetor.length);
			fim = System.currentTimeMillis();
			System.out.println("Tempo: " + (fim - inicio) + "ms");
			System.out.println("Trocas: " + resultado.getTrocas() + "\n");
			
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Desenvolvedores: \r\n"
					+ "\n - Nicolas Castanha \r\n"
					+ " - Mateus Teixeira\r\n"
					+ " - Letícia Coutinho\r\n"
					+ " - Monique Mota\r\n"
					+ " - Giuliana Costacurta\r\n"
					+ " - Felipe Fragoso\r\n"
					+ " - Lucas Vinícius Mercadante");

		}

	}
}