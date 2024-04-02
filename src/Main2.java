public class Main2 {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada= new ListaEncadeada();
        System.out.println("teste lista vazia");
        System.out.println(listaEncadeada.isEmpty());
        System.out.println("/////////////////////////////////////////////////////////////////////");
        listaEncadeada.add(new Alunos("eduardo"));
        listaEncadeada.add(new Alunos("eduardo2"));
        listaEncadeada.add(new Alunos("eduardo3"));
        listaEncadeada.add(new Alunos("eduardo4","2000"));
        listaEncadeada.print();
        System.out.println("teste indexOf");
        System.out.println(listaEncadeada.indexOf(new Alunos("eduardo")));
        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        System.out.println("teste get");
        System.out.println(listaEncadeada.get(0));
        listaEncadeada.remove(2);
        listaEncadeada.print();
        listaEncadeada.remove(new Alunos("eduardo2"));
        listaEncadeada.print();
        listaEncadeada.clear();
        listaEncadeada.print();
    }
}
