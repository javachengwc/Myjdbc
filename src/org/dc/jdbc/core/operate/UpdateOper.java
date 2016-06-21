package org.dc.jdbc.core.operate;

import java.sql.Connection;

import org.dc.jdbc.cache.core.JedisHelper;
import org.dc.jdbc.config.JDBCConfig;
import org.dc.jdbc.core.ConnectionManager;
import org.dc.jdbc.core.base.OperSuper;

import com.alibaba.druid.pool.DruidDataSource;
/**
 * 更新操作
 * @author dc
 * @time 2015-8-17
 */
public class UpdateOper extends OperSuper{
	private static final JedisHelper jedisHelper = JedisHelper.getInstance();
    private static final UpdateOper oper = new UpdateOper();
    public static UpdateOper getInstance(){
        return oper;
    }
	public int update(DruidDataSource dataSource,String sql,Object[] params) throws Exception{
		if(JDBCConfig.isSQLCache){
			String key = super.getSQLKey(sql, params,dataSource);
			jedisHelper.delSQLCache(key);
		}
		
		Connection conn = ConnectionManager.getConnection(dataSource);
		return super.preparedAndExcuteSQL(conn, sql, params);
	}
}
