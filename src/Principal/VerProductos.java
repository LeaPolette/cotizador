/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.MenuPrincipal.panelPrincipal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class VerProductos extends javax.swing.JPanel {

    /**
     * Creates new form VerProductos
     */
    public String a[][] = null;
    DecimalFormat df = new DecimalFormat("###,###.00");
    public VerProductos() {
        initComponents();
         
        btnEditarProductos.setEnabled(false);
                
        a = new String[MenuPrincipal.ProdutosMuestra.size()][3];
        //llenado de la tabla
        for(int i = 0;i<MenuPrincipal.ProdutosMuestra.size();i++){
            a[i][0] = "SISA-" + MenuPrincipal.ProdutosMuestra.get(i).id_productos;
            a[i][1] = MenuPrincipal.ProdutosMuestra.get(i).descripcion;
            a[i][2] = String.valueOf(df.format(MenuPrincipal.ProdutosMuestra.get(i).precio));
 
        }
        
        
           TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            a,
            new String [] {
                "ID", "Descripcion", "Precio Unitario $"
            }
            ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
         });

       TablaInventario.getColumnModel().getColumn(0).setPreferredWidth(10);
       TablaInventario.getColumnModel().getColumn(1).setPreferredWidth(650);
       TablaInventario.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        palabrasLabel = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEditarProductos = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1250, 720));
        setMinimumSize(new java.awt.Dimension(1250, 720));
        setPreferredSize(new java.awt.Dimension(1250, 720));

        jLabel1.setText("Para filtrar productos, escriba una palabra clave y luego de click en \"mostrar\" para que se visualicen los productos con esa palabra");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel2.setText("PRODUCTOS");

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInventario);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel3.setText("si se desea volver a mostrar todos los productos deje en blanco el campo y de click en \"mostrar\"");

        btnEditarProductos.setText("Editar Producto");
        btnEditarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductosActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setText("Ir al menu principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(palabrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrar))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(602, 602, 602)
                        .addComponent(jLabel2)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(btnEditarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        MenuProductos mp = new MenuProductos();//declaramos el objeto panel MenuProductos
        mp.setLocation(412,0);//posicion del panel ajustado al frame
        mp.setSize(426, 720);//tamaño del panel ajustado al frame
        /* Esto ultimo es para colocar el panel dentro del frame y ajustarlo en el centro*/
        panelPrincipal.removeAll();
        panelPrincipal.add(mp);
        panelPrincipal.setLocation(0,0);
        panelPrincipal.setSize(1250, 720);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();      
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEditarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductosActionPerformed
        // TODO add your handling code here:
        if(TablaInventario.getSelectedRow() >= 0){
            if(TablaInventario.getSelectedRows().length == 1){
                String b = a[TablaInventario.getSelectedRow()][0].replaceAll("[a-zA-Z]", "");
                EditarProductos mi = new EditarProductos(-Integer.parseInt(b));
                mi.setLocation(315,168);//posicion del panel ajustado al frame
                mi.setSize(621, 384);//tamaño del panel ajustado al frame
                /* Esto ultimo es para colocar el panel dentro del frame y ajustarlo en el centro*/
                panelPrincipal.removeAll();
                panelPrincipal.add(mi);
                panelPrincipal.setLocation(0,0);
                panelPrincipal.setSize(1250, 720);
                panelPrincipal.revalidate();
                panelPrincipal.repaint();
        }else{
                 JOptionPane.showMessageDialog(this,
                 "Seleccione solo un producto para editar.",
                 "Error",
                 JOptionPane.ERROR_MESSAGE);
             }
        }
       

    }//GEN-LAST:event_btnEditarProductosActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        // TODO add your handling code here:
        MenuInicial mi = new MenuInicial();//declaramos el objeto Menuinicial
        mi.setLocation(412,0);//posicion del panel ajustado al frame
        mi.setSize(426, 720);//tamaño del panel ajustado al frame
        /* Esto ultimo es para colocar el panel dentro del frame y ajustarlo en el centro*/
        panelPrincipal.removeAll();
        panelPrincipal.add(mi);
        panelPrincipal.setLocation(0,0);
        panelPrincipal.setSize(1250, 720);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void TablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInventarioMouseClicked
        // TODO add your handling code here:      
        if(TablaInventario.getSelectedRow() >= 0){
            btnEditarProductos.setEnabled(true);
        }
    }//GEN-LAST:event_TablaInventarioMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        
        String palabra = palabrasLabel.getText();
        
        if(!palabra.isEmpty()){
            try {
                List<Productos> listaTemporal = MenuPrincipal.consultas.listaProductos("select * from productos where descripcion ilike '"+ palabra + "%' or descripcion ilike '%" +palabra +"%'" );
                a = new String[listaTemporal.size()][3];
                
                if(a.length == 0){
                    JOptionPane.showMessageDialog(this, "No se encontraron resultado");
                    palabrasLabel.setText("");
                    btnMostrar.doClick();
                    return;
                }
                for(int i = 0; i<a.length;i++){
                    a[i][0] = "SISA-" + listaTemporal.get(i).id_productos;
                    a[i][1] = listaTemporal.get(i).descripcion;
                    a[i][2] = String.valueOf(df.format(listaTemporal.get(i).precio));
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VerProductos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(VerProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }else{
            a = new String [MenuPrincipal.ProdutosMuestra.size()][3];//arreglo
         
            
            TablaInventario.setVisible(false);

            //llenado de la tabla
            for(int i = 0;i<MenuPrincipal.ProdutosMuestra.size();i++){
                a[i][0] = "SISA-" + MenuPrincipal.ProdutosMuestra.get(i).id_productos;
                a[i][1] = MenuPrincipal.ProdutosMuestra.get(i).descripcion;
                a[i][2] = String.valueOf(df.format(MenuPrincipal.ProdutosMuestra.get(i).precio));

            }         
        }
        
        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
        a,new String [] {
                "ID", "Descripcion", "Precio Unitario $"
            }
            ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        btnEditarProductos.setEnabled(false);
        TablaInventario.getColumnModel().getColumn(0).setPreferredWidth(10);
        TablaInventario.getColumnModel().getColumn(1).setPreferredWidth(650);
        TablaInventario.getColumnModel().getColumn(2).setPreferredWidth(100);
        TablaInventario.setVisible(true);
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInventario;
    private javax.swing.JButton btnEditarProductos;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField palabrasLabel;
    // End of variables declaration//GEN-END:variables
}
