
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Models.Item;
import View.ItemRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jdoul
 */
@SuppressWarnings("unchecked")
public class Katastima extends javax.swing.JFrame {


    ArrayList<Item> monitor = new ArrayList<>();
    ArrayList<Item> laptop = new ArrayList<>();
    ArrayList<Item> computer = new ArrayList<>();
    ArrayList<Item> peripherals = new ArrayList<>();
    ArrayList<String> client = new ArrayList<>();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG and JPEG images", "png", "jpg", "jpeg");
    ImageIcon ficon = new ImageIcon("src/DefaultImage/noimage.png");
    BufferedImage image = null;
    ImageIcon logo = new ImageIcon("src/DefaultImage/Shop.png");
    Item tempitem;
    int[] sel;

    public Katastima() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMonitorTab = new javax.swing.JFrame();
        mmodel = new javax.swing.JTextField();
        mvalue = new javax.swing.JTextField();
        mposotita = new javax.swing.JSpinner();
        finaladdmonitor = new javax.swing.JButton();
        micon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addLaptopTab = new javax.swing.JFrame();
        lmodel = new javax.swing.JTextField();
        lvalue = new javax.swing.JTextField();
        lposotita = new javax.swing.JSpinner();
        finaladdlaptop = new javax.swing.JButton();
        licon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addComputerTab = new javax.swing.JFrame();
        cmodel = new javax.swing.JTextField();
        cvalue = new javax.swing.JTextField();
        cposotita = new javax.swing.JSpinner();
        finaladdcomputer = new javax.swing.JButton();
        cicon = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addPeripheralTab = new javax.swing.JFrame();
        pmodel = new javax.swing.JTextField();
        pvalue = new javax.swing.JTextField();
        pposotita = new javax.swing.JSpinner();
        finaladdperipheral = new javax.swing.JButton();
        picon = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Dialog = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        Chooser = new javax.swing.JFileChooser();
        removeMonitorTab = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        removemonitortable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        monitorLabel = new javax.swing.JLabel();
        finalremovemonitor = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ItemsList = new javax.swing.JList<Item>();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addMonitor = new javax.swing.JButton();
        addLaptop = new javax.swing.JButton();
        addComputer = new javax.swing.JButton();
        removeMonitor = new javax.swing.JButton();
        removeLaptop = new javax.swing.JButton();
        removeComputer = new javax.swing.JButton();
        addPeripherals = new javax.swing.JButton();
        removePeripherals = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ShowIcon = new javax.swing.JLabel();

        addMonitorTab.setTitle("Προσθήκη Οθόνης");

        mposotita.setRequestFocusEnabled(false);
        mposotita.setModel(new javax.swing.SpinnerNumberModel(1,1,null,1));

        finaladdmonitor.setText("Προσθήκη Οθόνης");
        finaladdmonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finaladdmonitorActionPerformed(evt);
            }
        });

        micon.setText("Προσθήκη Εικόνας");
        micon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miconActionPerformed(evt);
            }
        });

        jLabel4.setText("Μοντέλο Οθόνης");

        jLabel5.setText("Αξία Οθόνης");

        jLabel6.setText("Απόθεμα Οθόνης");

        jLabel3.setText("Εικόνα Οθόνης");

        javax.swing.GroupLayout addMonitorTabLayout = new javax.swing.GroupLayout(addMonitorTab.getContentPane());
        addMonitorTab.getContentPane().setLayout(addMonitorTabLayout);
        addMonitorTabLayout.setHorizontalGroup(
            addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMonitorTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mmodel)
                    .addComponent(mvalue)
                    .addComponent(mposotita)
                    .addComponent(micon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(addMonitorTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(finaladdmonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addMonitorTabLayout.setVerticalGroup(
            addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMonitorTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mposotita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(micon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(finaladdmonitor)
                .addGap(21, 21, 21))
        );

        addLaptopTab.setTitle("Προσθήκη Laptop");

        lposotita.setRequestFocusEnabled(false);
        lposotita.setValue(1);
        lposotita.setModel(new javax.swing.SpinnerNumberModel(1,1,null,1));

        finaladdlaptop.setText("Προσθήκη Laptop");
        finaladdlaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finaladdlaptopActionPerformed(evt);
            }
        });

        licon.setText("Προσθήκη Εικόνας");
        licon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liconActionPerformed(evt);
            }
        });

        jLabel7.setText("Μοντέλο Laptop");

        jLabel8.setText("Αξία Laptop");

        jLabel9.setText("Απόθεμα Laptop");

        jLabel10.setText("Εικόνα Laptop");

        javax.swing.GroupLayout addLaptopTabLayout = new javax.swing.GroupLayout(addLaptopTab.getContentPane());
        addLaptopTab.getContentPane().setLayout(addLaptopTabLayout);
        addLaptopTabLayout.setHorizontalGroup(
            addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLaptopTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lmodel)
                    .addComponent(lvalue)
                    .addComponent(lposotita)
                    .addComponent(licon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(addLaptopTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(finaladdlaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addLaptopTabLayout.setVerticalGroup(
            addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLaptopTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lposotita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(licon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(finaladdlaptop)
                .addGap(21, 21, 21))
        );

        addComputerTab.setTitle("Προσθήκη Ηλεκτρονικού Υπολογιστή");

        cposotita.setRequestFocusEnabled(false);
        cposotita.setValue(1);
        cposotita.setModel(new javax.swing.SpinnerNumberModel(1,1,null,1));

        finaladdcomputer.setText("Προσθήκη Η/Υ");
        finaladdcomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finaladdcomputerActionPerformed(evt);
            }
        });

        cicon.setText("Προσθήκη Εικόνας");
        cicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciconActionPerformed(evt);
            }
        });

        jLabel11.setText("Μοντέλο Η/Υ");

        jLabel12.setText("Αξία Η/Υ");

        jLabel13.setText("Απόθεμα Η/Υ");

        jLabel14.setText("Εικόνα Η/Υ");

        javax.swing.GroupLayout addComputerTabLayout = new javax.swing.GroupLayout(addComputerTab.getContentPane());
        addComputerTab.getContentPane().setLayout(addComputerTabLayout);
        addComputerTabLayout.setHorizontalGroup(
            addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addComputerTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmodel)
                    .addComponent(cvalue)
                    .addComponent(cposotita)
                    .addComponent(cicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(addComputerTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(finaladdcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addComputerTabLayout.setVerticalGroup(
            addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addComputerTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cposotita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cicon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(finaladdcomputer)
                .addGap(21, 21, 21))
        );

        addPeripheralTab.setTitle("Προσθήκη Περιφερειακού");

        pposotita.setRequestFocusEnabled(false);
        pposotita.setValue(1);
        pposotita.setModel(new javax.swing.SpinnerNumberModel(1,1,null,1));

        finaladdperipheral.setText("Προσθήκη Περιφερειακού");
        finaladdperipheral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finaladdperipheralActionPerformed(evt);
            }
        });

        picon.setText("Προσθήκη Εικόνας");
        picon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piconActionPerformed(evt);
            }
        });

        jLabel15.setText("Περιφερειακό");

        jLabel16.setText("Αξία Περιφερειακού");

        jLabel17.setText("Απόθεμα Περιφερειακού");

        jLabel18.setText("Εικόνα Περιφερειακού");

        javax.swing.GroupLayout addPeripheralTabLayout = new javax.swing.GroupLayout(addPeripheralTab.getContentPane());
        addPeripheralTab.getContentPane().setLayout(addPeripheralTabLayout);
        addPeripheralTabLayout.setHorizontalGroup(
            addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPeripheralTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pmodel)
                    .addComponent(pvalue)
                    .addComponent(pposotita)
                    .addComponent(picon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(addPeripheralTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(finaladdperipheral, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPeripheralTabLayout.setVerticalGroup(
            addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPeripheralTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pposotita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(picon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(finaladdperipheral)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout DialogLayout = new javax.swing.GroupLayout(Dialog.getContentPane());
        Dialog.getContentPane().setLayout(DialogLayout);
        DialogLayout.setHorizontalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DialogLayout.setVerticalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Chooser.setDialogTitle("Select an Image");

        Chooser.setFileFilter(filter);
        Chooser.setAcceptAllFileFilterUsed(false);

        removeMonitorTab.setTitle("Αφαίρεση Οθόνης");
        removeMonitorTab.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                removeMonitorTabWindowClosing(evt);
            }
        });

        removemonitortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Μοντέλο", "Αξία", "Ποσότητα"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        });
        removemonitortable.setCellSelectionEnabled(false);
        jScrollPane4.setViewportView(removemonitortable);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Επιλεξτέ την οθόνη που θέλετε να αφαιρέσετε");

        monitorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        monitorLabel.setText("Καμία οθόνη ακόμα");

        finalremovemonitor.setText("Αφαίρεση Οθόνης");
        finalremovemonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalremovemonitorActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Επιλέξατε την Οθόνη");

        javax.swing.GroupLayout removeMonitorTabLayout = new javax.swing.GroupLayout(removeMonitorTab.getContentPane());
        removeMonitorTab.getContentPane().setLayout(removeMonitorTabLayout);
        removeMonitorTabLayout.setHorizontalGroup(
            removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(removeMonitorTabLayout.createSequentialGroup()
                .addGroup(removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeMonitorTabLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel19))
                    .addGroup(removeMonitorTabLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(monitorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(finalremovemonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        removeMonitorTabLayout.setVerticalGroup(
            removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeMonitorTabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monitorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(finalremovemonitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Κατάστημα");
        setIconImage(logo.getImage());

        ItemsList.setModel(getListModel());
        ItemsList.setCellRenderer(new ItemRenderer());
        jScrollPane3.setViewportView(ItemsList);
        ItemsList.getAccessibleContext().setAccessibleDescription("");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox3, 0, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Καλάθι", jPanel1);

        jComboBox1.setModel(new DefaultComboBoxModel<String>(client.toArray(new String[0])));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Προϊόν", "Αξία", "Ποσότητα"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Πελάτης");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Παραγγελίες", jPanel2);

        addMonitor.setText("Προσθήκη Οθόνης");
        addMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMonitorActionPerformed(evt);
            }
        });

        addLaptop.setText("Προσθήκη Laptop");
        addLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLaptopActionPerformed(evt);
            }
        });

        addComputer.setText("Προσθήκη H/Y");
        addComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComputerActionPerformed(evt);
            }
        });

        removeMonitor.setText("Αφαίρεση Οθόνης");
        removeMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMonitorActionPerformed(evt);
            }
        });

        removeLaptop.setText("Αφαίρεση Laptop");

        removeComputer.setText("Αφαίρεση Η/Υ");

        addPeripherals.setText("Προσθήκη Περιφερειακών");
        addPeripherals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPeripheralsActionPerformed(evt);
            }
        });

        removePeripherals.setText("Αφαιρεσή Περιφερειακών");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(addPeripherals))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addLaptop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addMonitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removePeripherals, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeLaptop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeMonitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMonitor)
                    .addComponent(removeMonitor))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLaptop)
                    .addComponent(removeLaptop))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addComputer)
                    .addComponent(removeComputer))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPeripherals)
                    .addComponent(removePeripherals))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Διαχείρηση Προιόντων", jPanel3);

        Mtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Προιον", "Αξία", "Ποσότητα"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Mtable);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Οθόνες", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Επιλογή Κατηγορίας");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(ShowIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(ShowIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Απόθεμα", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finaladdmonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finaladdmonitorActionPerformed
        String model = mmodel.getText();
        float value = -1;
        if(model.isEmpty())
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε Μοντέλο","Input Error",JOptionPane.WARNING_MESSAGE);
        if(!mvalue.getText().isEmpty())
            value = CheckTextFieldForNumber(mvalue.getText());
        else
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε κάποιον αριθμό.","Input Error",JOptionPane.WARNING_MESSAGE);
        int posotita = (Integer)mposotita.getValue();
        if(!model.isEmpty() && value != -1){
            monitor.add(new Item(model,value,posotita,ficon));
            Object[] row = {model,value,posotita};
            DefaultTableModel models = (DefaultTableModel) Mtable.getModel();
            models.addRow(row);
            ItemsList.setModel(getListModel());
        }
        mmodel.setText("");
        mvalue.setText("");
        mposotita.setValue(1);
        ficon = new ImageIcon("src/DefaultImage/noimage.png");
    }//GEN-LAST:event_finaladdmonitorActionPerformed

    private void miconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miconActionPerformed
        ImageChooser();
    }//GEN-LAST:event_miconActionPerformed

    private void addMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMonitorActionPerformed
        addMonitorTab.setSize(330,300);
        addMonitorTab.setLocationRelativeTo(null);
        addMonitorTab.setVisible(true);
    }//GEN-LAST:event_addMonitorActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void finaladdlaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finaladdlaptopActionPerformed
        String model = lmodel.getText();
        float value = -1;
        if(model.isEmpty())
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε Μοντέλο","Input Error",JOptionPane.WARNING_MESSAGE);
        if(!lvalue.getText().isEmpty())
            value = CheckTextFieldForNumber(lvalue.getText());
        else
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε κάποιον αριθμό.","Input Error",JOptionPane.WARNING_MESSAGE);
        int posotita = (Integer)lposotita.getValue();
        if(!model.isEmpty() && value != -1){
            laptop.add(new Item(model,value,posotita,ficon));
            /*Object[] row = {model,value,posotita};
            DefaultTableModel models = (DefaultTableModel) Ltable.getModel();
            models.addRow(row);*/
        }
        lmodel.setText("");
        lvalue.setText("");
        lposotita.setValue(1);
        ficon = new ImageIcon("src/DefaultImage/noimage.png");
    
    }//GEN-LAST:event_finaladdlaptopActionPerformed

    private void liconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liconActionPerformed
       ImageChooser();
    }//GEN-LAST:event_liconActionPerformed

    private void addLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLaptopActionPerformed
        addLaptopTab.setSize(330,300);
        addLaptopTab.setLocationRelativeTo(null);
        addLaptopTab.setVisible(true);
    }//GEN-LAST:event_addLaptopActionPerformed

    private void finaladdcomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finaladdcomputerActionPerformed
        String model = cmodel.getText();
        float value = -1;
        if(model.isEmpty())
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε Μοντέλο","Input Error",JOptionPane.WARNING_MESSAGE);
        if(!cvalue.getText().isEmpty())
            value = CheckTextFieldForNumber(cvalue.getText());
        else
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε κάποιον αριθμό.","Input Error",JOptionPane.WARNING_MESSAGE);
        int posotita = (Integer)cposotita.getValue();
        if(!model.isEmpty() && value != -1){
            computer.add(new Item(model,value,posotita,ficon));
            /*Object[] row = {model,value,posotita};
            DefaultTableModel models = (DefaultTableModel) Ltable.getModel();
            models.addRow(row);*/
        }
        cmodel.setText("");
        cvalue.setText("");
        cposotita.setValue(1);
        ficon = new ImageIcon("src/DefaultImage/noimage.png");
    }//GEN-LAST:event_finaladdcomputerActionPerformed

    private void ciconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciconActionPerformed
         ImageChooser();      
    }//GEN-LAST:event_ciconActionPerformed

    private void addComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComputerActionPerformed
        addComputerTab.setSize(330,330);
        addComputerTab.setLocationRelativeTo(null);
        addComputerTab.setVisible(true);
    }//GEN-LAST:event_addComputerActionPerformed

    private void finaladdperipheralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finaladdperipheralActionPerformed
        String model = pmodel.getText();
        float value = -1;
        if(model.isEmpty())
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε Μοντέλο","Input Error",JOptionPane.WARNING_MESSAGE);
        if(!pvalue.getText().isEmpty())
            value = CheckTextFieldForNumber(pvalue.getText());
        else
            JOptionPane.showMessageDialog(Dialog, "Πρέπει να πληκτρολογήσετε κάποιον αριθμό.","Input Error",JOptionPane.WARNING_MESSAGE);
        int posotita = (Integer)pposotita.getValue();
        if(!model.isEmpty() && value != -1){
            peripherals.add(new Item(model,value,posotita,ficon));
            /*Object[] row = {model,value,posotita};
            DefaultTableModel models = (DefaultTableModel) Ltable.getModel();
            models.addRow(row);*/
        }
        pmodel.setText("");
        pvalue.setText("");
        pposotita.setValue(1);
        ficon = new ImageIcon("src/DefaultImage/noimage.png");
    }//GEN-LAST:event_finaladdperipheralActionPerformed

    private void piconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piconActionPerformed
        ImageChooser();
    }//GEN-LAST:event_piconActionPerformed

    private void addPeripheralsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPeripheralsActionPerformed
        addPeripheralTab.setSize(330,330);
        addPeripheralTab.setLocationRelativeTo(null);
        addPeripheralTab.setVisible(true);
    }//GEN-LAST:event_addPeripheralsActionPerformed

    private void removeMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMonitorActionPerformed
        DefaultTableModel modelm = (DefaultTableModel) removemonitortable.getModel();
        String model;
        float price;
        int posotita;
        int i;
        for(i = 0; i < monitor.size(); ++i){
            tempitem = monitor.get(i);
            model = tempitem.getName();
            price = tempitem.getPrice();
            posotita = tempitem.getPosotita();
            Object[] row = {model,price,posotita};
            modelm.addRow(row);
        }
        ListSelectionModel listModel = removemonitortable.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        removeMonitorTab.setSize(700,450);
        removeMonitorTab.setLocationRelativeTo(null);
        removeMonitorTab.setVisible(true);
        listModel.addListSelectionListener((ListSelectionEvent e) -> {
        sel = removemonitortable.getSelectedRows();
         if(sel.length > 0){
                String tempmodel = String.valueOf(modelm.getValueAt(sel[0],0));
                float tempprice = (float) modelm.getValueAt(sel[0],1);
                int tempposotita = (int) modelm.getValueAt(sel[0],2);
                tempitem = new Item(tempmodel,tempprice,tempposotita,ficon);
                monitorLabel.setText(tempmodel);
                System.out.println(tempitem);

            }
        });
    }//GEN-LAST:event_removeMonitorActionPerformed

    private void removeMonitorTabWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_removeMonitorTabWindowClosing
        DefaultTableModel modelm = (DefaultTableModel) removemonitortable.getModel();
        int j;
        for(j = 0; j < monitor.size();j++){
                    modelm.removeRow(0);
        }
        
    }//GEN-LAST:event_removeMonitorTabWindowClosing

    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    private void finalremovemonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalremovemonitorActionPerformed
       if(monitorLabel.getText().equals("Καμία οθόνη ακόμα")){
            JOptionPane.showMessageDialog(Dialog, "Δεν έχετε επιλέξει κάποια οθόνη","Διαγραφή Οθόνης",JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(Dialog, "Είστε σίγουρος πως θέλετε να πραγματοποιήσετε διαγραφή της οθόνης;","Διαγραφή Οθόνης",JOptionPane.YES_NO_OPTION);
            int res = JOptionPane.YES_OPTION;
            if(res == 0)
                monitor.remove(sel[0]);
                sel[0]=0;
                monitorLabel.setText("Καμία οθόνη ακόμα");
        }
        
    }//GEN-LAST:event_finalremovemonitorActionPerformed

    private void ImageChooser(){
        int res = Chooser.showSaveDialog(micon);
        if(res == JFileChooser.APPROVE_OPTION){
            File selFile = Chooser.getSelectedFile();
            ficon = new ImageIcon(selFile.getAbsolutePath());
        }
        else {
            JOptionPane.showMessageDialog(Dialog, " No File Choosen","Input Error",JOptionPane.PLAIN_MESSAGE);
        }   
    }
    
    private float CheckTextFieldForNumber(String text){
        float value = -1;
            try {
                value = Float.parseFloat(text);
                return value;
            }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(Dialog,"Το '" + text + "' δεν είναι αριθμός.","Input Error",JOptionPane.WARNING_MESSAGE);        
            }
        return value;
    }
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
            java.util.logging.Logger.getLogger(Katastima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Katastima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Katastima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Katastima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
               
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Katastima().setVisible(true);               
            }
        });
    }
    //Resize για το τεστλεμπελ που εβαλα για να δουμε αν φαινονται οι εικονες!
    /*public ImageIcon resize(ImageIcon icon){
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(testLabel.getWidth(), testLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newimage = new ImageIcon(newImg);
        return newimage;
    }*/
    
    private DefaultListModel getListModel() {
        
        DefaultListModel listModel = new DefaultListModel<>();
        int i;
        for(i = 0; i < monitor.size(); i++){
          listModel.addElement(monitor.get(i));
        } 
        
        return listModel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Chooser;
    private javax.swing.JDialog Dialog;
    private javax.swing.JList<Item> ItemsList;
    private javax.swing.JTable Mtable;
    private javax.swing.JLabel ShowIcon;
    private javax.swing.JButton addComputer;
    private javax.swing.JFrame addComputerTab;
    private javax.swing.JButton addLaptop;
    private javax.swing.JFrame addLaptopTab;
    private javax.swing.JButton addMonitor;
    private javax.swing.JFrame addMonitorTab;
    private javax.swing.JFrame addPeripheralTab;
    private javax.swing.JButton addPeripherals;
    private javax.swing.JButton cicon;
    private javax.swing.JTextField cmodel;
    private javax.swing.JSpinner cposotita;
    private javax.swing.JTextField cvalue;
    private javax.swing.JButton finaladdcomputer;
    private javax.swing.JButton finaladdlaptop;
    private javax.swing.JButton finaladdmonitor;
    private javax.swing.JButton finaladdperipheral;
    private javax.swing.JButton finalremovemonitor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton licon;
    private javax.swing.JTextField lmodel;
    private javax.swing.JSpinner lposotita;
    private javax.swing.JTextField lvalue;
    private javax.swing.JButton micon;
    private javax.swing.JTextField mmodel;
    private javax.swing.JLabel monitorLabel;
    private javax.swing.JSpinner mposotita;
    private javax.swing.JTextField mvalue;
    private javax.swing.JButton picon;
    private javax.swing.JTextField pmodel;
    private javax.swing.JSpinner pposotita;
    private javax.swing.JTextField pvalue;
    private javax.swing.JButton removeComputer;
    private javax.swing.JButton removeLaptop;
    private javax.swing.JButton removeMonitor;
    private javax.swing.JFrame removeMonitorTab;
    private javax.swing.JButton removePeripherals;
    private javax.swing.JTable removemonitortable;
    // End of variables declaration//GEN-END:variables
}
