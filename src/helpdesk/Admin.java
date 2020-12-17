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
class Admin {
    
    private int EPF_No,Year,Num,Job_ID,Warr_Period,Rep_Year,Rep_Month,Sup_No,Sup_ConNo;
    private String Name,Designation,Division,Fault,CEA_No,Item_Type,Brand,Device_Type,CEA_division,Repair_Details,Done_By,Rec_Date,Hand_Date,Serial_No,Rep_Item,Rep_Date,Sup_Name;
    
    public Admin(int EPF_No,int Year,int Num,int Job_ID,int Warr_Period,int Rep_Year,int Rep_Month,int Sup_No,int Sup_ConNo,String Name,String Designation,String Division,String Fault,String CEA_No,String Item_Type,String Brand,String Device_Type,String CEA_division,String Repair_Details,String Done_By,String Rec_Date,String Hand_Date,String Serial_No,String Rep_Item,String Rep_Date,String Sup_Name){
    
        this.EPF_No=EPF_No;
        this.Year=Year;
        this.Num=Num;
        this.Job_ID=Job_ID;
        this.Warr_Period=Warr_Period;
        this.Rep_Year=Rep_Year;
        this.Rep_Month=Rep_Month;
        this.Sup_No=Sup_No;
        this.Sup_ConNo=Sup_ConNo;
        this.Name=Name;
        this.Designation=Designation;
        this.Division=Division;
        this.Fault=Fault;
        this.CEA_No=CEA_No;
        this.Item_Type=Item_Type;
        this.Brand=Brand;
        this.Device_Type=Device_Type;
        this.CEA_division=CEA_division;
        this.Repair_Details=Repair_Details;
        this.Done_By=Done_By;
        this.Rec_Date=Rec_Date;
        this.Hand_Date=Hand_Date;
        this.Serial_No=Serial_No;
        this.Rep_Item=Rep_Item;
        this.Rep_Date=Rep_Date;
        this.Sup_Name=Sup_Name;
    }

    Admin(int aInt, int aInt0, int aInt1, int aInt2, int aInt3, int aInt4, int aInt5, int aInt6,int aInt7,int aInt8, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public int getEPF_No(){
        return EPF_No;
    }
    
    public int getYear(){
        return Year;
    }
    
    public int getNum(){
        return Num;
    }
    public int getJob_ID(){
        return Job_ID;
    }
    public int getWarr_Period(){
        return Warr_Period;
    }
    public int getRep_Year(){
        return Rep_Year;
    }
    public int getRep_Month(){
        return Rep_Month;
    }
    public int getSup_No(){
        return Sup_No;
    }
    public int getSup_ConNo(){
        return Sup_ConNo;
    }
    public String getName(){
        return Name;
    }
    public String getDesignation(){
        return Designation;
    }
    public String getDivision(){
        return Division;
    }
    public String getFault(){
        return Fault;
    }
    public String getCEA_No(){
        return CEA_No;
    }
    public String getItem_Type(){
        return Item_Type;
    }
    public String getBrand(){
        return Brand;
    }
    public String getDevice_Type(){
        return Device_Type;
    }
    public String getCEA_division(){
        return CEA_division;
    }
    public String getRepair_Details(){
        return Repair_Details;
    }
    public String getDone_By(){
        return Done_By;
    }
    public String getRec_Date(){
        return Rec_Date;
    }
    public String getHand_Date(){
        return Hand_Date;
    }
    public String getSerial_No(){
        return Serial_No;
    }
    public String getRep_Item(){
        return Rep_Item;
    }
    public String getRep_Date(){
        return Rep_Date;
    }
    public String getSup_Name(){
        return Sup_Name;
    }
      
}
