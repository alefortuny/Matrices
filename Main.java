package matrices;

public class Main {

    public static void main(String[] args) 
    {
        int[][] matriz1 = {{2, 9, 7}, {1, 8, 3}, {9, 2, 2}};
        int[][] matriz2 = {{6, 2, 0}, {1, 8, 9}, {0, 5, 3}};
       
        Matrices matrices = new Matrices();
        
        int[][] matrizResultante = matrices.multiplicarMatrices(matriz1, matriz2);
        imprimirMatriz(matrizResultante);
        System.out.println("");
        
        int[][] matrizTranspuesta = Matrices.transponerMatrices(matriz2);
        imprimirMatriz(matrizTranspuesta);
        System.out.println("");
        
        int sumaDiagonal = Matrices.sumaDiagonal(matriz1);
        System.out.println("La suma de la diagonal de la matriz es: " + sumaDiagonal);
        System.out.println("");
        
        int valorMaximo = Matrices.encontrarValorMaximo(matriz1);
        System.out.println("El valor máximo de la matriz es: " + valorMaximo);
        System.out.println("");
        
        int[][] matrizSuma = Matrices.sumarMatrices(matriz1, matriz2);
        imprimirMatriz(matrizSuma);
        System.out.println("");
        
        int[][] matrizPorEscalar = Matrices.multiplicarPorEscalar(matriz2, 5);
        imprimirMatriz(matrizPorEscalar);
    }
    
    public static void imprimirMatriz(int[][] matriz)
    {
    	for (int i = 0; i < matriz.length; i++) 
    	{
            for (int j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}