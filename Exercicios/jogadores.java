/*
1.Solicitar lista de 10 apostadores, cada um poderá apostar 4 números entre 0 e 9
2.Programa vai sortear 3 números entre 0 e 9 e exibir
3.Quem acertar pelo menos 2 números vai poder dividir o premio
4.Exibir lista de ganhadores, números apostados, e o valor que cada um ganhou. */

import java.util.*;

public class jogadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
            System.out.println("--- Cadastro De Jogador ---");

            for(int i = 1; i < 10; i++) {
                System.out.println("Digite seu nome Jogador! " + i + ": ");
                String nome = entrada.nextLine();

                List<Integer> nums = new ArrayList<>();
                while(nums.size() <4) {
                    System.out.print("Digite um numero "+ (nums.size() + 1) + " (entre 0 e 9):");
                    int num = entrada.nextInt();

                    if(num < 0 || num >9) {
                        System.out.println("Numero invalido. Escolha entre 0 e 9.");
                    } else if (nums.contains(num)) {
                        System.out.println("Esse numero ja foi escolhido.Digite outro.");
                    } else {
                        nums.add(num);
                    }
                }
                entrada.nextLine();

                jogadores.add(new Jogador(nome, nums));
                System.out.println();
            }
            System.out.println("--- Jogadores ---");
            for(Jogador j : jogadores) {
                System.out.println(j.nome + ": " + j.nums);
            }

            List<Integer> sort = new ArrayList<>();
            for(int i = 0; i < 9; i ++){
                sort.add(i);
            }

            embaralharNumeros(sort);

            List<Integer> sorteados = Arrays.asList(sort.get(0), sort.get(1), sort.get(2));

            System.out.println("\n---Numeros Sorteados --");
            System.out.println("Numeros: " + sorteados);

            System.out.println("\n--- Ganhadores ---");
            boolean ganhador = false;
            List<Jogador> ganhadores = new ArrayList<>();
            for(Jogador j : jogadores) {
                int acertos = 0;
                for(int num : sorteados) {
                    if(j.nums.contains(num)) {
                        acertos++;
                    }
                }
                if(acertos >= 2){
                ganhadores.add(j);
                }
            }

                if(ganhadores.isEmpty()) {
                    System.out.println("Ninguem Acertou os numeros.");
                } else {
                    double premio = 1_000_000.00;
                    double premioDividido = premio / ganhadores.size();

                    System.out.println("Ganhadores do premio: ");
                    for(Jogador g : ganhadores) {
                        System.out.printf("%s vai receber R$ %.2f \n", g.nome, premioDividido);
                    }
                }

                entrada.close();
            }
            

            static void embaralharNumeros(List<Integer> numeros) {
                Random rand = new Random();
                for( int i = numeros.size() - 1; i > 0; i-- ){
                    int j = rand.nextInt(i + 1);
                    int temp = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp);
                }
            }

            
        }
    

    


class Jogador {
    String nome;
    List<Integer> nums;

    Jogador(String nome, List<Integer> nums){
        this.nome = nome;
        this.nums = nums;
    }
}