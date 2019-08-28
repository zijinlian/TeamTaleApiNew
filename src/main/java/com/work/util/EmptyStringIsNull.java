package com.work.util;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.codehaus.plexus.util.StringUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by System_User on 2017/1/1.
 */
public class EmptyStringIsNull implements TypeHandler<String> {
    @Override
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
//        //防止为null时，创建XMLType出现错误
//        if (StringUtils.isNotBlank(parameter)) {
//            DelegatingConnection connection = (DelegatingConnection) ps.getConnection()
//                    .getMetaData().getConnection();
//            XMLType xmltype = XMLType.createXML(connection.getDelegate(), parameter);
//            ps.setObject(i, xmltype);
//        } else {
//            ps.setString(i, null);
    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        return (rs.getString(columnName)==null)?"":rs.getString(columnName);
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
            return rs.getString(columnIndex);
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
            return cs.getString(columnIndex);
    }
}
