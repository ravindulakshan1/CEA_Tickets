package helpdesk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravindu
 */
public class NewAdminPnl extends javax.swing.JFrame {
    
        public NewAdminPnl() {
        initComponents();
        show_Admin();
    }


    public ArrayList<Admin> adminList(){

    ArrayList <Admin> adminList = new ArrayList<>();
    
       try {
            Connection conn = null;
            conn=MySQLConnect.ConnectDB();
            
            String query1="SELECT * FROM all_table";
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Admin admin;
            
            while(rs.next()){
            
                admin=new Admin(rs.getInt("EPF_No"),rs.getInt("Year"),rs.getInt("Num"),rs.getInt("Job_ID"),rs.getInt("Warr_Period"),rs.getInt("Rep_Year"),rs.getInt("Rep_Month"),rs.getInt("Sup_No"),rs.getInt("Sup_ConNo"),rs.getString("Name"),rs.getString("Designation"),rs.getString("Division"),rs.getString("Fault"),rs.getString("CEA_No"),rs.getString("Item_Type"),rs.getString("Brand"),rs.getString("Device_Type"),rs.getString("CEA_division"),rs.getString("Repair_Details"),rs.getString("Done_By"),rs.getString("Rec_Date"),rs.getString("Hand_Date"),rs.getString("Serial_No"),rs.getString("Rep_Item"),rs.getString("Rep_Date"),rs.getString("Sup_Name"));
                adminList.add(admin);
            }
            
        } catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
            
        }
    return adminList;
}
    public void show_Admin(){
    
        ArrayList<Admin> list=adminList();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[26];
       
        for(int i=0;i<list.size();i++){
        
            row[0]=list.get(i).getEPF_No();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getDesignation();
            row[3]=list.get(i).getDivision();
            row[4]=list.get(i).getFault();
            row[5]=list.get(i).getCEA_No();
            row[6]=list.get(i).getItem_Type();
            row[7]=list.get(i).getBrand();
            row[8]=list.get(i).getDevice_Type();
            row[9]=list.get(i).getYear();
            row[10]=list.get(i).getCEA_division();
            row[11]=list.get(i).getNum();
            row[12]=list.get(i).getJob_ID();
            row[13]=list.get(i).getRepair_Details();
            row[14]=list.get(i).getDone_By();
            row[15]=list.get(i).getRec_Date();
            row[16]=list.get(i).getHand_Date();
            row[17]=list.get(i).getWarr_Period();
            row[18]=list.get(i).getSerial_No();
            row[19]=list.get(i).getRep_Item();
            row[20]=list.get(i).getRep_Year();
            row[21]=list.get(i).getRep_Month();
            row[22]=list.get(i).getRec_Date();
            row[23]=list.get(i).getSup_No();
            row[24]=list.get(i).getSup_Name();
            row[25]=list.get(i).getSup_ConNo();
            
            model.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        EPF_Ad_In = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Name_Ad_In = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Desig_Ad_In = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Fault_Ad_In = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        CEA_Ad_In = new javax.swing.JTextField();
        ItemTyp_Ad_In = new javax.swing.JTextField();
        Brand_Ad_In = new javax.swing.JTextField();
        DeviceTyp_Ad_In = new javax.swing.JTextField();
        Year_Ad_In = new javax.swing.JTextField();
        Division_Ad_In = new javax.swing.JTextField();
        Num_Ad_In = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JobID_Ad_In = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Rep_Details_Ad_In = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        Done_By_Ad_In = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Rec_Date_Ad_In = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Hand_Date_Ad_In = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Warr_Peri_Ad_In = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Serial_No_Ad_In = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Rep_Item_Ad_In = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Rep_Yr_Ad_In = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Rep_Mon_Ad_In = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Rep_Date_Ad_In = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Sup_Name_Ad_In = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Sup_Con_Num_Ad_In = new javax.swing.JTextField();
        btnSubmit_Ad = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Sup_No_Ad_In = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Divi_Ad_In = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 208, 169));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EPF_No", "Name", "Designation", "Division", "Fault", "CEA_No", "Item_Type", "Brand", "Device_Type", "Year", "Division", "Num", "Job_ID", "Repair_Details", "Done_By", "Rec_Date", "Hand_Date", "War_Period", "Serial_No", "Rep_Item", "Rep_Year", "Rep_Month", "Rep_Date", "Sup_Name", "Sup_ConNo"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("EPF_No");

        EPF_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EPF_Ad_InActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Designation");

        jLabel4.setText("Fault");

        Fault_Ad_In.setColumns(20);
        Fault_Ad_In.setRows(5);
        jScrollPane3.setViewportView(Fault_Ad_In);

        jLabel5.setText("CEA_No");

        CEA_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEA_Ad_InActionPerformed(evt);
            }
        });

        jLabel6.setText("Job_ID");

        JobID_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobID_Ad_InActionPerformed(evt);
            }
        });

        jLabel7.setText("Repair_Details");

        Rep_Details_Ad_In.setColumns(20);
        Rep_Details_Ad_In.setRows(5);
        jScrollPane4.setViewportView(Rep_Details_Ad_In);

        jLabel8.setText("Done_By");

        Done_By_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_By_Ad_InActionPerformed(evt);
            }
        });

        jLabel9.setText("Recieved_Date");

        jLabel10.setText("Handedover_Date");

        Hand_Date_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hand_Date_Ad_InActionPerformed(evt);
            }
        });

        jLabel11.setText("Warranty_Period");

        Warr_Peri_Ad_In.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "6", "9", "12", "24", "36" }));

        jLabel12.setText("Serial_Number");

        Serial_No_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Serial_No_Ad_InActionPerformed(evt);
            }
        });

        jLabel13.setText("Repaired_Item");

        jLabel14.setText("Repaired_Year");

        Rep_Yr_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep_Yr_Ad_InActionPerformed(evt);
            }
        });

        jLabel15.setText("Repaired_Month");

        Rep_Mon_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep_Mon_Ad_InActionPerformed(evt);
            }
        });

        jLabel16.setText("Repaired_Date");

        jLabel17.setText("Supplier_Name");

        jLabel18.setText("Supplier_Contact_No");

        btnSubmit_Ad.setText("Submit");
        btnSubmit_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit_AdActionPerformed(evt);
            }
        });

        jLabel19.setText("Supplier_No");

        Sup_No_Ad_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sup_No_Ad_InActionPerformed(evt);
            }
        });

        jLabel20.setText("Division");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sup_Con_Num_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sup_Name_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit_Ad)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EPF_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Name_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Desig_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JobID_Ad_In, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CEA_Ad_In, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ItemTyp_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Brand_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DeviceTyp_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Year_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Division_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Num_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(20, 20, 20)))
                            .addComponent(Done_By_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Hand_Date_Ad_In, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(Rec_Date_Ad_In, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(Warr_Peri_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Rep_Item_Ad_In, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(Serial_No_Ad_In, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Sup_No_Ad_In, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Rep_Date_Ad_In, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(Rep_Mon_Ad_In, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Rep_Yr_Ad_In, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(Divi_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1550, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EPF_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desig_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Divi_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CEA_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemTyp_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brand_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeviceTyp_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Division_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JobID_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Done_By_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Rec_Date_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Hand_Date_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Warr_Peri_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Serial_No_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Rep_Item_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Rep_Yr_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Rep_Mon_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Rep_Date_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Sup_No_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Sup_Name_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Sup_Con_Num_Ad_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit_Ad)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EPF_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EPF_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EPF_Ad_InActionPerformed

    private void CEA_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEA_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEA_Ad_InActionPerformed

    private void JobID_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobID_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobID_Ad_InActionPerformed

    private void Done_By_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_By_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Done_By_Ad_InActionPerformed

    private void Hand_Date_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hand_Date_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hand_Date_Ad_InActionPerformed

    private void Serial_No_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Serial_No_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Serial_No_Ad_InActionPerformed

    private void Rep_Yr_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep_Yr_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rep_Yr_Ad_InActionPerformed

    private void Rep_Mon_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep_Mon_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rep_Mon_Ad_InActionPerformed

    private void Sup_No_Ad_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sup_No_Ad_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sup_No_Ad_InActionPerformed

    private void btnSubmit_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit_AdActionPerformed
        
        try {
            Connection conn = null;
            conn=MySQLConnect.ConnectDB();
            
            int row=jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE all_table SET EPF_No=?,Name=?,Designation=?,Division=?,Fault=?,CEA_No=?,Item_Type=?,Brand=?,Device_Type=?,Year=?,CEA_division=?,Num=?,Job_ID=?,Repair_Details=?,Done_By=?,Rec_Date=?,Hand_Date=?,Warr_Period=?,Serial_No=?,Rep_Item=?,Rep_Year=?,Rep_Month=?,Rep_Date=?,Sup_No=?,Sup_Name=?,Sup_ConNo=?"+value;
            
            final PreparedStatement ps= conn.prepareStatement(query);
            ps.setString(1,EPF_Ad_In.getText());
            ps.setString(2,Name_Ad_In.getText());
            ps.setString(3,Desig_Ad_In.getText());
            ps.setString(4,Divi_Ad_In.getText());
            ps.setString(5,Fault_Ad_In.getText());
            ps.setString(6,CEA_Ad_In.getText());
            ps.setString(7,ItemTyp_Ad_In.getText());
            ps.setString(8,Brand_Ad_In.getText());
            ps.setString(9,DeviceTyp_Ad_In.getText());
            ps.setString(10,Year_Ad_In.getText());
            ps.setString(11,Division_Ad_In.getText());
            ps.setString(12,Num_Ad_In.getText());
            ps.setString(13,JobID_Ad_In.getText());
            ps.setString(14,Rep_Details_Ad_In.getText());
            ps.setString(15,Done_By_Ad_In.getText());
            ps.setString(16,Rec_Date_Ad_In.getText());
            ps.setString(17,Hand_Date_Ad_In.getText());
            ps.setString(18,Warr_Peri_Ad_In.getSelectedObjects().toString());
            ps.setString(19,Serial_No_Ad_In.getText());
            ps.setString(20,Rep_Item_Ad_In.getText());
            ps.setString(21,Rep_Yr_Ad_In.getText());
            ps.setString(22,Rep_Mon_Ad_In.getText());
            ps.setString(23,Rep_Date_Ad_In.getText());
            ps.setString(24,Sup_No_Ad_In.getText());
            ps.setString(25,Sup_Name_Ad_In.getText());
            ps.setString(26,Sup_Con_Num_Ad_In.getText());
            
            
            ps.execute();
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btnSubmit_AdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewAdminPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAdminPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAdminPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdminPnl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAdminPnl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand_Ad_In;
    private javax.swing.JTextField CEA_Ad_In;
    private javax.swing.JTextField Desig_Ad_In;
    private javax.swing.JTextField DeviceTyp_Ad_In;
    private javax.swing.JTextField Divi_Ad_In;
    private javax.swing.JTextField Division_Ad_In;
    private javax.swing.JTextField Done_By_Ad_In;
    private javax.swing.JTextField EPF_Ad_In;
    private javax.swing.JTextArea Fault_Ad_In;
    private javax.swing.JTextField Hand_Date_Ad_In;
    private javax.swing.JTextField ItemTyp_Ad_In;
    private javax.swing.JTextField JobID_Ad_In;
    private javax.swing.JTextField Name_Ad_In;
    private javax.swing.JTextField Num_Ad_In;
    private javax.swing.JTextField Rec_Date_Ad_In;
    private javax.swing.JTextField Rep_Date_Ad_In;
    private javax.swing.JTextArea Rep_Details_Ad_In;
    private javax.swing.JTextField Rep_Item_Ad_In;
    private javax.swing.JTextField Rep_Mon_Ad_In;
    private javax.swing.JTextField Rep_Yr_Ad_In;
    private javax.swing.JTextField Serial_No_Ad_In;
    private javax.swing.JTextField Sup_Con_Num_Ad_In;
    private javax.swing.JTextField Sup_Name_Ad_In;
    private javax.swing.JTextField Sup_No_Ad_In;
    private javax.swing.JComboBox<String> Warr_Peri_Ad_In;
    private javax.swing.JTextField Year_Ad_In;
    private javax.swing.JButton btnSubmit_Ad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
