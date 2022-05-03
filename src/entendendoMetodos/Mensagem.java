package entendendoMetodos;


public class Mensagem {
    public static void pegarMensagem(int horario) {

        if (horario > 5 && horario <= 11) {
            System.out.println("Bom dia!");
        }
        else if (horario > 12 && horario <= 17) {
            System.out.println("Boa tarde!");
        }
        else System.out.println("Boa noite!");

    }
}
