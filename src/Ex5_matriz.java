public class Ex5_matriz {

    public static void main(String[] args) {

        int[][] predio = new int[10][8];
        
        preenchePredio(predio);
        mostraPredio(predio);
        System.out.println();
        System.out.print("\nSoma de moradores: " + qtdeMore(predio));
        System.out.println("\nSoma de apartamentos vazios: " + verVazio(predio));
        System.out.print("\nAndar que possui o maior número de moradores: " + encontrarLinhaMaiorSoma(predio) + "º");
        System.out.println("\nSoma do andar com mais moradores: " + verAndar(predio));
        System.out.println("");
    }

    public static void preenchePredio(int[][] predio) {
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                predio[i][j] = (int) (Math.random() * 7);
            }
        }
    }

    public static void mostraPredio(int[][] predio) {
        for (int i = 0; i < predio.length; i++) {
            System.out.println();
            for (int j = 0; j < predio[i].length; j++) {
                System.out.print(predio[i][j] + " ");
            }
        }
    }

    public static int verAndar(int[][] predio) {
        int maiorSoma = Integer.MIN_VALUE;
        for (int i = 0; i < predio.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < predio[i].length; j++){
                somaLinha = somaLinha + predio[i][j];
            }
            if (somaLinha > maiorSoma) {
                maiorSoma = somaLinha;
            }
        }
        return maiorSoma;
    }

    public static int encontrarLinhaMaiorSoma(int[][] matriz) {
        int somaMaxima = Integer.MIN_VALUE;
        int linhaMaiorSoma = -1;
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > somaMaxima) {
                somaMaxima = somaLinha;
                linhaMaiorSoma = i;
                linhaMaiorSoma++;
            }
        }
        return linhaMaiorSoma;
    }

    public static int verVazio(int[][] predio) {
        int aptos = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                if (predio[i][j] == 0)
                    aptos = aptos + 1;
            }
        }
        return aptos;
    }

    public static int qtdeMore(int[][] predio) {
        int moradores = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++){
                moradores = moradores + predio[i][j];
            }
        }      
        return moradores;
    }
}
