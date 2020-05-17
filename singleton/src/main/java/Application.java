public class Application {
    public static void main(String[] args) {
        long t1;
        long t2;

        t1 = System.currentTimeMillis();
        DbManager dbManager1 = DbManager.getDbManager();
        dbManager1.getConnection();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);


        t1 = System.currentTimeMillis();
        DbManager dbManager2 = DbManager.getDbManager();
        dbManager2.getConnection();
        t1 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
