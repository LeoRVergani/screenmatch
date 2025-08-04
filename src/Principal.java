public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Avatar";
        meuFilme.anoDeLancamento = 1950;

        meuFilme.exibiFilhaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);
        meuFilme.avalia(2);
        meuFilme.avalia(7);

        System.out.println(meuFilme.pegaMedia());
    }
}