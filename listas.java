import java.util.ArrayList;

public class listas {
    public static void main(String[] args) {
        cidades();
    }

    public static void cidades() {
        System.out.println("Cidades");
        ArrayList<String> listaCidades = new ArrayList<String>(); 
        listaCidades.add("\nSao Paulo");
        listaCidades.add("\nRio de Janeiro");
        listaCidades.add("\nArgentina");
        listaCidades.add("\nEstados Unidos");
        listaCidades.add("\nCanada");
        listaCidades.add(0, "Parana");  
        listaCidades.add(2,"\nChina");
        System.out.println(listaCidades);
        System.out.println(listaCidades.get(2));
        listaCidades.set(3,"\nGuaruja");
        System.out.println(listaCidades);
        listaCidades.remove(0);
        System.out.println(listaCidades);
        //listaCidades.add("\nilha Bela");
        System.out.println(listaCidades);
        listaCidades.add(6, "\nIlha Bela");
        System.out.println(listaCidades);
        System.out.println(listaCidades.size());
        System.out.println("\n Laço For");
        for (int x = 0; x < listaCidades.size(); x++) {
            System.out.println(listaCidades.get(x));
        }
        
        System.out.println("\n Laço For-Each");
        for ( String cidade : listaCidades) {
            System.out.println(cidade);

        }
    }

    public static void notar() {
        /*
         * Lista de notas em Double
         * 10, 9.5, 9, 8.75
         * ler a lista e calcular a media
         * exibir a lista
         * exibir a media
         */
    }
}