public class FinalPernambucano extends SubClasseBrasileiro {
    public static void main(String[] args) {
        final String anoNascimento = "2020";
        SubClasseBrasileiro pernambucano = new SubClasseBrasileiro();
        pernambucano.setNome("Dismiélisson Jérry");
        System.out.println("O indivíduo " + pernambucano.getNome() + ", nasceu em "
       + anoNascimento + " no País " + pernambucano.PAIS + " e fala " + pernambucano.idioma() );
    }
    
}
