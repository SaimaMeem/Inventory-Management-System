package Inventory;

import Admins.AdminActivity;
import Main.Admin;
import Main.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saima
 */
public class product extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;

    public product() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/icon_1.png"));
        this.setIconImage(ic.getImage());
        loadData();
    }
    public void loadData() {
   try {  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");  
   
               Statement statement = connection.createStatement();  
               
             ResultSet rs = statement.executeQuery("SELECT  product_id as ProductId ,category_id as CategoryId, brand_id as BrandId,"
                     + "product_name as ProductName ,product_price as ProductPrice ,"
                     + "product_description as ProductDescription , product_status as "
                     + "ProductStatus FROM product order by product_id");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          dDTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
         }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        pnameField = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        cidField = new javax.swing.JTextField();
        bidField = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dDTable = new javax.swing.JTable();
        name = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        add_product = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        pidField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        pstatusField = new javax.swing.JTextField();
        name2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        addproductbtn = new javax.swing.JButton();
        delproductbtn = new javax.swing.JButton();
        search = new javax.swing.JButton();
        upproductbtn = new javax.swing.JButton();
        reproductbtn = new javax.swing.JButton();
        clearproductbtn = new javax.swing.JButton();
        name3 = new javax.swing.JLabel();
        priceHL = new javax.swing.JButton();
        sortAZ = new javax.swing.JButton();
        sortZA = new javax.swing.JButton();
        priceLH4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        availpro = new javax.swing.JButton();
        showAvailPro = new javax.swing.JTextField();
        supsearch = new javax.swing.JButton();
        supSearchField = new javax.swing.JTextField();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product");

        jPanel1.setToolTipText("Product");

        pnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameFieldActionPerformed(evt);
            }
        });

        name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 153, 153));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name1.setText("Product Name");

        cidField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidFieldActionPerformed(evt);
            }
        });

        bidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidFieldActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(0, 153, 153));
        id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id.setText("Category Id");
        id.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Id", "Name", "lPrice", "Quantity", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dDTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dDTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dDTable);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 153, 153));
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("Brand Id");

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        add_product.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add_product.setForeground(new java.awt.Color(255, 255, 255));
        add_product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_product.setText("Product");

        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(419, 419, 419)
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(logout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        description.setForeground(new java.awt.Color(0, 153, 153));
        description.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        description.setText("Description");

        id1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 153, 153));
        id1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id1.setText("Product Id");
        id1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(0, 153, 153));
        price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        price.setText("Price");

        pidField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidFieldActionPerformed(evt);
            }
        });

        descriptionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionFieldActionPerformed(evt);
            }
        });

        pstatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pstatusFieldActionPerformed(evt);
            }
        });

        name2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name2.setForeground(new java.awt.Color(0, 153, 153));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name2.setText("Product Status");

        searchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setText("Enter the Product Name");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        addproductbtn.setBackground(new java.awt.Color(0, 153, 153));
        addproductbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        addproductbtn.setForeground(new java.awt.Color(255, 255, 255));
        addproductbtn.setText("Add");
        addproductbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addproductbtnMouseClicked(evt);
            }
        });

        delproductbtn.setBackground(new java.awt.Color(0, 153, 153));
        delproductbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        delproductbtn.setForeground(new java.awt.Color(255, 255, 255));
        delproductbtn.setText("Delete");
        delproductbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delproductbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delproductbtnMouseEntered(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search ");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        upproductbtn.setBackground(new java.awt.Color(0, 153, 153));
        upproductbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        upproductbtn.setForeground(new java.awt.Color(255, 255, 255));
        upproductbtn.setText("Update");
        upproductbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upproductbtnMouseClicked(evt);
            }
        });
        upproductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upproductbtnActionPerformed(evt);
            }
        });

        reproductbtn.setBackground(new java.awt.Color(0, 153, 153));
        reproductbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        reproductbtn.setForeground(new java.awt.Color(255, 255, 255));
        reproductbtn.setText("Refresh");
        reproductbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproductbtnMouseClicked(evt);
            }
        });

        clearproductbtn.setBackground(new java.awt.Color(0, 153, 153));
        clearproductbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        clearproductbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearproductbtn.setText("Clear");
        clearproductbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearproductbtnMouseClicked(evt);
            }
        });

        name3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name3.setForeground(new java.awt.Color(0, 153, 153));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name3.setText("Filters :");

        priceHL.setBackground(new java.awt.Color(0, 153, 153));
        priceHL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceHL.setForeground(new java.awt.Color(255, 255, 255));
        priceHL.setText("Price (High to low)");
        priceHL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceHLMouseClicked(evt);
            }
        });
        priceHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceHLActionPerformed(evt);
            }
        });

        sortAZ.setBackground(new java.awt.Color(0, 153, 153));
        sortAZ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sortAZ.setForeground(new java.awt.Color(255, 255, 255));
        sortAZ.setText("Product Name (A-Z)");
        sortAZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortAZMouseClicked(evt);
            }
        });
        sortAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAZActionPerformed(evt);
            }
        });

        sortZA.setBackground(new java.awt.Color(0, 153, 153));
        sortZA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sortZA.setForeground(new java.awt.Color(255, 255, 255));
        sortZA.setText("Product Name (Z-A)");
        sortZA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortZAMouseClicked(evt);
            }
        });
        sortZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortZAActionPerformed(evt);
            }
        });

        priceLH4.setBackground(new java.awt.Color(0, 153, 153));
        priceLH4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLH4.setForeground(new java.awt.Color(255, 255, 255));
        priceLH4.setText("Price (Low to High)");
        priceLH4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceLH4MouseClicked(evt);
            }
        });
        priceLH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLH4ActionPerformed(evt);
            }
        });

        availpro.setBackground(new java.awt.Color(0, 153, 153));
        availpro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        availpro.setForeground(new java.awt.Color(255, 255, 255));
        availpro.setText("Available Product");
        availpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availproMouseClicked(evt);
            }
        });
        availpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availproActionPerformed(evt);
            }
        });

        showAvailPro.setEditable(false);
        showAvailPro.setBackground(new java.awt.Color(255, 255, 255));
        showAvailPro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showAvailPro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(availpro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showAvailPro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(availpro, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(showAvailPro))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        supsearch.setBackground(new java.awt.Color(0, 153, 153));
        supsearch.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        supsearch.setForeground(new java.awt.Color(255, 255, 255));
        supsearch.setText("Search ");
        supsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supsearchMouseClicked(evt);
            }
        });
        supsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supsearchActionPerformed(evt);
            }
        });

        supSearchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supSearchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        supSearchField.setText("Enter the Country Name");
        supSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supSearchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addproductbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(385, 385, 385)
                                        .addComponent(supSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(222, 222, 222)
                                        .addComponent(supsearch))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(priceLH4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sortAZ, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(priceHL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sortZA, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(205, 205, 205))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(delproductbtn)
                                .addGap(24, 24, 24)
                                .addComponent(upproductbtn)
                                .addGap(25, 25, 25)
                                .addComponent(reproductbtn)
                                .addGap(34, 34, 34)
                                .addComponent(clearproductbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search)
                                .addGap(64, 64, 64)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25)
                                            .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(name2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pstatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(cidField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 84, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(73, 73, 73)
                                            .addComponent(priceField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(bidField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(pnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pstatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bidField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                            .addComponent(upproductbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delproductbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addproductbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reproductbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(clearproductbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLH4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceHL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortAZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortZA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(160, 160, 160))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void availproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availproActionPerformed
        // TODO add your handling code here:
        try{
            //String sasdast = jComboBox1.getSelectedItem().toString();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select count(product_id) from product where  product_status = 'active'");
            if (rs.next()) {
                showAvailPro.setText(rs.getString(1));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_availproActionPerformed

    private void availproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availproMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(" select * from product " + "where product_status = 'active' ");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_availproMouseClicked

    private void priceLH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceLH4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceLH4ActionPerformed

    private void priceLH4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceLH4MouseClicked
        // TODO add your handling code here:
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(" select * from product  order by product_price ");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_priceLH4MouseClicked

    private void sortZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortZAActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(" select * from product  order by product_name desc ");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sortZAActionPerformed

    private void sortZAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortZAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sortZAMouseClicked

    private void sortAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortAZActionPerformed

    private void sortAZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortAZMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(" select * from product  order by product_name ");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sortAZMouseClicked

    private void priceHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceHLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceHLActionPerformed

    private void priceHLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceHLMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(" select * from product  order by product_price desc ");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_priceHLMouseClicked

    private void clearproductbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearproductbtnMouseClicked
        // TODO add your handling code here:
        pidField.setText("");
        pnameField.setText("");
        cidField.setText("");
        bidField.setText("");
        priceField.setText("");
        descriptionField.setText("");
    
        pstatusField.setText("");
        showAvailPro.setText("");
    }//GEN-LAST:event_clearproductbtnMouseClicked

    private void reproductbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproductbtnMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT  product_id as ProductId ,category_id as CategoryId, brand_id as BrandId,"
                     + "product_name as ProductName ,product_price as ProductPrice ,"
                     + "product_description as ProductDescription , product_status as "
                     + "ProductStatus FROM product order by product_id");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);
            JOptionPane.showMessageDialog(null, "Refreshed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_reproductbtnMouseClicked

    private void upproductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upproductbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upproductbtnActionPerformed

    private void upproductbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upproductbtnMouseClicked
        // TODO add your handling code here:
        String s1 = pnameField.getText();
        String s2 = pidField.getText();
        String s3 = pnameField.getText();
    String s5 = cidField.getText();
        String s6 = bidField.getText();
        String s8 = descriptionField.getText();
        String s7 = priceField.getText();
        String s4 = pstatusField.getText();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            statement.execute("Update product set product_id =" + s2 + ",category_id =" + s5 + ", brand_id =" + s6 + ","
                    + " product_name ="+" '"+ s3 +"' "+" , product_description ="+"'" + s8 + "'"+" , product_price =" + s7 + ", product_status ="+"'" + s4 + "'"+"  where product_name ="+"'"+ s1+"'");

            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_upproductbtnMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        String s1= searchField.getText();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(" select product_id as ProductId ,category_id as CategoryId, brand_id as BrandId,"
                    + "product_name as ProductName ,product_price as ProductPrice ,"
                    + "product_description as ProductDescription , product_status  from product "  + " where product_name = (  '"+s1+"')");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchMouseClicked

    private void delproductbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delproductbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delproductbtnMouseEntered

    private void delproductbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delproductbtnMouseClicked
        // TODO add your handling code here:
        String s1= pnameField.getText();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            statement.execute(" delete from product "  + " where product_name = (  '"+s1+"')" );

            JOptionPane.showMessageDialog(null, "Product " + s1 + " has been deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Product named " + s1 + " not found");
        }
    }//GEN-LAST:event_delproductbtnMouseClicked

    private void addproductbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addproductbtnMouseClicked
        // TODO add your handling code here:
        String s1= pidField.getText();
        String s2=pnameField.getText();
   
        String s7=descriptionField.getText();
        String s6=priceField.getText();
        String s3= cidField.getText();
        String s4= bidField.getText();
        String s8=pstatusField.getText();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            statement.execute(" insert into product "  + " values ( '"+s1+"', '"+s2+"', '"+s7+"','"+s6+"', '"+s3+"', '"+s4+"', '"+s8+"')" );

            JOptionPane.showMessageDialog(null, " Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addproductbtnMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void pstatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pstatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pstatusFieldActionPerformed

    private void descriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldActionPerformed

    private void pidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidFieldActionPerformed

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        AdminActivity adActivity = new AdminActivity();
        adActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Admin admin = new Admin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked

    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked

    }//GEN-LAST:event_jLabel20MouseClicked

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void dDTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dDTableMouseClicked
        // TODO add your handling code here:
        // get the model from the jtable
        DefaultTableModel model = (DefaultTableModel)dDTable.getModel();

        // get the selected row index
        int selectedRowIndex = dDTable.getSelectedRow();

        // set the selected row data into jtextfields
        pidField.setText(model.getValueAt(selectedRowIndex, 0).toString());
               cidField.setText(model.getValueAt(selectedRowIndex, 1).toString());
               bidField.setText(model.getValueAt(selectedRowIndex, 2).toString());
        pnameField.setText(model.getValueAt(selectedRowIndex, 3).toString());
        priceField.setText(model.getValueAt(selectedRowIndex, 4).toString());
//        quantityField.setText(model.getValueAt(selectedRowIndex, 3).toString());
        descriptionField.setText(model.getValueAt(selectedRowIndex, 5).toString());
        pstatusField.setText(model.getValueAt(selectedRowIndex, 6).toString());
    }//GEN-LAST:event_dDTableMouseClicked

    private void bidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidFieldActionPerformed

    private void cidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidFieldActionPerformed

    private void pnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameFieldActionPerformed

    private void supsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supsearchMouseClicked
        // TODO add your handling code here:
        String s1= supSearchField.getText();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab11;integratedSecurity=true");

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("  select s.supplier_name, p.product_name ,s.country \n" +
"  from supplier s\n" +
"  inner join product p\n" +
"  on s.product_id=s.product_id\n" +
"  where s.country='"+s1+"'\n" +
"  group by p.product_name,s.supplier_name,s.country");
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            dDTable.setModel(dtm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_supsearchMouseClicked

    private void supsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supsearchActionPerformed

    private void supSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supSearchFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_product;
    private javax.swing.JButton addproductbtn;
    private javax.swing.JButton availpro;
    private javax.swing.JLabel backbtn;
    private javax.swing.JTextField bidField;
    private javax.swing.JTextField cidField;
    private javax.swing.JButton clearproductbtn;
    private javax.swing.JTable dDTable;
    private javax.swing.JButton delproductbtn;
    private javax.swing.JLabel description;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JTextField pidField;
    private javax.swing.JTextField pnameField;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton priceHL;
    private javax.swing.JButton priceLH4;
    private javax.swing.JTextField pstatusField;
    private javax.swing.JButton reproductbtn;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField showAvailPro;
    private javax.swing.JButton sortAZ;
    private javax.swing.JButton sortZA;
    private javax.swing.JTextField supSearchField;
    private javax.swing.JButton supsearch;
    private javax.swing.JButton upproductbtn;
    // End of variables declaration//GEN-END:variables
}
