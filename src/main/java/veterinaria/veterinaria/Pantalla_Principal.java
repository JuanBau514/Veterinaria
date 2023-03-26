/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veterinaria.veterinaria;

import veterinaria.vista.*;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author juanpbaucl514
 */
public class Pantalla_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_Principal
     */
    public Pantalla_Principal() {
        initComponents();
        InitStyles();
        ajustarFecha();
        InitContenido();
    }
    
    public void InitContenido(){
        inicioApp appInicio = new inicioApp();
        appInicio.setSize(Contenido.getSize());
        appInicio.setLocation(0,0);

        Contenido.removeAll();
        Contenido.add(appInicio, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }
    
    public void InitStyles () {
        Mensaje.putClientProperty( "FlatLaf.style", "font: 25 $light.font" );
        Mensaje.setForeground(Color.black);
        Usos.putClientProperty( "FlatLaf.style", "font: 20 $h3.regular.font" );
        Usos.setForeground(Color.white);
        Fecha.putClientProperty( "FlatLaf.style", "font: 33 $light.font" );
        Fecha.setForeground(Color.white);
        appName.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        appName.setForeground(Color.white);
    }

    public void ajustarFecha () {
        LocalDate now = LocalDate.now();
        Locale spanishDate = new Locale("es","ES");
        //esta funcion tiene la facultad de poder modificar la fecha de acuerdo
        Fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishDate))); 
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        Usos1 = new javax.swing.JLabel();
        Principal = new javax.swing.JButton();
        Historia = new javax.swing.JButton();
        newConsulta = new javax.swing.JButton();
        newUsuario = new javax.swing.JButton();
        Titulo = new javax.swing.JPanel();
        Usos = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 723));

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(0, 51, 102));

        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("Mininos");
        appName.setToolTipText("");

        Usos1.setForeground(new java.awt.Color(255, 255, 255));
        Usos1.setText("__________________________________");

        Principal.setBackground(new java.awt.Color(0, 102, 153));
        Principal.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        Principal.setForeground(new java.awt.Color(255, 255, 255));
        Principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        Principal.setText("Principal");
        Principal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        Principal.setBorderPainted(false);
        Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Principal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Principal.setIconTextGap(30);
        Principal.setVerifyInputWhenFocusTarget(false);
        Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalActionPerformed(evt);
            }
        });

        Historia.setBackground(new java.awt.Color(0, 102, 153));
        Historia.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        Historia.setForeground(new java.awt.Color(255, 255, 255));
        Historia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-multiple-check.png"))); // NOI18N
        Historia.setText("Historia Clinica");
        Historia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        Historia.setBorderPainted(false);
        Historia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Historia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Historia.setIconTextGap(30);
        Historia.setVerifyInputWhenFocusTarget(false);
        Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoriaActionPerformed(evt);
            }
        });

        newConsulta.setBackground(new java.awt.Color(0, 102, 153));
        newConsulta.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        newConsulta.setForeground(new java.awt.Color(255, 255, 255));
        newConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-plus.png"))); // NOI18N
        newConsulta.setText("Nueva Consulta");
        newConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        newConsulta.setBorderPainted(false);
        newConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newConsulta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        newConsulta.setIconTextGap(30);
        newConsulta.setVerifyInputWhenFocusTarget(false);
        newConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newConsultaActionPerformed(evt);
            }
        });

        newUsuario.setBackground(new java.awt.Color(0, 102, 153));
        newUsuario.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        newUsuario.setForeground(new java.awt.Color(255, 255, 255));
        newUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-multiple.png"))); // NOI18N
        newUsuario.setText("Nuevo Usuario");
        newUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(0, 0, 0)));
        newUsuario.setBorderPainted(false);
        newUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        newUsuario.setIconTextGap(30);
        newUsuario.setVerifyInputWhenFocusTarget(false);
        newUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Usos1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Historia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
            .addComponent(newUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usos1))
                .addGap(33, 33, 33)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Historia, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        Titulo.setBackground(new java.awt.Color(0, 102, 153));

        Usos.setText("Administracion / Control / Consulta");

        Fecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addComponent(Usos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(503, 503, 503))
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Usos)
                .addGap(18, 18, 18)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setAutoscrolls(true);

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Mensaje.setText("La mejor atencion para su mascota :D");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(237, 237, 237))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrincipalActionPerformed

    private void HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HistoriaActionPerformed

    private void newConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newConsultaActionPerformed

    private void newUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Contenido;
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton Historia;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Principal;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel Usos;
    private javax.swing.JLabel Usos1;
    private javax.swing.JLabel appName;
    private javax.swing.JButton newConsulta;
    private javax.swing.JButton newUsuario;
    // End of variables declaration//GEN-END:variables

}
