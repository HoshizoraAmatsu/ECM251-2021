package warshall.ling_form;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean [][] A = createMatriz(); //Manualmente cria a matriz
        int N = A.length;

        diplayMatrix(A, N); //Mostra como a matriz está montada

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vertice 1: "); //Vertice 1 a ser analisado
        int v1 = scanner.nextInt();
        //Verifica se esta out of bounds
        if (v1 > N)
            v1 = N - 1;

        System.out.println("Vertice 2: "); //Vertice 2 a ser analisado
        int v2 = scanner.nextInt();
        //Verifica se esta out of bounds
        if (v2 > N)
            v2 = N - 1;

        boolean alc = Alcanca(A, N, v1-1, v2-1); //Verifica se vertice 1 alcança vertice 2
        if (alc)
            System.out.println("Vértice " + v1 + " alcança o vértice " + v2);
        else
            System.out.println("Vértice " + v1 + "não alcança o vértice " + v2);
    }

    private static void diplayMatrix(boolean[][] A, int N)
    {
        //Funcao para representar os valores da matriz
        System.out.println("Matriz: ");
        System.out.print(" ");

        for (int v=0; v < N; v++)
            System.out.print("   " + (v + 1));
        System.out.println();
        for (int v=0; v < N; v++)
        {
            System.out.print((v + 1) + " ");
            for (int w=0; w < N; w++)
            {
                if (A[v][w])
                    System.out.print("  * "); //True
                else
                    System.out.print("    "); //False
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean[][] createMatriz()
    {
        System.out.println("Construção de matriz");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de vertices: ");
        int v = scanner.nextInt();

        boolean[][] matriz = new boolean[v][v];

        System.out.println("Valores da matriz: (1 = Alcança | 0 = Nao alcança)");
        for (int i=0; i<v; i++)
        {
            for (int j=0; j<v; j++)
            {
                int aloc = scanner.nextInt();
                switch (aloc)
                {
                    case 0:
                        matriz[i][j] = false;
                        break;
                    case 1:
                        matriz[i][j] = true;
                        break;
                    default:
                        System.out.println("Entrada invalida, tente novamente");
                        j--;
                        break;
                }
            }
            System.out.println("Proxima linha: ");
        }

        return matriz;
    }

    public static boolean Alcanca(boolean[][] A, int N, int v1, int v2)
    {
        boolean[][] W = Warshall(A, N);
        diplayMatrix(W, N);
        return W[v1][v2];
    }

    public static boolean[][] Warshall(boolean[][] A, int N)
    {
        for (int k = 0; k < N; k++)
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    A[i][j] = A[i][j] || A[i][k] & A[k][j];

        return A;
    }
}
