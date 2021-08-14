package ch13.web.userInfo;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        //프로젝트의 전체에서 db.properties를 제일 먼저 찾는다.
        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties(); //key-value로 짝을 지어 불러옴
        prop.load(fis);
        String dbType = prop.getProperty("DBTYPE"); // DBTYPE에 해당하는 값을 불러옴

        UserInfo userInfo= new UserInfo();

        UserInfoDao userinfoDao = null;

        if (dbType.equals("ORACLE")){
            userinfoDao = new UserInfoOracleDao();
        } else if(dbType.equals("MYSQL")){
            userinfoDao = new UserInfoMysqlDao();
        } else{
            System.out.println("Unsupported DB");
            return;
        }
        userInfo.setUserId("taehee");
        userInfo.setPassword("10059a83");
        userInfo.setUserName("태희");
        userinfoDao.insertUserInfo(userInfo);
        userinfoDao.updateUserInfo(userInfo);
        userinfoDao.deleteUserInfo(userInfo);


    }
}
