

public class Vector {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length ; i++)
        {
            vetor[i] = i + 1;
        }
        for (int i = 0; i < vetor.length ; i++)
        {
            System.out.println("posicao do vetor: " + i + " valor guardado na posicao he: " + vetor[i]);
        }
    }
    
}
