
public class Main {
    public static void main(String[] args) {
    Lista lista = new Lista();
        System.out.println("teste lista vazia");
        System.out.println(lista.isEmpty());
        System.out.println("/////////////////////////////////////////////////////////////////////");
    lista.add(new Alunos("eduardo"));
    lista.add(new Alunos("eduardo2"));
    lista.add(new Alunos("eduardo3"));
    lista.add(new Alunos("eduardo4","2000"));
    lista.print();
        System.out.println("teste indexOf");
        System.out.println(lista.indexOf(new Alunos("eduardo")));
        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        System.out.println("teste get");
        System.out.println(lista.get(0));
    lista.remove(2);
    lista.print();
    lista.remove(new Alunos("eduardo2"));
    lista.print();
    lista.clear();
    lista.print();
    }
}