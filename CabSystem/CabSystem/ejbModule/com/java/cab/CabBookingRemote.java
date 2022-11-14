package com.java.cab;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CabBookingRemote {

	User searchUserBean(int userId) throws ClassNotFoundException, SQLException;
	List<Driver>  showDriverBean() throws ClassNotFoundException, SQLException;
	Driver searchDriverBean(int driverId) throws ClassNotFoundException, SQLException;
}