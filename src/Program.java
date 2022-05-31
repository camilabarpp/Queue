import java.util.*;

public class Program extends Executores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue s = new LinkedList();
        for (int i = 1; i <= 10; i++)
        {
            s.add(i);
        }

        System.out.println();
        System.out.println("Coleção com tamanho: '" + s.size() + "' elementos!");

        System.out.println("------------------------------------------------");

        //Busca de um elemento
        System.out.println("Qual número você quer buscar? ");
        int a = sc.nextInt();
        s.contains(a);
        if (true) {
            System.out.println("Contém o '" + a + "' na coleção!");
        } else {
            System.out.println("Não contém o '" + a + "' na coleção!");
        }
        System.out.println();

        System.out.println("------------------------------------------------");

        //Inserção no inicio da coleção
        //System.out.println(q.());

        //Inserção no final da coleção
        System.out.println("Qual número você quer inserir? ");
        int n = sc.nextInt();
        s.add(n);

        System.out.println("------------------------------------------------");

        System.out.println("Conteúdo da coleção: ");
        Iterator itr = s.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("------------------------------------------------");

        //Remoção de um elemento no meio da coleção
        System.out.println("Qual elemento deseja remover? ");
        int m = sc.nextInt();
        s.remove(m);

        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Conteúdo da coleção: ");
        Iterator abc = s.iterator();
        while(abc.hasNext()) {
            Object element = abc.next();
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        //Remoção de todos elementos  da coleção
        System.out.println();
        System.out.println("Voce quer esvaziar a coleção? (Y/N)? ");
        char clear = sc.next().charAt(0);
        if (clear == 'Y') {
            Executores.comecar();
            s.clear();
            System.out.println("------------------------------------------------");
            System.out.println("Coleção vazia!");
            Executores.parar();
        } else   {
            Executores.comecar();
            Iterator aa = s.iterator();
            while(aa.hasNext()) {
                Object element = aa.next();
                System.out.print(element + " ");
            }
            System.out.println();
            Executores.parar();
        }



        sc.close();

    }
}