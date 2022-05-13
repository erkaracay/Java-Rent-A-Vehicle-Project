package GUI;

import SysAndMain.VehicleSys;
import Vehicles.Motorcycle;
import javax.swing.ImageIcon;

public class MotorFrame extends javax.swing.JFrame {

    CarFrame CF;
    CaravanFrame CaraFrame = new CaravanFrame(this);
    
    ImageIcon ybr = new ImageIcon(getClass().getResource("../YBR125.jpeg"));
    ImageIcon si = new ImageIcon(getClass().getResource("../SportsterIron.jpeg"));
    ImageIcon tri = new ImageIcon(getClass().getResource("../Tricity.jpeg"));
    
    public MotorFrame(CarFrame CF) {
        initComponents();
        this.CF = CF;
        
        Motorcycle ybr125 = (Motorcycle) VehicleSys.searchVehicle("ybr125");
        Motorcycle sportster = (Motorcycle) VehicleSys.searchVehicle("sportster iron");
        Motorcycle tricity = (Motorcycle) VehicleSys.searchVehicle("tricity 300");
        labelImg.setIcon(ybr);
        labelImg1.setIcon(si);
        labelImg2.setIcon(tri);
        labelModel.setText(ybr125.getModelYear()  + " " + ybr125.getBrand() + " " + ybr125.getModel());
        labelModel3.setText(sportster.getModelYear()  + " " + sportster.getBrand() + " " + sportster.getModel());
        labelModel4.setText(tricity.getModelYear()  + " " + tricity.getBrand() + " " + tricity.getModel());
        labelColor.setText(ybr125.getColor());
        labelColor3.setText(sportster.getColor());
        labelColor4.setText(tricity.getColor());
        labelCapacity.setText(ybr125.getCapacity() + "");
        labelCapacity3.setText(sportster.getCapacity() + "");
        labelCapacity4.setText(tricity.getCapacity() + "");
        labelEngineCap.setText(ybr125.getEngineCapacity() + "");
        labelEngineCap1.setText(sportster.getEngineCapacity() + "");
        labelEngineCap2.setText(tricity.getEngineCapacity() + "");
        labelHP.setText(ybr125.getHorsePower() + "HP");
        labelHP3.setText(sportster.getHorsePower() + "HP");
        labelHP4.setText(tricity.getHorsePower() + "HP");
        labelMilage.setText(ybr125.getMilage() + "KM");
        labelMilage3.setText(sportster.getMilage() + "KM");
        labelLicense.setText(ybr125.getRequiredLicense() + " License");
        labelLicense3.setText(sportster.getRequiredLicense() + " License");
        labelLicense4.setText(tricity.getRequiredLicense() + " License");
        labelPrice.setText(ybr125.getDailyPrice() + "₺");
        labelPrice3.setText(sportster.getDailyPrice() + "₺");
        labelPrice4.setText(tricity.getDailyPrice() + "₺");
        labelPlate.setText(ybr125.getPlateNo());
        labelPlate3.setText(sportster.getPlateNo());
        labelPlate4.setText(tricity.getPlateNo());
        labelType.setText(ybr125.getType());
        labelType1.setText(sportster.getType());
        labelType2.setText(tricity.getType());
        labelTrunk.setText(ybr125.getTrunk() + "");
        labelTrunk1.setText(sportster.getTrunk() + "");
        labelTrunk2.setText(tricity.getTrunk() + "");
        labelWheels.setText(ybr125.getNumOfWheels() + "");
        labelWheels1.setText(sportster.getNumOfWheels() + "");
        labelWheels2.setText(tricity.getNumOfWheels() + "");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEngineCap = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelMilage = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelLicense = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelPlate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelHP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        labelCapacity = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelTrunk = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelWheels = new javax.swing.JLabel();
        labelEngineCap1 = new javax.swing.JLabel();
        labelImg1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelMilage3 = new javax.swing.JLabel();
        labelModel3 = new javax.swing.JLabel();
        labelColor3 = new javax.swing.JLabel();
        labelLicense3 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPlate3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelHP3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAdd3 = new javax.swing.JButton();
        labelCapacity3 = new javax.swing.JLabel();
        labelPrice3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelType1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelTrunk1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelWheels1 = new javax.swing.JLabel();
        labelEngineCap2 = new javax.swing.JLabel();
        labelImg2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelMilage4 = new javax.swing.JLabel();
        labelModel4 = new javax.swing.JLabel();
        labelColor4 = new javax.swing.JLabel();
        labelLicense4 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        labelPlate4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelHP4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnAdd4 = new javax.swing.JButton();
        labelCapacity4 = new javax.swing.JLabel();
        labelPrice4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        labelType2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelTrunk2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        labelWheels2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Milage:");

        labelColor.setToolTipText("");

        j.setText("Engine Capacity:");

        jLabel2.setText("Plate No:");

        jLabel4.setText("Horse Power:");

        jLabel6.setText("Capacity: ");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton1.setText("CARS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        labelPrice.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N

        jButton2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton2.setText("CARAVANS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Type:");

        jLabel3.setText("Trunk:");

        jLabel5.setText("Num Of Wheels:");

        jLabel7.setText("Milage:");

        labelColor3.setToolTipText("");

        j1.setText("Engine Capacity:");

        jLabel8.setText("Plate No:");

        jLabel9.setText("Horse Power:");

        jLabel14.setText("Capacity: ");

        btnAdd3.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        btnAdd3.setText("ADD");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        labelPrice3.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N

        jLabel23.setText("Type:");

        jLabel15.setText("Trunk:");

        jLabel16.setText("Num Of Wheels:");

        jLabel21.setText("Milage:");

        labelColor4.setToolTipText("");

        j2.setText("Engine Capacity:");

        jLabel24.setText("Plate No:");

        jLabel25.setText("Horse Power:");

        jLabel26.setText("Capacity: ");

        btnAdd4.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        btnAdd4.setText("ADD");
        btnAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd4ActionPerformed(evt);
            }
        });

        labelPrice4.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N

        jLabel27.setText("Type:");

        jLabel28.setText("Trunk:");

        jLabel29.setText("Num Of Wheels:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(6, 6, 6)
                        .addComponent(labelType, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelLicense, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEngineCap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelTrunk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMilage, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(labelWheels, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelModel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(11, 11, 11)
                        .addComponent(labelType1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelLicense3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(labelEngineCap1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(labelTrunk1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMilage3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlate3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHP3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(labelPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCapacity3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(labelWheels1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelModel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelLicense4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(labelEngineCap2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMilage4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlate4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHP4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(labelPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCapacity4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel27)
                .addGap(1, 1, 1)
                .addComponent(labelType2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addGap(5, 5, 5)
                .addComponent(labelTrunk2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addGap(6, 6, 6)
                .addComponent(labelWheels2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(labelLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelEngineCap, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(labelType, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMilage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(labelCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(labelWheels, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelHP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(labelTrunk, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelModel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(labelColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelLicense3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEngineCap1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(labelType1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(labelTrunk1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMilage3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPlate3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(labelHP3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(labelCapacity3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(labelWheels1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelModel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(labelColor4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(labelLicense4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEngineCap2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel24)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMilage4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPlate4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(labelHP4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(labelCapacity4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAdd4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(labelType2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(labelTrunk2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(labelWheels2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        CF.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        CaraFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnAdd4;
    private javax.swing.JLabel j;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCapacity;
    private javax.swing.JLabel labelCapacity3;
    private javax.swing.JLabel labelCapacity4;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelColor3;
    private javax.swing.JLabel labelColor4;
    private javax.swing.JLabel labelEngineCap;
    private javax.swing.JLabel labelEngineCap1;
    private javax.swing.JLabel labelEngineCap2;
    private javax.swing.JLabel labelHP;
    private javax.swing.JLabel labelHP3;
    private javax.swing.JLabel labelHP4;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelImg1;
    private javax.swing.JLabel labelImg2;
    private javax.swing.JLabel labelLicense;
    private javax.swing.JLabel labelLicense3;
    private javax.swing.JLabel labelLicense4;
    private javax.swing.JLabel labelMilage;
    private javax.swing.JLabel labelMilage3;
    private javax.swing.JLabel labelMilage4;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelModel3;
    private javax.swing.JLabel labelModel4;
    private javax.swing.JLabel labelPlate;
    private javax.swing.JLabel labelPlate3;
    private javax.swing.JLabel labelPlate4;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelPrice3;
    private javax.swing.JLabel labelPrice4;
    private javax.swing.JLabel labelTrunk;
    private javax.swing.JLabel labelTrunk1;
    private javax.swing.JLabel labelTrunk2;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelType1;
    private javax.swing.JLabel labelType2;
    private javax.swing.JLabel labelWheels;
    private javax.swing.JLabel labelWheels1;
    private javax.swing.JLabel labelWheels2;
    // End of variables declaration//GEN-END:variables
}
