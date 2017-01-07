import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by issuser on 2017/1/6.
 */
public class Test {
    public static void main(String[] args) {

        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/managesystem?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull"; // 连接到 school 数据库

        String userid="root"; // 用户
        String passwd="123456"; // 密码


        try{
            Class.forName(driver);
        }
        catch(Exception e){
            System.out.println(" 无法载入 "+driver+" 驱动程序 !");
            e.printStackTrace();
        }


        try {
            Connection con= DriverManager.getConnection(url,userid,passwd);
            if(!con.isClosed())
                System.out.println(" 成功连接数据库 !");
            con.close();
        }
        catch(SQLException SQLe){
            System.out.println(" 无法连接数据库 !");
        }

    }
}
