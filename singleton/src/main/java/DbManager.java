import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
    private static volatile DbManager dbManager ;
    private static volatile Connection connection;

    public Connection getConnection(){
        if(connection == null){
            synchronized (DbManager.class){      // in edge case not create 2 connection
                if(connection == null) {
                    try{
                        String driver = "com.mysql.cj.jdbc.Driver";
                        String url = "jdbc:mysql://localhost:3306/singleton?useSSL=false";
                        String username = "root";
                        String password = "developer$12";

                        Class.forName(driver);
                        connection = DriverManager.getConnection(url,username,password);
                    }catch (SQLException | ClassNotFoundException e){
                        System.out.println("connection error");
                        return null;
                    }
                }
            }
        }
        return connection;
    }

    private DbManager(){
        if(dbManager != null){
            throw new RuntimeException("reflection frameWork wont work goto getDbManager() ");
        }
    }

    public static DbManager getDbManager() {
        if(dbManager==null)  { // in edge cases if two thread comes at sometimes may two instance.. so double checking singleton principle


            synchronized (DbManager.class){     // now only one thread
                if(dbManager==null){
                    dbManager = new DbManager();
                }
            }


        }
        return dbManager;
    }
}
