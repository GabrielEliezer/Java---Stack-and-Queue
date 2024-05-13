//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fila fila= new Fila(5);

    System.out.println("Adicionando: " + fila.adicionar("Abelha"));
    System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
    System.out.println("Adicionando: " + fila.adicionar("Casa"));
    System.out.println("Adicionando: " + fila.adicionar("Dragrão"));
    System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A Fila está vazia? " + fila.estaVazia());
        System.out.println("Tamanho  fila "+ fila.tamanho());


        while (!fila.estaVazia()) {
            System.out.println("Removendo da fila: " + fila.remover());
        }

        System.out.println("A fila está vazia? " + fila.estaVazia());

        // Testando a pilha
        Pilha pilha = new Pilha(5);

        System.out.println("");
        System.out.println("Adicionando: " + pilha.empilhar("Elemento A"));
        System.out.println("Adicionando: " + pilha.empilhar("Elemento B"));
        System.out.println("Adicionando: " + pilha.empilhar("Elemento C"));

        System.out.println("A pilha está vazia? " + pilha.estaVazia());

        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando da pilha: " + pilha.desempilhar());
        }

        System.out.println("A pilha está vazia? " + pilha.estaVazia());
}
}


