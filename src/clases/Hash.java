package clases;
import pruebas.PruebaHash;
public class Hash{
    public int dato;
    public int estado; //0 = Vacío, 1 = Eliminado, 2 = Ocupado

    public static int funcion(int n, int m) {
        return ((n + 1) % m);
    }

    public static int buscaHash(Hash[] h, int m, int n) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0) {
                return -1;
            } else if (h[j].dato == n) {
                if (h[j].estado == 1) {
                    return -1;
                } else {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }
}
