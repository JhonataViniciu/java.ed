import java.util.ArrayList;
import lib.Listas;

public class embaralha {
    public static void main(String[] args) {
        new embaralha();
    }

    public embaralha (){
        ArrayList lista = new ArrayList();
        lista.add(1.2f);
        lista.add(4.3f);
        lista.add(6.1f);
        lista.add(7.7f);
        lista.add(8.0f);

        System.out.println("Lista original: ");
        Listas.listar(lista);
        Listas.aleatorizar(lista);
        System.out.println("Lista embaralhada: ");
        Listas.listar(lista);


    }
}
