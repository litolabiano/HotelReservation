package Mainmenu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ljlab
 */
import java.sql.*;
import java.text.ParseException;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.text.*;
import com.formdev.flatlaf.*;
import java.awt.Color;


public class SignUp extends javax.swing.JFrame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hotelreservation_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static boolean nija1=true,nija2=true,nija3=true,nija4=true,nija5=true,nija6=true,nija7=true;
    private static String TypeOfRoom;
    MaskFormatter dateFormat;
    MaskFormatter timeFormat;
    MaskFormatter phoneFormat;
    char[] passwordChars ;
    char[] confirmPasswordChars;
    String confirmPassword,password;

    
    public SignUp() { 
       
        
     
            // Set up UI look and feel
               FlatDarkLaf.setup();
            UIManager.put("Button.arc", 20);
            UIManager.put("Component.arc", 20);
            UIManager.put("TextComponent.arc", 20);
            
           
   try {
            initComponents();
                

            
            
            this.setLocationRelativeTo(null);
             
            
           
            try {
            // Create formatters for date and time fields
            dateFormat = new MaskFormatter("####-##-##");
            dateFormat.setPlaceholderCharacter('_');
            dateFormat.setValidCharacters("0123456789");
            
            timeFormat = new MaskFormatter("##:##:##");
            timeFormat.setPlaceholderCharacter('_');
            timeFormat.setValidCharacters("0123456789");
            
            phoneFormat = new MaskFormatter("# # # # # # # # # # #");
            phoneFormat.setPlaceholderCharacter('_');
            phoneFormat.setValidCharacters("0123456789");
            
            
           
            // Apply formatters to the fields
            CID.setFormatterFactory(new DefaultFormatterFactory(dateFormat));
            COUD.setFormatterFactory(new DefaultFormatterFactory(dateFormat));
            CIT.setFormatterFactory(new DefaultFormatterFactory(timeFormat));
            COUT.setFormatterFactory(new DefaultFormatterFactory(timeFormat));
             Phone.setFormatterFactory(new DefaultFormatterFactory(phoneFormat));
           
           
           

                // Group the room type buttons
                buttonGroup1.add(standard);
                buttonGroup1.add(suite);
                buttonGroup1.add(deluxe);

            
        } catch (ParseException e) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, "Error setting up formatters", e);
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Error initializing date/time formatters: " + e.getMessage(), 
                "Initialization Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
            
        } catch (Exception ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

             
               

        



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textLN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Zip = new javax.swing.JTextField();
        textFN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        adressField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Province = new javax.swing.JComboBox<>();
        City = new javax.swing.JComboBox<>();
        CIT = new javax.swing.JFormattedTextField();
        COUT = new javax.swing.JFormattedTextField();
        CID = new javax.swing.JFormattedTextField();
        COUD = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        suite = new javax.swing.JRadioButton();
        standard = new javax.swing.JRadioButton();
        deluxe = new javax.swing.JRadioButton();
        NoOfInfant = new javax.swing.JComboBox<>();
        NoOfChildren = new javax.swing.JComboBox<>();
        NoOfAdult = new javax.swing.JComboBox<>();
        NoOfPet = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Phone = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();
        showP = new javax.swing.JToggleButton();
        showCP = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 700));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textLN.setForeground(new java.awt.Color(102, 102, 102));
        textLN.setText("eg. Nigga");
        textLN.setToolTipText("");
        textLN.setMaximumSize(new java.awt.Dimension(100, 20));
        textLN.setMinimumSize(new java.awt.Dimension(100, 20));
        textLN.setPreferredSize(new java.awt.Dimension(100, 20));
        textLN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textLNKeyTyped(evt);
            }
        });
        jPanel1.add(textLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 250, 37));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Zip Code");
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 180, 37));

        Zip.setForeground(new java.awt.Color(102, 102, 102));
        Zip.setText("eg. 4114,4114,4000 ");
        Zip.setMaximumSize(new java.awt.Dimension(100, 20));
        Zip.setMinimumSize(new java.awt.Dimension(100, 20));
        Zip.setPreferredSize(new java.awt.Dimension(100, 20));
        Zip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ZipKeyTyped(evt);
            }
        });
        jPanel1.add(Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 180, 37));

        textFN.setForeground(new java.awt.Color(102, 102, 102));
        textFN.setText("eg. Jhun");
        textFN.setMaximumSize(new java.awt.Dimension(100, 20));
        textFN.setMinimumSize(new java.awt.Dimension(100, 20));
        textFN.setPreferredSize(new java.awt.Dimension(100, 20));
        textFN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFNKeyTyped(evt);
            }
        });
        jPanel1.add(textFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LastName");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 250, 37));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FirstName");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 37));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email Address");
        jLabel9.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 37));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Province");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 37));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home Address (optional)");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 160, 37));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirm Password");
        jLabel11.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, 37));

        Email.setForeground(new java.awt.Color(102, 102, 102));
        Email.setText("jhunnigga@email.cum");
        Email.setMaximumSize(new java.awt.Dimension(100, 20));
        Email.setMinimumSize(new java.awt.Dimension(100, 20));
        Email.setPreferredSize(new java.awt.Dimension(100, 20));
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 37));

        adressField.setForeground(new java.awt.Color(102, 102, 102));
        adressField.setText("123 home (optional)");
        adressField.setMaximumSize(new java.awt.Dimension(100, 20));
        adressField.setMinimumSize(new java.awt.Dimension(100, 20));
        adressField.setPreferredSize(new java.awt.Dimension(100, 20));
        adressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adressFieldKeyTyped(evt);
            }
        });
        jPanel1.add(adressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 160, 37));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone No.");
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 190, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City");
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 37));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 150, 120));

        Province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Abra", "Agusan del Norte", "Agusan del Sur", "Aklan", "Albay", "Antique", "Apayao", "Aurora", "Basilan", "Bataan", "Batanes", "Batangas", "Benguet", "Biliran", "Bohol", "Bukidnon", "Bulacan", "Cagayan", "Camarines Norte", "Camarines Sur", "Camiguin", "Capiz", "Catanduanes", "Cavite", "Cebu", "Cotabato", "Davao de Oro", "Davao del Norte", "Davao del Sur", "Davao Occidental", "Davao Oriental", "Dinagat Islands", "Eastern Samar", "Guimaras", "Ifugao", "Ilocos Norte", "Ilocos Sur", "Iloilo", "Isabela", "Kalinga", "La Union", "Laguna", "Lanao del Norte", "Lanao del Sur", "Leyte", "Maguindanao", "Marinduque", "Masbate", "Misamis Occidental", "Misamis Oriental", "Mountain Province", "Negros Occidental", "Negros Oriental", "Northern Samar", "Nueva Ecija", "Nueva Vizcaya", "Occidental Mindoro", "Oriental Mindoro", "Palawan", "Pampanga", "Pangasinan", "Quezon", "Quirino", "Rizal", "Romblon", "Samar", "Sarangani", "Siquijor", "Sorsogon", "South Cotabato", "Southern Leyte", "Sultan Kudarat", "Sulu", "Surigao del Norte", "Surigao del Sur", "Tarlac", "Tawi-Tawi", "Zambales", "Zamboanga del N/A", "N/A", "Norte", "Zamboanga del Sur", "Zamboanga Sibugay" }));
        Province.setMaximumSize(new java.awt.Dimension(100, 20));
        Province.setMinimumSize(new java.awt.Dimension(100, 20));
        Province.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 37));

        City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Alaminos", "Angeles City", "Antipolo", "Bacolod", "Bacoor", "Bago", "Baguio", "Bais", "Balanga", "Baliwag", "Batac", "Batangas City", "Bayawan", "Baybay", "Bayugan", "Biñan", "Bislig", "Bogo", "Borongan", "Butuan", "Cabadbaran", "Cabuyao", "Cadiz", "Cagayan de Oro", "Calaca", "Calamba", "Calapan", "Calbayog", "Caloocan", "Candon", "Canlaon", "Carcar", "Catbalogan", "Cauayan", "Cavite City", "Cebu City", "Cotabato City", "Dagupan", "Danao", "Dapitan", "Dasmariñas", "Davao City", "Digos", "Dipolog", "Dumaguete", "El Salvador", "Escalante", "Gapan", "General Santos", "General Trias", "Gingoog", "Guihulngan", "Himamaylan", "Ilagan", "Iligan", "Iloilo City", "Iriga", "Isabela", "Kabankalan", "Kidapawan", "Koronadal", "La Carlota", "Lamitan", "Laoag", "Lapu-Lapu City", "Las Piñas", "Legazpi", "Ligao", "Lipa", "Lucena", "Maasin", "Mabalacat", "Makati", "Malabon", "Malaybalay", "Malolos", "Mandaluyong", "Mandaue", "Manila", "Marawi", "Marikina", "Masbate City", "Mati", "Meycauayan", "Muñoz", "Muntinlupa", "Naga (Camarines Sur)", "Naga (Cebu)", "Navotas", "Olongapo", "Ormoc", "Oroquieta", "Ozamiz", "Pagadian", "Palayan", "Panabo", "Parañaque", "Pasay", "Pasig", "Passi", "Puerto Princesa", "Quezon City", "Roxas", "Sagay", "Samal", "San Carlos (Negros Occidental)", "San Carlos (Pangasinan)", "San Fernando (La Union)", "San Fernando (Pampanga)", "San Jose", "San Jose del Monte", "San Juan", "San Pablo", "San Pedro", "Santa Rosa", "Santo Tomas", "Santiago", "Silay", "Sipalay", "Sorsogon City", "Surigao City", "Tabaco", "Tabuk", "Tacloban", "Tacurong", "Tagaytay", "Tagbilaran", "Taguig", "Tagum", "Talisay (Cebu)", "Talisay (Negros Occidental)", "Tanauan", "Tandag", "Tangub", "Tanjay", "Tarlac City", "Tayabas", "Toledo", "Trece Martires", "Tuguegarao", "Urdaneta", "Valencia", "Valenzuela", "Victorias", "Vigan", "Zamboanga City." }));
        City.setMaximumSize(new java.awt.Dimension(100, 20));
        City.setMinimumSize(new java.awt.Dimension(100, 20));
        City.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 170, 37));

        try {
            CIT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CIT.setToolTipText("Enter time in HH:MM:SS format");
        CIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CIT.setMaximumSize(new java.awt.Dimension(100, 20));
        CIT.setMinimumSize(new java.awt.Dimension(100, 20));
        CIT.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(CIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, 37));

        try {
            COUT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        COUT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        COUT.setToolTipText("Enter time in HH:MM:SS format");
        COUT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        COUT.setMaximumSize(new java.awt.Dimension(100, 20));
        COUT.setMinimumSize(new java.awt.Dimension(100, 20));
        COUT.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(COUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, 37));

        try {
            CID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CID.setToolTipText("Enter date in YYYY-MM-DD format");
        CID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CID.setMaximumSize(new java.awt.Dimension(100, 20));
        CID.setMinimumSize(new java.awt.Dimension(100, 20));
        CID.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(CID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, 37));

        try {
            COUD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        COUD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        COUD.setToolTipText("Enter date in YYYY-MM-DD format");
        COUD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        COUD.setMaximumSize(new java.awt.Dimension(100, 20));
        COUD.setMinimumSize(new java.awt.Dimension(100, 20));
        COUD.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(COUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, 37));
        COUD.getAccessibleContext().setAccessibleName("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Check-out Time");
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 120, 37));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Check-in Date");
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, 37));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Check-out Date");
        jLabel14.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel14.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 120, 37));

        suite.setBackground(new java.awt.Color(51, 51, 51));
        suite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suite.setForeground(new java.awt.Color(255, 255, 255));
        suite.setText("Suite ");
        suite.setPreferredSize(new java.awt.Dimension(100, 20));
        suite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suiteActionPerformed(evt);
            }
        });
        jPanel1.add(suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 100, 50));

        standard.setBackground(new java.awt.Color(51, 51, 51));
        standard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        standard.setForeground(new java.awt.Color(255, 255, 255));
        standard.setText("Standard");
        standard.setPreferredSize(new java.awt.Dimension(100, 20));
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });
        jPanel1.add(standard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 100, 50));

        deluxe.setBackground(new java.awt.Color(51, 51, 51));
        deluxe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deluxe.setForeground(new java.awt.Color(255, 255, 255));
        deluxe.setText("Deluxe ");
        deluxe.setPreferredSize(new java.awt.Dimension(100, 20));
        deluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxeActionPerformed(evt);
            }
        });
        jPanel1.add(deluxe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 100, 50));

        NoOfInfant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No of Infants", "1", "2", "3", "4", "5", "6" }));
        NoOfInfant.setMaximumSize(new java.awt.Dimension(100, 20));
        NoOfInfant.setMinimumSize(new java.awt.Dimension(100, 20));
        NoOfInfant.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(NoOfInfant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 120, 37));

        NoOfChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No of Childrens", "1", "2", "3", "4", "5", "6" }));
        NoOfChildren.setMaximumSize(new java.awt.Dimension(100, 20));
        NoOfChildren.setMinimumSize(new java.awt.Dimension(100, 20));
        NoOfChildren.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(NoOfChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 120, 37));

        NoOfAdult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. of Adults", "1", "2", "3", "4", "5", "6" }));
        NoOfAdult.setMaximumSize(new java.awt.Dimension(100, 20));
        NoOfAdult.setMinimumSize(new java.awt.Dimension(100, 20));
        NoOfAdult.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(NoOfAdult, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 37));

        NoOfPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. of Pets", "1", "2", "3", "4", "5", "6" }));
        NoOfPet.setMaximumSize(new java.awt.Dimension(100, 20));
        NoOfPet.setMinimumSize(new java.awt.Dimension(100, 20));
        NoOfPet.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(NoOfPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 37));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type of Room:   ");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 510, 37));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Add Guests:");
        jLabel17.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel17.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 510, 37));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Check-in Date");
        jLabel18.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel18.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 37));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 680, 700));

        try {
            Phone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# # # # # # # # # # #")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Phone.setText("");
        Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, 37));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Password");
        jLabel15.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel15.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 37));

        Password.setText("jPasswordField1");
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 37));

        ConfirmPassword.setText("jPasswordField2");
        ConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConfirmPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 250, 37));

        showP.setText("Show");
        showP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPActionPerformed(evt);
            }
        });
        jPanel1.add(showP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 113, 70, 30));

        showCP.setText("Show ");
        showCP.setToolTipText("");
        showCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCPActionPerformed(evt);
            }
        });
        jPanel1.add(showCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 113, 70, 30));

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainmenu.png"))); // NOI18N
        jPanel2.add(jLabel12, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxeActionPerformed

        TypeOfRoom = "Deluxe";
    }//GEN-LAST:event_deluxeActionPerformed

    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed

        TypeOfRoom = "Standard";
    }//GEN-LAST:event_standardActionPerformed

    private void suiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suiteActionPerformed

        TypeOfRoom = "Suite";
    }//GEN-LAST:event_suiteActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 confirmPasswordChars = ConfirmPassword.getPassword();
  passwordChars = Password.getPassword();
  
   password = new String(passwordChars);
   confirmPassword = new String(confirmPasswordChars);
        if (!textFN.getText().matches("[a-zA-Z ]+") ){
            JOptionPane.showMessageDialog(new JFrame(), "FirstName should be letter only","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!textLN.getText().matches("[a-zA-Z ]+")){
            JOptionPane.showMessageDialog(new JFrame(), "LastName should be letter only","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (adressField.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "HomeAdress is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(new JFrame(), "Invalid Password TRY AGAIN!! ","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (Province.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(new JFrame(), "Province is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (City.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(new JFrame(), "City is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (Zip.getText().isEmpty() && nija6){
            JOptionPane.showMessageDialog(new JFrame(), "Zip is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (Email.getText().isEmpty() && nija1){
            JOptionPane.showMessageDialog(new JFrame(), "Email is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (Phone.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Phone is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!Phone.getText().matches("(\\d ){10}\\d")) {
            JOptionPane.showMessageDialog(new JFrame(), "Phone is invalid, Enter phone in 09********* format", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!CID.getText().matches("\\d{4}-\\d{2}-\\d{2}")){
            JOptionPane.showMessageDialog(new JFrame(), "Check in Date is invalid, Enter date in YYYY-MM-DD format","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!CIT.getText().matches("(?i)\\\\d{2}:\\\\d{2}:\\\\d{2}\\\\s?(AM|PM)")){
            JOptionPane.showMessageDialog(new JFrame(), "Check in Time is invalid, Enter the time in 24-hour format (HH:MM:SS)","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!COUD.getText().matches("\\d{4}-\\d{2}-\\d{2}")){
            JOptionPane.showMessageDialog(new JFrame(), "Check out Date is invalid, Enter date in YYYY-MM-DD format","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!COUT.getText().matches("(?i)\\\\d{2}:\\\\d{2}:\\\\d{2}\\\\s?(AM|PM)")){
            JOptionPane.showMessageDialog(new JFrame(), "Check out Time is invalid, Enter the time in 24-hour format (HH:MM:SS)","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (NoOfAdult.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(new JFrame(), "No. of Adult/s is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (NoOfChildren.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(new JFrame(), "No. of Children/s is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (NoOfPet.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(new JFrame(), "No. of Pet/s is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (NoOfInfant.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(new JFrame(), "No. of Infant/s is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else if (!standard.isSelected() && !deluxe.isSelected() && !suite.isSelected() ){
            JOptionPane.showMessageDialog(new JFrame(), "Type of Room is required","Error",JOptionPane.ERROR_MESSAGE );
        }
        else{

            try  {
                Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                String sql = """
                             INSERT INTO guest (first_name, last_name, home_address, password, province, city, zip_code, phone_number, email, 
                                 check_in_date, check_in_time, check_out_date, check_out_time, 
                                 room_type, number_of_adults, number_of_children, number_of_pets, number_of_infants
                             ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    // this set the ? values into the value of the user input
                    stmt.setString(1, textFN.getText());
                    stmt.setString(2, textLN.getText());
                    stmt.setString(3, adressField.getText());
                    stmt.setString(4, "low");

                    String a = String.valueOf(Province.getSelectedItem());
                    String b = String.valueOf(City.getSelectedItem());
                    stmt.setString(5, a);
                    stmt.setString(6, b);
                    stmt.setString(7, Zip.getText());
                    stmt.setString(8, Phone.getText());
                    stmt.setString(9, Email.getText());
                    // Validate and parse dates and times
                    try {
                        stmt.setDate(10, Date.valueOf(CID.getText().trim()));
                        stmt.setTime(11, Time.valueOf(CIT.getText().trim()));
                        stmt.setDate(12, Date.valueOf(COUD.getText().trim()));
                        stmt.setTime(13, Time.valueOf(COUT.getText().trim()));
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(new JFrame(), "Invalid Date/Time Format","Error",JOptionPane.ERROR_MESSAGE );
                        return;
                    }

                    stmt.setString(14, TypeOfRoom);
                    stmt.setInt(15, NoOfAdult.getSelectedIndex());
                    stmt.setInt(16, NoOfChildren.getSelectedIndex());
                    stmt.setInt(17, NoOfPet.getSelectedIndex());
                    stmt.setInt(18, NoOfInfant.getSelectedIndex());

                    // Execute the inserts
                    int rowsAffected = stmt.executeUpdate();

                    System.out.println(rowsAffected + " row(s) inserted.");
                }
            } catch (SQLException e) {
            }this.dispose();

            switch(TypeOfRoom){
                case "Suite" -> new Suite().setVisible(true);
                case "Deluxe" -> new Deluxe().setVisible(true);
                case "Standard" -> new Standard().setVisible(true);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
  if (nija1){
         Email.setText(" ");
            nija1 = false;
          Email.setForeground(new Color(204,204,204));
      
     }
    }//GEN-LAST:event_EmailKeyTyped

    private void textLNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLNKeyTyped
  if (nija2){
         textLN.setText(" ");
     
            nija2 = false;
          textLN.setForeground(new Color(204,204,204));
      
     }
    }//GEN-LAST:event_textLNKeyTyped

    private void textFNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFNKeyTyped
     if (nija3){
         textFN.setText(" ");  
          textFN.setForeground(new Color(204,204,204));
          nija3 = false;
      
     }
    }//GEN-LAST:event_textFNKeyTyped

    private void adressFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adressFieldKeyTyped
     if (nija4){
        adressField.setText(" ");
            nija4 = false;
         adressField.setForeground(new Color(204,204,204));
      
     }
    }//GEN-LAST:event_adressFieldKeyTyped

    private void ZipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ZipKeyTyped
    if (nija6){
        Zip.setText(" ");
            nija6 = false;
          Zip.setForeground(new Color(204,204,204));
     }
    }//GEN-LAST:event_ZipKeyTyped

    private void ConfirmPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmPasswordKeyTyped
        if (nija7){
        ConfirmPassword.setText(" ");
            nija7 = false;
        ConfirmPassword.setForeground(new Color(204,204,204)); 
     }
    }//GEN-LAST:event_ConfirmPasswordKeyTyped

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        if (nija5){
        Password.setText(" ");
            nija5= false;
          Password.setForeground(new Color(204,204,204)); 
     }
    }//GEN-LAST:event_PasswordKeyTyped

    private void showCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCPActionPerformed
       if (showCP.isSelected()){
           ConfirmPassword.setEchoChar((char) 0);
       }else {
           ConfirmPassword.setEchoChar('•');
       }
    }//GEN-LAST:event_showCPActionPerformed

    private void showPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPActionPerformed
         if (showP.isSelected()){
           Password.setEchoChar((char) 0);
       }else {
           Password.setEchoChar('•');
       }
    }//GEN-LAST:event_showPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CID;
    private javax.swing.JFormattedTextField CIT;
    private javax.swing.JFormattedTextField COUD;
    private javax.swing.JFormattedTextField COUT;
    private javax.swing.JComboBox<String> City;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> NoOfAdult;
    private javax.swing.JComboBox<String> NoOfChildren;
    private javax.swing.JComboBox<String> NoOfInfant;
    private javax.swing.JComboBox<String> NoOfPet;
    private javax.swing.JPasswordField Password;
    private javax.swing.JFormattedTextField Phone;
    private javax.swing.JComboBox<String> Province;
    private javax.swing.JTextField Zip;
    private javax.swing.JTextField adressField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton deluxe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton showCP;
    private javax.swing.JToggleButton showP;
    private javax.swing.JRadioButton standard;
    private javax.swing.JRadioButton suite;
    private javax.swing.JTextField textFN;
    private javax.swing.JTextField textLN;
    // End of variables declaration//GEN-END:variables

}
