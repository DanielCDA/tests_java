public class Vector {

    public static void Remove(int vetor[], int posicao, int nElementos){
        if (posicao < 0 || posicao >= nElementos)
        {
            System.out.println("Posicao invalida");
            return;
        }
        for (int i = posicao; i < nElementos - 1; i++)
        {
            vetor[i] = vetor[i + 1];
        }
    }

    public static boolean VetorCheio(int vetor[], int nElementos){
        return nElementos >= vetor.length;
    }

    public static void InserirElement(int vetor[], int nElementos)       
    {
        if (VetorCheio(vetor, nElementos))
        {
            System.out.println("Vetor cheio, nao e possivel inserir novos elementos");
            return;
        }
        for (int i = 0; i < vetor.length ; i++)
            {
                vetor[i] = i + 1;
            }
    }

    public static void InserirPosicao(int vetor[], int valor, int posicao, int nElementos)
    {
        if (posicao < 0 || posicao >= vetor.length)
        {
            System.out.println("Posicao invalida");
            return;
        }
        if (VetorCheio(vetor, nElementos))
        {
            System.out.println("Vetor cheio, nao e possivel inserir novos elementos");
            return;
        }
        vetor[posicao] = valor;
    }
    public static void main(String[] args) {
        
        int[] vetor = new int[4];
        int nElementos = 0;

         //InserirElement(vetor, nElementos);
    
       
        for (int i = 0; i < vetor.length ; i++)
        {
            System.out.println("posicao do vetor: " + i + " valor guardado na posicao e: " + vetor[i]);
        }
        System.err.println("");
        System.out.println("Tamanho do vetor: " +    vetor.length);
         System.err.println("");

         System.err.println("Mudando o valor da poseicao 2 para 10");
        InserirPosicao(vetor, 10, 2, nElementos);
        for (int i = 0; i < vetor.length ; i++)
        {
            System.out.println("posicao do vetor: " + i + " valor guardado na posicao e: " + vetor[i]);
        }

    }
    
}
