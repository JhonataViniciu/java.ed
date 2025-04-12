package lib;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Listas {
    public static void listar(ArrayList dados){
        for(int i = 0; i < dados.size(); i++){
            System.out.print(dados.get(i) + " ");
        }
        System.out.println();
    }

    public static void aleatorizar(ArrayList dados){
        ArrayList dadosTemp = new ArrayList<>();
        Random rnd = new Random();
        while (dados.size() > 1){
            int posicao = rnd.nextInt(dados.size());
            dadosTemp.add(dados.get(posicao));
            dados.remove(posicao);
        }
        dadosTemp.add(dados.get(0));
        dados.clear();
        for(int i = 0; i < dadosTemp.size();i++){
            dados.add(dadosTemp.get(i));
        }
   
    }
}
