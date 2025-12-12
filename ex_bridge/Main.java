public class Main {
    public static void main(String[] args) {
        Armazenamento fileStore = new ArmazenamentoSo();
        Armazenamento sqlStore = new ArmazenamentoBdSql();
        Armazenamento noSqlStore = new ArmazenamentoNoSql();

        ManipuladorDeDados repoFile = new ManipuladorDeDados(fileStore);
        ManipuladorDeDados repoSql = new ManipuladorDeDados(sqlStore);
        ManipuladorDeDados repoNoSql = new ManipuladorDeDados(noSqlStore);

        repoFile.save("1", "GTX 1080TI.exe");
        repoSql.save("2", "RAM.exe");
        repoNoSql.save("3", "EldenRing.exe");

        System.out.println(repoFile.load("1"));
        System.out.println(repoSql.load("2"));
        System.out.println(repoSql.load("3"));
    }
}
