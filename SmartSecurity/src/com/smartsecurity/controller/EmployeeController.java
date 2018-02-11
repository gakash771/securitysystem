package com.smartsecurity.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.smartsecurity.model.Employee;

public class EmployeeController {
	public static boolean AddNewRecord(Employee A)
	{try{
		Connection cn = DBHelper.openConnection();
		String query="insert into employee(ename,edob,egender,ecoraddress,ecorstate,ecorcity,eperaddress,eperstate,epercity,edepartment,equalification,edesignation,emobile,eemail,ephoto) values('"+A.getEmployeeName()+"','"+A.getEmployeeDOB()+"','"+A.getEmployeeGender()+"','"+A.getEmployeeCorAddress()+"','"+A.getEmployeeCorState()+"','"+A.getEmployeeCorCity()+"','"+A.getEmployeePerAddress()+"','"+A.getEmployeePerState()+"','"+A.getEmployeePerCity()+"','"+A.getEmployeeDepartment()+"','"+A.getEmployeeQualification()+"','"+A.getEmployeeDesignation()+"','"+A.getEmployeeMobile()+"','"+A.getEmployeeEmail()+"','"+A.getEmployeePhoto()+"')";
		System.out.println(query);
		boolean st=DBHelper.executeUpdate(query, cn);
		return(st);
		
		
	}catch(Exception e){
		System.out.println("AddNewRecord "+e);
		return false;
	}
	}

	public static ResultSet DisplayAll()
	{try{
		Connection cn=DBHelper.openConnection();
		String query="select e.eid,e.ename,e.edob,e.egender,e.ecoraddress,(select s.statename from states s where s.stateid=e.ecorstate),(select c.cityname from cities c where c.cityid=e.ecorcity),e.eperaddress,(select s.statename from states s where s.stateid=e.eperstate),(select c.cityname from cities c where c.cityid=e.epercity),e.edepartment,e.equalification,e.edesignation,e.emobile,e.eemail,e.ephoto from employee e";
		ResultSet rs=DBHelper.executeQuery(query, cn);
		return(rs);
		
		
	}catch(Exception e){
		System.out.println("AddNewRecord "+e);
		return null;
	}}
		
	public static Employee DisplayByID(int eid)
	{try{
		Connection cn=DBHelper.openConnection();
		String query="select e.eid,e.ename,e.edob,e.egender,e.ecoraddress,e.ecorstate,(select s.statename from states s where s.stateid=e.ecorstate),e.ecorcity,(select c.cityname from cities c where c.cityid=e.ecorcity),e.eperaddress,e.eperstate,(select s.statename from states s where s.stateid=e.eperstate),e.epercity,(select c.cityname from cities c where c.cityid=e.epercity),e.edepartment,e.equalification,e.edesignation,e.emobile,e.eemail,e.ephoto from employee e where eid="+eid;
		ResultSet rs=DBHelper.executeQuery(query, cn);
		if(rs.next())
		{Employee A=new Employee();
		 A.setEmployeeId(rs.getString(1));
		 A.setEmployeeName(rs.getString(2));
		 A.setEmployeeDOB(rs.getString(3));
		 A.setEmployeeGender(rs.getString(4));
		 A.setEmployeeCorAddress(rs.getString(5));
		 A.setEmployeeCorState(rs.getString(6)+","+rs.getString(7));
		 A.setEmployeeCorCity(rs.getString(8)+","+rs.getString(9));
		 A.setEmployeePerAddress(rs.getString(10));
		 A.setEmployeePerState(rs.getString(11)+","+rs.getString(12));
		 A.setEmployeePerCity(rs.getString(13)+","+rs.getString(14));
		 A.setEmployeeDepartment(rs.getString(15));
		 A.setEmployeeQualification(rs.getString(16));
		 A.setEmployeeDesignation(rs.getString(17));
		 A.setEmployeeMobile(rs.getString(18));
		 A.setEmployeeEmail(rs.getString(19));
		 A.setEmployeePhoto(rs.getString(20));
		 System.out.println("cccccc");
		 return(A);
		}
		return(null);
	}catch(Exception e){
		System.out.println("AddNewRecord "+e);
		return null;
	}}

	public static boolean EditRecord(Employee A)
	{
	try{
		Connection cn=DBHelper.openConnection();
		String query="update employee set eid='"+A.getEmployeeId()+"',ename='"+A.getEmployeeName()+"',edob='"+A.getEmployeeDOB()+"',egender='"+A.getEmployeeGender()+"',ecoraddress='"+A.getEmployeeCorAddress()+"',ecorstate='"+A.getEmployeeCorState()+"',ecorcity='"+A.getEmployeeCorCity()+"',eperaddress='"+A.getEmployeePerAddress()+"',eperstate='"+A.getEmployeePerState()+"',epercity='"+A.getEmployeePerCity()+"',edepartment='"+A.getEmployeeDepartment()+"',equalification='"+A.getEmployeeQualification()+"',edesignation='"+A.getEmployeeDesignation()+"',emobile='"+A.getEmployeeMobile()+"',eemail='"+A.getEmployeeEmail()+"' where eid="+A.getEmployeeId(); 
		System.out.println(query);
		boolean st=DBHelper.executeUpdate(query, cn);
		return(st);
		
		
	}catch(Exception e){
		System.out.println("AddNewRecord "+e);
		return false;
	}
	}

	public static boolean DeleteRecord(int eid)
	{
	try{
		Connection cn=DBHelper.openConnection();
		String query="delete from employee where eid="+eid; 
		System.out.println(query);
		boolean st=DBHelper.executeUpdate(query, cn);
		return(st);
		
		
	}catch(Exception e){
		System.out.println("AddNewRecord "+e);
		return false;
	}
	}
	public static boolean EditPhoto(Employee E)
	{
	try{
		Connection cn=DBHelper.openConnection();
		String query="update employee set ephoto='"+E.getEmployeePhoto()+"' where eid="+E.getEmployeeId(); 
		System.out.println(query);
		boolean st=DBHelper.executeUpdate(query, cn);
		return(st);
		
		
	}catch(Exception e){
		System.out.println("EditRegistration "+e);
		return false;
	}
	}
}
