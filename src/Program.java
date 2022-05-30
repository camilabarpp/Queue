import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();


        Scanner sc = new Scanner(System.in);;

        //Adicionando 1 milhão de elementos
        for (int i = 1; i <= 10; i++)
        {
            q.add(i);
        }

        System.out.println();
        System.out.println("Fila com tamanho: '" + q.size() + "' elementos!");

        System.out.println("------------------------------------------------");

        //Mostrar o primeiro elemento
        System.out.println("Mostrando o primeiro elemento: '" + q.peek() + "'");

        System.out.println("------------------------------------------------");

        //Busca de um elemento
        System.out.println("Qual número você quer buscar? ");
        int a = sc.nextInt();
        q.contains(a);
        if (true) {
            System.out.println("Contém o " + a + " na fila!");
        } else {
            System.out.println("Não contém o " + a + " na fila!");
        }


        System.out.println("------------------------------------------------");

        //Inserção no inicio da coleção
        //System.out.println(q.());

        //Inserção no final da coleção
        System.out.println("Qual número você quer inserir? ");
        int n = sc.nextInt();
        q.add(n);

        System.out.println("------------------------------------------------");

        System.out.println("Conteúdo da fila: ");
        Iterator itr = q.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        //Remoção de um elemento no meio da coleção
        System.out.println("Qual elemento deseja remover? ");
        int m = sc.nextInt();
        q.remove(m);


        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Conteúdo da fila: ");
        Iterator abc = q.iterator();
        while(abc.hasNext()) {
            Object element = abc.next();
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        //Remoção de todos elementos  da coleção
        System.out.println();
        System.out.println("Voce quer esvaziar a fila? (Y/N)? ");
        char clear = sc.next().charAt(0);
        if (clear == 'Y') {
            q.clear();
            System.out.println("------------------------------------------------");
            System.out.println("fila vazia!");
        } else   {
            Iterator aa = q.iterator();
            while(aa.hasNext()) {
                Object element = aa.next();
                System.out.print(element + " ");
            }
            System.out.println();

        }

        System.out.println("------------------------------------------------");

        sc.close();

    }
}
