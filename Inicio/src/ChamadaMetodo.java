public class ChamadaMetodo {

    public static void main(String[] args) {
        String primeiroNome = "Grupo";
        String segundoNome = "Dislub";

        // Chamada do Metodo
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Atribuição do Metodo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado da concatenação: " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
