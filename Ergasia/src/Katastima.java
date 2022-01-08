
import Models.Client;
import Models.ClientListModel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Models.Item;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import View.ItemRenderer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.util.Scanner;
import javax.swing.table.AbstractTableModel;
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

    //ArrayLists
    ArrayList<Item> monitor = new ArrayList<>();
    ArrayList<Item> laptop = new ArrayList<>();
    ArrayList<Item> computer = new ArrayList<>();
    ArrayList<Item> peripherals = new ArrayList<>();
    ArrayList<Client> clientList = new ArrayList<>();
    
        
    FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG and JPEG images", "png", "jpg", "jpeg");
    
//File List
      
    String path = null;
    
    ImageIcon ficon = new ImageIcon("src/DefaultImage/noimage.png");
    ImageIcon noimage = new ImageIcon("src/DefaultImage/noimage.png");
    ImageIcon logo = new ImageIcon("src/DefaultImage/Shop.png");
    
    
    BufferedImage image = null;

    Item tempitem;
    
    int[] sel;
    int[] sel2;

    public Katastima() {
        this.loadItemList();
        clientList = this.loadClientList();
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
        monitoricon = new javax.swing.JLabel();
        removeLaptopTab = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        removelaptoptable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        laptopLabel = new javax.swing.JLabel();
        finalremovelaptop = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        laptopicon = new javax.swing.JLabel();
        removeComputerTab = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        removecomputertable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        computerLabel = new javax.swing.JLabel();
        finalremovecomputer = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        computericon = new javax.swing.JLabel();
        removePeripheralTab = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        removeperipheraltable = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        peripheralLabel = new javax.swing.JLabel();
        finalremoveperipheral = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        peripheralicon = new javax.swing.JLabel();
        chooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Cart = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ItemsList = new javax.swing.JList<Item>();
        ClientNameInput = new javax.swing.JTextField();
        ItemCategoryComboBox = new javax.swing.JComboBox<>();
        button1 = new java.awt.Button();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Orders = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientItemList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ClientJList = new javax.swing.JList<>();
        CompleteOrderButton = new javax.swing.JButton();
        Product_Management = new javax.swing.JPanel();
        addMonitor = new javax.swing.JButton();
        addLaptop = new javax.swing.JButton();
        addComputer = new javax.swing.JButton();
        removeMonitor = new javax.swing.JButton();
        removeLaptop = new javax.swing.JButton();
        removeComputer = new javax.swing.JButton();
        addPeripherals = new javax.swing.JButton();
        removePeripherals = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Stock = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productstable = new javax.swing.JTable();
        catsel = new javax.swing.JComboBox<>();
        stockspinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        ShowIcon = new javax.swing.JLabel();
        changestockbutton = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        Import = new javax.swing.JMenuItem();

        addMonitorTab.setTitle("Προσθήκη Οθόνης");
        addMonitorTab.setResizable(false);

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
        addLaptopTab.setResizable(false);

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

        addComputerTab.setTitle("Προσθήκη Η/Υ");
        addComputerTab.setResizable(false);

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
        addPeripheralTab.setResizable(false);

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
        removeMonitorTab.setResizable(false);
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

        monitorLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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
                .addGap(144, 144, 144)
                .addComponent(jLabel19)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(removeMonitorTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monitorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(removeMonitorTabLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(finalremovemonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(monitoricon, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        removeMonitorTabLayout.setVerticalGroup(
            removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeMonitorTabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(removeMonitorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeMonitorTabLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monitorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalremovemonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(removeMonitorTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monitoricon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        removeLaptopTab.setTitle("Αφαίρεση Laptop");
        removeLaptopTab.setResizable(false);
        removeLaptopTab.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                removeLaptopTabWindowClosing(evt);
            }
        });

        removelaptoptable.setModel(new javax.swing.table.DefaultTableModel(
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
        removelaptoptable.setCellSelectionEnabled(false);
        jScrollPane5.setViewportView(removelaptoptable);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Επιλεξτέ το Laptop που θέλετε να αφαιρέσετε");

        laptopLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        laptopLabel.setText("Κανένα Laptop ακόμα");

        finalremovelaptop.setText("Αφαίρεση Laptop");
        finalremovelaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalremovelaptopActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Επιλέξατε το Laptop");

        javax.swing.GroupLayout removeLaptopTabLayout = new javax.swing.GroupLayout(removeLaptopTab.getContentPane());
        removeLaptopTab.getContentPane().setLayout(removeLaptopTabLayout);
        removeLaptopTabLayout.setHorizontalGroup(
            removeLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(removeLaptopTabLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel21)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(removeLaptopTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(removeLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laptopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(removeLaptopTabLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(finalremovelaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(laptopicon, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        removeLaptopTabLayout.setVerticalGroup(
            removeLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeLaptopTabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(removeLaptopTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeLaptopTabLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laptopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalremovelaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(removeLaptopTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laptopicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        removeComputerTab.setTitle("Αφαίρεση Η/Υ");
        removeComputerTab.setResizable(false);
        removeComputerTab.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                removeComputerTabWindowClosing(evt);
            }
        });

        removecomputertable.setModel(new javax.swing.table.DefaultTableModel(
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
        removecomputertable.setCellSelectionEnabled(false);
        jScrollPane6.setViewportView(removecomputertable);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Επιλεξτέ τον Η/Υ που θέλετε να αφαιρέσετε");

        computerLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        computerLabel.setText("Κανένας Η/Υ ακόμα");

        finalremovecomputer.setText("Αφαίρεση Η/Υ");
        finalremovecomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalremovecomputerActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("Επιλέξατε τον Η/Υ");

        javax.swing.GroupLayout removeComputerTabLayout = new javax.swing.GroupLayout(removeComputerTab.getContentPane());
        removeComputerTab.getContentPane().setLayout(removeComputerTabLayout);
        removeComputerTabLayout.setHorizontalGroup(
            removeComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(removeComputerTabLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel23)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(removeComputerTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(removeComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(removeComputerTabLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(finalremovecomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(computericon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        removeComputerTabLayout.setVerticalGroup(
            removeComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeComputerTabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(removeComputerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeComputerTabLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(computerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalremovecomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeComputerTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(computericon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        removePeripheralTab.setTitle("Αφαίρεση Περιφερειακού");
        removePeripheralTab.setResizable(false);
        removePeripheralTab.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                removePeripheralTabWindowClosing(evt);
            }
        });

        removeperipheraltable.setModel(new javax.swing.table.DefaultTableModel(
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
        removeperipheraltable.setCellSelectionEnabled(false);
        jScrollPane7.setViewportView(removeperipheraltable);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Επιλεξτέ το περιφερειακό που θέλετε να αφαιρέσετε");

        peripheralLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        peripheralLabel.setText("Κανένα περιφερειακό ακόμα");

        finalremoveperipheral.setText("Αφαίρεση Περιφερειακού");
        finalremoveperipheral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalremoveperipheralActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Επιλέξατε το περιφερειακό");

        javax.swing.GroupLayout removePeripheralTabLayout = new javax.swing.GroupLayout(removePeripheralTab.getContentPane());
        removePeripheralTab.getContentPane().setLayout(removePeripheralTabLayout);
        removePeripheralTabLayout.setHorizontalGroup(
            removePeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(removePeripheralTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(removePeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peripheralLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(removePeripheralTabLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(finalremoveperipheral, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(peripheralicon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(removePeripheralTabLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        removePeripheralTabLayout.setVerticalGroup(
            removePeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePeripheralTabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(removePeripheralTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removePeripheralTabLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(peripheralLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finalremoveperipheral, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePeripheralTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(peripheralicon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Κατάστημα");
        setIconImage(logo.getImage());
        setResizable(false);

        ItemsList.setCellRenderer(new ItemRenderer());
        jScrollPane3.setViewportView(ItemsList);
        ItemsList.setModel(getItemListModel());
        ItemsList.getAccessibleContext().setAccessibleDescription("");

        ClientNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientNameInputActionPerformed(evt);
            }
        });

        ItemCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Οθόνη", "Λάπτοπ ", "Η/Υ", "Περιφερειακά" }));
        ItemCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCategoryComboBoxActionPerformed(evt);
            }
        });

        button1.setLabel("Προσθήκη");
        button1.setName(""); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemClicked(evt);
            }
        });

        jLabel30.setText("Όνομα Πελάτη");

        jLabel31.setText("Κατηγορία");

        javax.swing.GroupLayout CartLayout = new javax.swing.GroupLayout(Cart);
        Cart.setLayout(CartLayout);
        CartLayout.setHorizontalGroup(
            CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ItemCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        CartLayout.setVerticalGroup(
            CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(ItemCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Καλάθι", Cart);

        ClientItemList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClientItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Προϊόν", "Αξία", "Ποσότητα"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ClientItemList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Πελάτης");

        ClientJList.setModel(loadClientModel());
        ClientJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientJListMouseClicked(evt);
            }
        });
        ClientJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                none(evt);
            }
        });
        jScrollPane8.setViewportView(ClientJList);

        CompleteOrderButton.setText("Ολοκλήρωση Παραγγελίας");
        CompleteOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompleteOrderButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout OrdersLayout = new javax.swing.GroupLayout(Orders);
        Orders.setLayout(OrdersLayout);
        OrdersLayout.setHorizontalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OrdersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CompleteOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrdersLayout.createSequentialGroup()
                        .addGroup(OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        OrdersLayout.setVerticalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OrdersLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(CompleteOrderButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Παραγγελίες", Orders);

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
        removeLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLaptopActionPerformed(evt);
            }
        });

        removeComputer.setText("Αφαίρεση Η/Υ");
        removeComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeComputerActionPerformed(evt);
            }
        });

        addPeripherals.setText("Προσθήκη Περιφερειακών");
        addPeripherals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPeripheralsActionPerformed(evt);
            }
        });

        removePeripherals.setText("Αφαιρεσή Περιφερειακών");
        removePeripherals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePeripheralsActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Προσθήκη Προιόντων");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Αφαίρεση Προιόντων");

        javax.swing.GroupLayout Product_ManagementLayout = new javax.swing.GroupLayout(Product_Management);
        Product_Management.setLayout(Product_ManagementLayout);
        Product_ManagementLayout.setHorizontalGroup(
            Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_ManagementLayout.createSequentialGroup()
                .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Product_ManagementLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel27))
                    .addGroup(Product_ManagementLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPeripherals)
                            .addComponent(addComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addLaptop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addMonitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_ManagementLayout.createSequentialGroup()
                        .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(removeComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeLaptop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(removePeripherals, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_ManagementLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(49, 49, 49))))
        );
        Product_ManagementLayout.setVerticalGroup(
            Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_ManagementLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Product_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Product_ManagementLayout.createSequentialGroup()
                        .addComponent(removeMonitor)
                        .addGap(30, 30, 30)
                        .addComponent(removeLaptop)
                        .addGap(30, 30, 30)
                        .addComponent(removeComputer)
                        .addGap(30, 30, 30)
                        .addComponent(removePeripherals))
                    .addGroup(Product_ManagementLayout.createSequentialGroup()
                        .addComponent(addMonitor)
                        .addGap(30, 30, 30)
                        .addComponent(addLaptop)
                        .addGap(30, 30, 30)
                        .addComponent(addComputer)
                        .addGap(30, 30, 30)
                        .addComponent(addPeripherals)))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Διαχείρηση Προιόντων", Product_Management);

        Stock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StockFocusGained(evt);
            }
        });

        productstable.setModel(new javax.swing.table.DefaultTableModel(
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
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        });
        productstable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productstableFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(productstable);

        catsel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Οθόνες", "Laptop", "Η/Υ", "Περιφερειακά" }));
        catsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catselActionPerformed(evt);
            }
        });

        stockspinner.setRequestFocusEnabled(false);
        stockspinner.setValue(1);
        cposotita.setModel(new javax.swing.SpinnerNumberModel(1,1,null,1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Επιλογή Κατηγορίας");

        changestockbutton.setText("Αλλαγή Αποθέματος");
        changestockbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changestockbuttonActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Αλλαγή Αποθέματος");

        javax.swing.GroupLayout StockLayout = new javax.swing.GroupLayout(Stock);
        Stock.setLayout(StockLayout);
        StockLayout.setHorizontalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StockLayout.createSequentialGroup()
                        .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(55, 55, 55)
                        .addComponent(ShowIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(StockLayout.createSequentialGroup()
                        .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catsel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(changestockbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        StockLayout.setVerticalGroup(
            StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StockLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(StockLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(catsel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StockLayout.createSequentialGroup()
                                .addComponent(ShowIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(57, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(stockspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(changestockbutton)
                                .addGap(24, 24, 24))))))
        );

        jTabbedPane1.addTab("Απόθεμα", Stock);

        jMenu1.setText("Αρχείο");

        Save.setText("Αποθήκευση δεδομένων");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        Import.setText("Εισαγωγή δεδομένων");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });
        jMenu1.add(Import);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
    
    private void loadItemList() {
        monitor.add(new Item("LG", 1500, 2, new ImageIcon("src\\DefaultImage\\lg_monitor.png")));
        monitor.add(new Item("Samsung", 1200, 2, new ImageIcon("src\\DefaultImage\\samsung_monitor.png")));
        monitor.add(new Item("Sony", 1000, 2, new ImageIcon("src\\DefaultImage\\sony_monitor.png")));
        
        laptop.add(new Item("HP", 600, 1, new ImageIcon("src\\DefaultImage\\hp_laptop.png")));
        laptop.add(new Item("Xiaomi", 800, 1, new ImageIcon("src\\DefaultImage\\xiaomi_laptop.png")));
        laptop.add(new Item("Lenovo", 850, 3, new ImageIcon("src\\DefaultImage\\lenovo_laptop.png")));
        
        computer.add(new Item("Alienware", 1800, 1, new ImageIcon("src\\DefaultImage\\alienware_pc.png")));
        computer.add(new Item("HP", 1000, 1, new ImageIcon("src\\DefaultImage\\hp_pc.png")));
        computer.add(new Item("Lenovo", 1100, 1, new ImageIcon("src\\DefaultImage\\lenovo_pc.png")));
        
        peripherals.add(new Item("Razer Mouse", 130, 1, new ImageIcon("src\\DefaultImage\\razer_mouse.png")));
        peripherals.add(new Item("Sony Speakers", 220, 1, new ImageIcon("src\\DefaultImage\\sony_speakers.png")));
        peripherals.add(new Item("HP Printer", 300, 1, new ImageIcon("src\\DefaultImage\\hp_printer.png"))); 
    }
    
    private void saveClientList(ArrayList<Client> list) {
        Gson gson = new Gson();
        
        GsonBuilder gsonBuilder = new GsonBuilder();

        JsonSerializer<Item> serializer = new JsonSerializer<Item>() {  
            @Override
            public JsonElement serialize(Item t, java.lang.reflect.Type type, JsonSerializationContext jsc) {
                JsonObject jsonMerchant = new JsonObject();

                jsonMerchant.addProperty("model", t.getName());
                jsonMerchant.addProperty("price", t.getPrice());
                jsonMerchant.addProperty("quantity", t.getPosotita());

                return jsonMerchant;
            }
        };
        gsonBuilder.registerTypeAdapter(Item.class, serializer);

        Gson customGson = gsonBuilder.create();  
        
        try (FileWriter writer = new FileWriter(".\\clients.json")) {
            customGson.toJson(list, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private DefaultListModel loadClientModel() {
        DefaultListModel model = new DefaultListModel();
        model.addAll(clientList);
        return model;
    }
    
    private ArrayList<Client> loadClientList() {
        Gson gson = new Gson();

        String data = "";
        try {
            Scanner scan = new Scanner(new File(".\\clients.json"));
            while (scan.hasNextLine()) {
                data += scan.nextLine();
            }
        } catch( Exception e) {       
        }
        
        JsonArray clientsJson = new JsonParser().parse(data).getAsJsonArray();
        ArrayList<Client> clients = new ArrayList<Client>();
        
        for(int i=0; i<clientsJson.size(); i++) {
            ArrayList<Item> items = new ArrayList<Item>();
            JsonObject clientJson = clientsJson.get(i).getAsJsonObject();
            JsonArray itemsJson = clientJson.get("items").getAsJsonArray();
            for(int j=0; j<itemsJson.size(); j++) {
                JsonObject itemJson = itemsJson.get(j).getAsJsonObject();
                items.add(new Item(itemJson.get("model").getAsString(),
                        itemJson.get("price").getAsFloat(),
                        itemJson.get("quantity").getAsInt(),
                        noimage));
            }
            
            clients.add(new Client(clientJson.get("name").getAsString(), items));
        }
        
        return clients;
    }
    
    private void updateClientItemList() {
        if(ClientJList.getSelectedIndex() < 0) return;
        Client client = clientList.get(ClientJList.getSelectedIndex());
        ArrayList<Item> items = client.getItems();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Προϊόν", "Αξία", "Ποσότητα"}, 0);
        for(int i=0; i<items.size(); i++) {
            model.addRow(new Object[]{items.get(i).getName(), items.get(i).getPrice(), items.get(i).getPosotita()});
        }
        
        ClientItemList.setModel(model);
    }
    
    private void addNewClient(Client c) {
        clientList.add(c);
        ClientJList.setModel(new ClientListModel(clientList));
    }
    
    private void addItemToClient(Item item, String clientName) {
        if(item == null || clientName == "") return;
        int clientID = clientExists(clientName, clientList);
        if(clientID == -1) {
            Client c = new Client(clientName);
            c.addItem(item);
            addNewClient(c);
        } else {
            clientList.get(clientID).addItem(item);
        }
        
        saveClientList(clientList);
    }
       
    private int clientExists(String clientName, ArrayList<Client> clients) {
        int size = clients.size();
        for(int i=0; i < size; i++) {
            if(clients.get(i).getName().equals(clientName))
                return i;    
        }
        return -1;
    }
    
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
            ItemsList.setModel(getItemListModel());
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
    private void ClientNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientNameInputActionPerformed
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
        int i;
        for(i = 0; i < monitor.size(); ++i)
            addRow(tempitem,monitor,i,modelm); 
        ListSelectionModel listModel = removemonitortable.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        removeMonitorTab.setSize(700,450);
        removeMonitorTab.setLocationRelativeTo(null);
        removeMonitorTab.setVisible(true);
        listModel.addListSelectionListener((ListSelectionEvent e) -> {
        sel = removemonitortable.getSelectedRows();
         if(sel.length > 0){
                tempitem = monitor.get(sel[0]);
                monitorLabel.setText(tempitem.getName());
                monitoricon.setIcon(resize(tempitem.getImage()));
            }
        });
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
    }//GEN-LAST:event_removeMonitorActionPerformed
    private void removeMonitorTabWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_removeMonitorTabWindowClosing
        DefaultTableModel modelm = (DefaultTableModel) removemonitortable.getModel();
        if(modelm.getRowCount() > 0){
            for(int j = modelm.getRowCount()-1; j >-1;--j)
                modelm.removeRow(j);        
        }
        monitorLabel.setText("Καμία οθόνη ακόμα");
        monitoricon.setIcon(resize(noimage));        
    }//GEN-LAST:event_removeMonitorTabWindowClosing
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    private void finalremovemonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalremovemonitorActionPerformed
       if(monitorLabel.getText().equals("Καμία οθόνη ακόμα")){
            JOptionPane.showMessageDialog(Dialog, "Δεν έχετε επιλέξει κάποια οθόνη","Διαγραφή Οθόνης",JOptionPane.WARNING_MESSAGE);
        }else{
            int res = JOptionPane.showConfirmDialog(Dialog, "Είστε σίγουρος πως θέλετε να πραγματοποιήσετε διαγραφή της οθόνης;","Διαγραφή Οθόνης",JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION){
                removeMonitorItem();
        }}
    }//GEN-LAST:event_finalremovemonitorActionPerformed
    private void finalremovelaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalremovelaptopActionPerformed
        if(laptopLabel.getText().equals("Κανένα Laptop ακόμα")){
            JOptionPane.showMessageDialog(Dialog, "Δεν έχετε επιλέξει κάποιo Laptop","Διαγραφή Laptop",JOptionPane.WARNING_MESSAGE);
        }else{
            int res = JOptionPane.showConfirmDialog(Dialog, "Είστε σίγουρος πως θέλετε να πραγματοποιήσετε διαγραφή του Laptop;","Διαγραφή Laptop",JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION)
                removeLaptopItem();
        }
    }//GEN-LAST:event_finalremovelaptopActionPerformed
    private void removeLaptopTabWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_removeLaptopTabWindowClosing
        DefaultTableModel modelm = (DefaultTableModel) removelaptoptable.getModel();
        if(modelm.getRowCount() > 0){
            for(int j = modelm.getRowCount()-1; j >-1;--j)
                modelm.removeRow(j);        
        }
        laptopLabel.setText("Κανένα Laptop ακόμα");
        laptopicon.setIcon(resize(noimage));
    }//GEN-LAST:event_removeLaptopTabWindowClosing
    private void removeLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLaptopActionPerformed
        DefaultTableModel modelm = (DefaultTableModel) removelaptoptable.getModel();
        int i;
        for(i = 0; i < laptop.size(); ++i)
            addRow(tempitem,laptop,i,modelm);
        ListSelectionModel listModel = removelaptoptable.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        removeLaptopTab.setSize(700,450);
        removeLaptopTab.setLocationRelativeTo(null);
        removeLaptopTab.setVisible(true);
        listModel.addListSelectionListener((ListSelectionEvent e) -> {
        sel = removelaptoptable.getSelectedRows();
         if(sel.length > 0){
                tempitem = laptop.get(sel[0]);
                laptopLabel.setText(tempitem.getName());
                laptopicon.setIcon(resize(tempitem.getImage()));
            }
        });
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
    }//GEN-LAST:event_removeLaptopActionPerformed
    private void finalremovecomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalremovecomputerActionPerformed
        if(computerLabel.getText().equals("Κανένας Η/Υ ακόμα")){
            JOptionPane.showMessageDialog(Dialog, "Δεν έχετε επιλέξει κάποιoν Η/Υ","Διαγραφή H/Y",JOptionPane.WARNING_MESSAGE);
        }else{
            int res = JOptionPane.showConfirmDialog(Dialog, "Είστε σίγουρος πως θέλετε να πραγματοποιήσετε διαγραφή του Η/Υ;","Διαγραφή Η/Υ",JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION)
                removeComputerItem();
        }
    }//GEN-LAST:event_finalremovecomputerActionPerformed
    private void removeComputerTabWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_removeComputerTabWindowClosing
        DefaultTableModel modelm = (DefaultTableModel) removecomputertable.getModel();
        if(modelm.getRowCount() > 0){
            for(int j = modelm.getRowCount()-1; j >-1;--j)
                modelm.removeRow(j);        
        }
        computerLabel.setText("Κανένας Η/Υ ακόμα");
        computericon.setIcon(resize(noimage));    
    }//GEN-LAST:event_removeComputerTabWindowClosing
    private void removeComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeComputerActionPerformed
        DefaultTableModel modelm = (DefaultTableModel) removecomputertable.getModel();
        int i;
        for(i = 0; i < computer.size(); ++i)
            addRow(tempitem,computer,i,modelm);
        ListSelectionModel listModel = removecomputertable.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        removeComputerTab.setSize(700,450);
        removeComputerTab.setLocationRelativeTo(null);
        removeComputerTab.setVisible(true);
        listModel.addListSelectionListener((ListSelectionEvent e) -> {
        sel = removecomputertable.getSelectedRows();
         if(sel.length > 0){
                tempitem = computer.get(sel[0]);
                computerLabel.setText(tempitem.getName());
                computericon.setIcon(resize(tempitem.getImage()));
            }
        }); 
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
    }//GEN-LAST:event_removeComputerActionPerformed
    private void finalremoveperipheralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalremoveperipheralActionPerformed
        if(peripheralLabel.getText().equals("Κανένα περιφερειακό ακόμα")){
            JOptionPane.showMessageDialog(Dialog, "Δεν έχετε επιλέξει κάποιo περιφερειακό","Διαγραφή περιφερειακού",JOptionPane.WARNING_MESSAGE);
        }else{
            int res = JOptionPane.showConfirmDialog(Dialog, "Είστε σίγουρος πως θέλετε να πραγματοποιήσετε διαγραφή του περιφερειακού;","Διαγραφή περιφερειακού",JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION)
                removePeripheralItem();
        }
    }//GEN-LAST:event_finalremoveperipheralActionPerformed
    private void removePeripheralTabWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_removePeripheralTabWindowClosing
        DefaultTableModel modelm = (DefaultTableModel) removeperipheraltable.getModel();
        int j;
        if(modelm.getRowCount() > 0){
            for(j = modelm.getRowCount()-1; j >-1;--j)
                modelm.removeRow(j);        
        }
            peripheralLabel.setText("Κανένα περιφερειακό ακόμα");
            peripheralicon.setIcon(resize(noimage));   
    }//GEN-LAST:event_removePeripheralTabWindowClosing
    private void removePeripheralsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePeripheralsActionPerformed
        DefaultTableModel modelm = (DefaultTableModel) removeperipheraltable.getModel();
        int i;
        for(i = 0; i < peripherals.size(); ++i){
            addRow(tempitem,peripherals,i,modelm);
        }
        ListSelectionModel listModel = removeperipheraltable.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        removePeripheralTab.setSize(700,450);
        removePeripheralTab.setLocationRelativeTo(null);
        removePeripheralTab.setVisible(true);
        listModel.addListSelectionListener((ListSelectionEvent e) -> {
        sel = removeperipheraltable.getSelectedRows();
         if(sel.length > 0){
                tempitem = peripherals.get(sel[0]);
                peripheralLabel.setText(tempitem.getName());
                peripheralicon.setIcon(resize(tempitem.getImage()));
            }
        }); 
    }//GEN-LAST:event_removePeripheralsActionPerformed
    private void catselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catselActionPerformed
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        String selection = catsel.getItemAt(catsel.getSelectedIndex());
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
        if(selection.equals("Οθόνες")){
            for(int i = 0; i < monitor.size(); ++i)
                addRow(tempitem,monitor,i,modelss);
        }else if(selection.equals("Laptop")){
            for(int i = 0; i < laptop.size(); ++i)
                addRow(tempitem,laptop,i,modelss);
        }else if(selection.equals("Η/Υ")){
            for(int i = 0; i < computer.size(); ++i)
                addRow(tempitem,computer,i,modelss);
        }else{
            for(int i = 0; i < peripherals.size(); ++i)
                addRow(tempitem,peripherals,i,modelss);
            }
    }//GEN-LAST:event_catselActionPerformed
    private void productstableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productstableFocusGained
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        String selection = catsel.getItemAt(catsel.getSelectedIndex());
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
        if(selection.equals("Οθόνες")){
            for(int i = 0; i < monitor.size(); ++i)
                addRow(tempitem,monitor,i,modelss);
        }else if(selection.equals("Laptop")){
            for(int i = 0; i < laptop.size(); ++i)
                addRow(tempitem,laptop,i,modelss);
        }else if(selection.equals("Η/Υ")){
            for(int i = 0; i < computer.size(); ++i)
                addRow(tempitem,computer,i,modelss);
        }else{
            for(int i = 0; i < peripherals.size(); ++i)
                addRow(tempitem,peripherals,i,modelss);
            }
        ListSelectionModel listModel = productstable.getSelectionModel();
        listModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listModel.addListSelectionListener((ListSelectionEvent e) -> {
        sel2 = productstable.getSelectedRows();});
    }//GEN-LAST:event_productstableFocusGained
    private void StockFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StockFocusGained
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        String selection = catsel.getItemAt(catsel.getSelectedIndex());
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
        if(selection.equals("Οθόνες")){
            for(int i = 0; i < monitor.size(); ++i)
                addRow(tempitem,monitor,i,modelss);
        }else if(selection.equals("Laptop")){
            for(int i = 0; i < laptop.size(); ++i)
                addRow(tempitem,laptop,i,modelss);
        }else if(selection.equals("Η/Υ")){
            for(int i = 0; i < computer.size(); ++i)
                addRow(tempitem,computer,i,modelss);
        }else{
            for(int i = 0; i < peripherals.size(); ++i)
                addRow(tempitem,peripherals,i,modelss);
            }
    }//GEN-LAST:event_StockFocusGained
    private void addRow(Item tempitem,ArrayList<Item> list,int i,DefaultTableModel modelss){
        tempitem = list.get(i);
        String model = tempitem.getName();
        float price = tempitem.getPrice();
        int posotita = tempitem.getPosotita();
        Object[] row = {model,price,posotita};
        modelss.addRow(row);
    }
    private void changestockbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changestockbuttonActionPerformed
        String selection = catsel.getItemAt(catsel.getSelectedIndex());
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        int stocknumber = (int) stockspinner.getValue();
         if(sel2.length > 0){
            if(selection.equals("Οθόνες"))
                monitor.get(sel2[0]).setPosotita(stocknumber);
            else if(selection.equals("Laptop"))
                laptop.get(sel2[0]).setPosotita(stocknumber);
            else if(selection.equals("Η/Υ"))
                computer.get(sel2[0]).setPosotita(stocknumber);
            else{
                peripherals.get(sel2[0]).setPosotita(stocknumber);
            }
         }
        if(modelss.getRowCount() > 0){
            for(int j = modelss.getRowCount()-1; j >-1;--j)
                modelss.removeRow(j);        
        }
        if(selection.equals("Οθόνες")){
            for(int i = 0; i < monitor.size(); ++i)
                addRow(tempitem,monitor,i,modelss);
        }else if(selection.equals("Laptop")){
            for(int i = 0; i < laptop.size(); ++i)
                addRow(tempitem,laptop,i,modelss);
        }else if(selection.equals("Η/Υ")){
            for(int i = 0; i < computer.size(); ++i)
                addRow(tempitem,computer,i,modelss);
        }else{
            for(int i = 0; i < peripherals.size(); ++i)
                addRow(tempitem,peripherals,i,modelss);
            }
        stockspinner.setValue(1);       
    }//GEN-LAST:event_changestockbuttonActionPerformed
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        chooser.setDialogTitle("Επιλέξτε φάκελο για την Αποθήκευση των δεδομένων");
        int option = chooser.showSaveDialog(micon);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            File monitorfile = new File(path,"Monitors.txt");
            File laptopfile= new File(path,"Laptops.txt");
            File computerfile = new File(path,"Computers.txt");
            File peripheralsfile = new File(path,"Peripherals.txt");
        try{
            FileWriter fwm = new FileWriter(monitorfile);
            FileWriter fwl = new FileWriter(laptopfile);      
            FileWriter fwc = new FileWriter(computerfile); 
            FileWriter fwp = new FileWriter(peripheralsfile);     
            
            Writer output = new BufferedWriter(fwm);
            int i;
            if(!monitor.isEmpty()){
                for (i = 0; i < monitor.size(); i++) 
                    output.write(monitor.get(i).Save()+ "\n");
            }
            output.close();
            output = new BufferedWriter(fwl);
            if(!laptop.isEmpty()){
                for (i = 0; i < laptop.size(); i++) 
                    output.write(laptop.get(i).Save()+ "\n");
            }
            output.close();
            output = new BufferedWriter(fwc);
            if(!computer.isEmpty()){
                for (i = 0; i < computer.size(); i++) 
                    output.write(computer.get(i).Save() + "\n");
            }
            output.close();
            output = new BufferedWriter(fwp);
            if(!peripherals.isEmpty()){
                for (i = 0; i < peripherals.size(); i++) 
                    output.write(peripherals.get(i).Save() + "\n");
            }
            output.close(); 
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null,"File cannot be created");
        }
    }
    }//GEN-LAST:event_SaveActionPerformed
    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
            loadItems();
    }//GEN-LAST:event_ImportActionPerformed

    private void AddItemClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemClicked
        System.out.println("Client " + ClientNameInput.getText() + " added " + ItemsList.getSelectedValue().getName());
        addItemToClient(ItemsList.getSelectedValue(), ClientNameInput.getText());
    }//GEN-LAST:event_AddItemClicked

    private void none(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_none
       
    }//GEN-LAST:event_none

    private void ClientJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientJListMouseClicked
        this.updateClientItemList();        // TODO add your handling code here:
    }//GEN-LAST:event_ClientJListMouseClicked

    private void ItemCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCategoryComboBoxActionPerformed
        ItemsList.setModel(getItemListModel());
    }//GEN-LAST:event_ItemCategoryComboBoxActionPerformed

    private void CompleteOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompleteOrderButtonMouseClicked
        int clientIndex = ClientJList.getSelectedIndex();
        int itemIndex = ClientItemList.getSelectedRow();
        if(clientIndex == -1 || itemIndex == -1) return;
        
        clientList.get(clientIndex).removeItem(itemIndex);
        
        ((AbstractTableModel) this.ClientItemList.getModel()).fireTableDataChanged();
        this.saveClientList(clientList);
    }//GEN-LAST:event_CompleteOrderButtonMouseClicked
    private void removePeripheralItem(){
        DefaultTableModel modelm = (DefaultTableModel) removeperipheraltable.getModel();
                peripherals.remove(sel[0]);
                modelm.removeRow(sel[0]);
                peripheralLabel.setText("Κανένα περιφερειακό ακόμα");
                peripheralicon.setIcon(resize(noimage));    
    }    
    private void removeComputerItem(){
        DefaultTableModel modelm = (DefaultTableModel) removecomputertable.getModel();
                computer.remove(sel[0]);
                modelm.removeRow(sel[0]);
                computerLabel.setText("Κανένας Η/Υ ακόμα");
                computericon.setIcon(resize(noimage));              
    }     
    private void removeLaptopItem(){
        DefaultTableModel modelm = (DefaultTableModel) removelaptoptable.getModel();
                laptop.remove(sel[0]);
                modelm.removeRow(sel[0]);
                laptopLabel.setText("Κανένα Laptop ακόμα");
                laptopicon.setIcon(resize(noimage));     
    }
    private void removeMonitorItem(){
        DefaultTableModel modelm = (DefaultTableModel) removemonitortable.getModel();
                monitor.remove(sel[0]);
                modelm.removeRow(sel[0]);
                monitorLabel.setText("Καμία οθόνη ακόμα");
                monitoricon.setIcon(resize(noimage));
    }
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
    public void loadItems(){
        chooser.setDialogTitle("Επιλέξτε φάκελο για την Εισαγωγή των δεδομένων");
        int option = chooser.showOpenDialog(micon);
        if (option == JFileChooser.APPROVE_OPTION) {
        File selectedFile = chooser.getSelectedFile();
        path = selectedFile.getAbsolutePath();
        String item;
        String name;
        float price;
        int posotita;
        ImageIcon image2;
        try {
            BufferedReader input = new BufferedReader(new FileReader(path+"\\Monitors.txt"));
            for(int i =0; i < monitor.size();i++){
                monitor.remove(0);
            }
            while ((item = input.readLine()) != null) {
                String[] temp = item.split(";");
                name = temp[0];
                price = Float.parseFloat(temp[1]);
                posotita = Integer.parseInt(temp[2]);
                image2 = new ImageIcon(temp[3]);
                monitor.add(new Item(name,price,posotita,image2));
            }
            input.close();
            input = new BufferedReader(new FileReader(path+"\\Laptops.txt"));
            for(int i =0; i < laptop.size();i++){
                laptop.remove(0);
            }            
            while ((item = input.readLine()) != null) {
                String[] temp = item.split(";");
                name = temp[0];
                price = Float.parseFloat(temp[1]);
                posotita = Integer.parseInt(temp[2]);
                image2 = new ImageIcon(temp[3]);
                laptop.add(new Item(name,price,posotita,image2));
            }
            input.close();
            input = new BufferedReader(new FileReader(path+"\\Computers.txt"));
            for(int i =0; i < computer.size();i++){
                computer.remove(0);
            }            
            while ((item = input.readLine()) != null) {
                String[] temp = item.split(";");
                name = temp[0];
                price = Float.parseFloat(temp[1]);
                posotita = Integer.parseInt(temp[2]);
                image2 = new ImageIcon(temp[3]);
                computer.add(new Item(name,price,posotita,image2));
            }
            input.close();
            input = new BufferedReader(new FileReader(path+"\\Peripherals.txt"));
            for(int i =0; i < peripherals.size();i++){
                peripherals.remove(0);
            }            
            while ((item = input.readLine()) != null) {
                String[] temp = item.split(";");
                name = temp[0];
                price = Float.parseFloat(temp[1]);
                posotita = Integer.parseInt(temp[2]);
                image2 = new ImageIcon(temp[3]);
                peripherals.add(new Item(name,price,posotita,image2));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Δεν μπόρεσαν να βρεθούν τα αρχεία.");
        }
        DefaultTableModel modelss = (DefaultTableModel) productstable.getModel();
        for(int i = 0; i < monitor.size(); ++i)
                addRow(tempitem,monitor,i,modelss);
        }
        
    }
    public ImageIcon resize(ImageIcon icon){
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(260, 160, Image.SCALE_SMOOTH);
        ImageIcon newimage = new ImageIcon(newImg);
        return newimage;
    }   
    private DefaultListModel getItemListModel() {    
        DefaultListModel listModel = new DefaultListModel<>();
        ArrayList selectedList = new ArrayList();
        int listIndex = ItemCategoryComboBox.getSelectedIndex();
        
        switch (listIndex) {
            case 0:
                selectedList = monitor;
                break;
            case 1:
                selectedList = laptop;
                break;
            case 2:
                selectedList = computer;
                break;
            case 3:
                selectedList = peripherals;
                break;
            default:
                break;
        }
        
        for(int i = 0; i < selectedList.size(); i++){
            listModel.addElement(selectedList.get(i));
        }  
        
        return listModel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cart;
    private javax.swing.JFileChooser Chooser;
    private javax.swing.JTable ClientItemList;
    private javax.swing.JList<String> ClientJList;
    private javax.swing.JTextField ClientNameInput;
    private javax.swing.JButton CompleteOrderButton;
    private javax.swing.JDialog Dialog;
    private javax.swing.JMenuItem Import;
    private javax.swing.JComboBox<String> ItemCategoryComboBox;
    private javax.swing.JList<Item> ItemsList;
    private javax.swing.JPanel Orders;
    private javax.swing.JPanel Product_Management;
    private javax.swing.JMenuItem Save;
    private javax.swing.JLabel ShowIcon;
    private javax.swing.JPanel Stock;
    private javax.swing.JButton addComputer;
    private javax.swing.JFrame addComputerTab;
    private javax.swing.JButton addLaptop;
    private javax.swing.JFrame addLaptopTab;
    private javax.swing.JButton addMonitor;
    private javax.swing.JFrame addMonitorTab;
    private javax.swing.JFrame addPeripheralTab;
    private javax.swing.JButton addPeripherals;
    private java.awt.Button button1;
    private javax.swing.JComboBox<String> catsel;
    private javax.swing.JButton changestockbutton;
    private javax.swing.JFileChooser chooser;
    private javax.swing.JButton cicon;
    private javax.swing.JTextField cmodel;
    private javax.swing.JLabel computerLabel;
    private javax.swing.JLabel computericon;
    private javax.swing.JSpinner cposotita;
    private javax.swing.JTextField cvalue;
    private javax.swing.JButton finaladdcomputer;
    private javax.swing.JButton finaladdlaptop;
    private javax.swing.JButton finaladdmonitor;
    private javax.swing.JButton finaladdperipheral;
    private javax.swing.JButton finalremovecomputer;
    private javax.swing.JButton finalremovelaptop;
    private javax.swing.JButton finalremovemonitor;
    private javax.swing.JButton finalremoveperipheral;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel laptopLabel;
    private javax.swing.JLabel laptopicon;
    private javax.swing.JButton licon;
    private javax.swing.JTextField lmodel;
    private javax.swing.JSpinner lposotita;
    private javax.swing.JTextField lvalue;
    private javax.swing.JButton micon;
    private javax.swing.JTextField mmodel;
    private javax.swing.JLabel monitorLabel;
    private javax.swing.JLabel monitoricon;
    private javax.swing.JSpinner mposotita;
    private javax.swing.JTextField mvalue;
    private javax.swing.JLabel peripheralLabel;
    private javax.swing.JLabel peripheralicon;
    private javax.swing.JButton picon;
    private javax.swing.JTextField pmodel;
    private javax.swing.JSpinner pposotita;
    private javax.swing.JTable productstable;
    private javax.swing.JTextField pvalue;
    private javax.swing.JButton removeComputer;
    private javax.swing.JFrame removeComputerTab;
    private javax.swing.JButton removeLaptop;
    private javax.swing.JFrame removeLaptopTab;
    private javax.swing.JButton removeMonitor;
    private javax.swing.JFrame removeMonitorTab;
    private javax.swing.JFrame removePeripheralTab;
    private javax.swing.JButton removePeripherals;
    private javax.swing.JTable removecomputertable;
    private javax.swing.JTable removelaptoptable;
    private javax.swing.JTable removemonitortable;
    private javax.swing.JTable removeperipheraltable;
    private javax.swing.JSpinner stockspinner;
    // End of variables declaration//GEN-END:variables

}