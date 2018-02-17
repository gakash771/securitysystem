package com.smartsecurity.controller;

import java.sql.Connection;


import com.smartsecurity.model.VisitorExit;

public class VisitorExitController {
	public static boolean AddNewRecord(VisitorExit A)
	{try{
		Connection cn = DBHelper.openConnection();
		String query="insert into visitorexit(verfid,vedate,vetime) values('"+A.getRFID()+"','"+A.getExitdate()+"','"+A.getExittime()+"')";
		System.out.println(query);
		boolean st=DBHelper.executeUpdate(query, cn);
		return(st);
		
		
	}catch(Exception e){
		System.out.println("AddNewRecord "+e);
		return false;
	}
	}

}
