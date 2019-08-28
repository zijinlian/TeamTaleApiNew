package cn.autually.base;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by fangzhen on 2016/11/29.
 */
public class DBPool {
    private SqlSessionFactory sqlSessionFactory;
    private static DBPool instance = null;
    private DBPool(){
        String resource = "mybatis_config.xml";
        //加载mybatis 的配置文件（它也加载关联的映射文件）
        System.out.println(DBPool.class.getClassLoader().getResource(".").toString());
        InputStream is = DBPool.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession 的工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    public static DBPool getInstance(){
        if (instance == null) {
            instance = new DBPool();
        }
        return instance;
    }
    public SqlSession openSession(){
        return  sqlSessionFactory.openSession();//使用参数 true 则为自动提交
    }

    public SqlSession openSession(ExecutorType var1){
        return  sqlSessionFactory.openSession(var1,true);//使用参数 true 则为自动提交
    }
}
