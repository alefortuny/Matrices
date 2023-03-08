package matrices;

public class Matrices 
{    
	public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) 
	{
        int filasMatriz1 = matriz1.length;
        int columnasMatriz1 = matriz1[0].length;
        int filasMatriz2 = matriz2.length;
        int columnasMatriz2 = matriz2[0].length;
        if (columnasMatriz1 != filasMatriz2) 
        {
        	System.out.println("Las matrices no se pueden multiplicar");
        }
        int[][] matrizResultante = new int[filasMatriz1][columnasMatriz2];
    	for (int i = 0; i < filasMatriz1; i++) 
        {
            for (int j = 0; j < columnasMatriz2; j++) 
            {
                for (int k = 0; k < columnasMatriz1; k++) 
                {
                	matrizResultante[i][j] = matrizResultante[i][j] + matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    	return matrizResultante;
    }

    public static int[][] transponerMatrices(int[][] matriz) 
    {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizResultante = new int[columnas][filas];
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                matrizResultante[j][i] = matriz[i][j];
            }
        }
        return matrizResultante;
    }

    public static int sumaDiagonal(int[][] matriz) 
    {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        if (filas != columnas) 
        {
        	System.out.println("No se puede obtener la suma de la diagonal");
        }
        int sumaDiagonal = 0;
        for (int i = 0; i < filas; i++) 
        {
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }

        return sumaDiagonal;
    }

    public static int encontrarValorMaximo(int[][] matriz) 
    {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int valorMaximo = matriz[0][0];
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                if (matriz[i][j] > valorMaximo) 
                {
                    valorMaximo = matriz[i][j];
                }
            }
        }
        return valorMaximo;
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) 
    {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matrizResultante;
        if (filas != matriz2.length || columnas != matriz2[0].length) 
        {
        	System.out.println("Las suma no se puede realizar");
        }
        matrizResultante = new int[filas][columnas];
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultante;
    }
    
    public static int[][] multiplicarPorEscalar(int[][] matriz, int escalar) 
    {
    	int filas = matriz.length;
    	int columnas = matriz[0].length;
    	int[][] matrizResultante = new int[filas][columnas];

        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                matrizResultante[i][j] = matriz[i][j] * escalar;
            }
        }

        return matrizResultante;
    }
}