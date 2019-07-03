package com.covalense.jdbcapp.connectionpool;

import static com.covalense.jdbcapp.connectionpool.ConnectionPoolConstants.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {
	

	private Vector<Connection> pool;
	private int poolsize;
	private String dbUrl;
	private String userName;
	private String paasword;
	private String driverClassNM;
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	public ConnectionPool() throws Exception {
		loadProperties();

		initializePool();

	}// End of constructor.

	private void initializePool() throws Exception {
		pool = new Vector<>();
		Connection con = null;
		Class.forName(driverClassNM);
		for (int i = 0; i < poolsize; i++) {

			con = DriverManager.getConnection(dbUrl, userName, paasword);

			pool.add(con);
		}
	}

	private void loadProperties() throws Exception {

		poolsize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(POOL_SIZE));
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(DB_URL);
		userName = PropertyUtil.getPropertyUtil().getProperty(USER_NAME);
		paasword = PropertyUtil.getPropertyUtil().getProperty(PASS_WORD);
		driverClassNM = PropertyUtil.getPropertyUtil().getProperty(DRIVER_CLASS);

	}

	public Connection getConnectionFromPool() {

		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}

} // End of the class
