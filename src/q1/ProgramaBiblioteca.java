package q1;

public class ProgramaBiblioteca {
    public static void main(String args[]){
        Livro l1 = new Livro("O que o sol faz com as flores","Rupi Kaur",2017,"Poesia","Planeta",50, 1, 2222);

        Filme f1 = new Filme("Sol da meia noite","kenji Bando",2018,"Romance","...",100,"Kenji Bando", "Bella Thorne","Uma jovem que sofre com uma sensibilidade ao sol se apaixona por um garoto...",92);


        Publicacao publi[] = new Publicacao[2];
        publi[0] = l1;
        publi[1]= f1;

        for(Publicacao publicacao : publi){
            publicacao.imprimirDados();
            System.out.println();
        }

    }
}
