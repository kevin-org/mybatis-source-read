package com.kevin.ibatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author dinghaifeng
 * @date 2021-01-04 11:07:04
 * @desc
 */
public class MybatisDoor {
    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = build.openSession();
        sqlSession.getMapper();
    }
}
