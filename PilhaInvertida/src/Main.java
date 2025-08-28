
public class Main {
    public static void main(String[] args) {

                PilhaInvertida stack=new PilhaInvertida(8);
                stack.push("Cavalo");
                stack.push("Cachorro");
                System.out.println("Espiar:"+stack.peek());
                stack.push("Gato");
                stack.push("Lagarto");
                System.out.println("Espiar:"+stack.peek());
                Object conteudo=stack.pop();
                stack.pop();
                stack.push("Tartaruga");
                stack.update("Tartaruga Marinha");
                stack.push(stack.pop());
                System.out.println("Espiar:"+stack.peek());
                stack.push(conteudo);
                System.out.println("Pilha="+stack.print());

    }
}