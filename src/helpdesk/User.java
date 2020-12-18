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

public User(int EPF_No,int Year,int Num, String Name,String Designation, String Fault, String CEA_No, String Item_Type,String Brand,String Device_Type,String CEA_Division){

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
}