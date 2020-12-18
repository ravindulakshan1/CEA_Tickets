/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk;

/**
 *
 * @author ravindu
 */
class User {
    
    private int EPF_No,Year,Num; 
    private String Name,Designation,Division,Fault,CEA_No,Item_Type,Brand,Device_Type,CEA_division;

public User(int EPF_No,int Year,int Num, String Name,String Designation,String Division, String Fault, String CEA_No, String Item_Type,String Brand,String Device_Type,String CEA_division){

    this.EPF_No=EPF_No;
    this.Year=Year;
    this.Num=Num;
    this.Name=Name;
    this.Designation=Designation;
    this.Division=Division;
    this.Fault=Fault;
    this.CEA_No=CEA_No;
    this.Item_Type=Item_Type;
    this.Brand=Brand;
    this.Device_Type=Device_Type;
    this.CEA_division=CEA_division;
}
 User(int aInt, int aInt0, int aInt1, String string, String string0, String string1, String string2, String string3,String string4,String string5,String string6){
    throw new UnsupportedOperationException("Not supported yet."); }

public int getEPF_No(){
        return EPF_No;
    }
public int getYear(){
        return Year;
    }
public int Num(){
        return Num;
    }
public String Name(){
        return Name;
    }
public String Designation(){
        return Designation;
    }
public String Division(){
        return Division;
    }
public String Fault(){
        return Fault;
    }
public String CEA_No(){
        return CEA_No;
    }
public String Item_Type(){
        return Item_Type;
    }
public String Brand(){
        return Brand;
    }
public String Device_Type(){
        return Device_Type;
    }
public String CEA_division(){
        return CEA_division;
    }
}