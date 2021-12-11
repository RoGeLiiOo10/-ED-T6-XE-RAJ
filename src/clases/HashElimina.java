package clases;

import static clases.Hash.buscaHash;
 
public class HashElimina{
    public static int eliminaHash(Hash[] h, int m, int n) {
        int i = buscaHash(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            return 1;
        }
    }
}
