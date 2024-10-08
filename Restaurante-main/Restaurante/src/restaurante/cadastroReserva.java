/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante;

import conexao.DatabaseReserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.reservas;

/**
 *
 * @author paulo
 */
public class cadastroReserva extends javax.swing.JFrame {

    /**
     * Creates new form cadastroFunc
     */
    public cadastroReserva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Data_reserva_txt = new javax.swing.JLabel();
        ID_cliente_txt = new javax.swing.JLabel();
        Mesa_txt = new javax.swing.JLabel();
        ID_filial_txt = new javax.swing.JLabel();
        Capacidade_txt = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        Data_reserva = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        ID_cliente = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        ID_filial = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        Mesa = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        Capacidade = new javax.swing.JTextArea();
        Sair = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("Cadastro das Reservas");

        Data_reserva_txt.setText("Data da Reserva");

        ID_cliente_txt.setText("ID do Cliente");

        Mesa_txt.setText("Mesa");

        ID_filial_txt.setText("ID da Filial");

        Capacidade_txt.setText("Capacidade");

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        Data_reserva.setLineWrap(true);
        Data_reserva.setRows(1);
        Data_reserva.setWrapStyleWord(true);
        jScrollPane11.setViewportView(Data_reserva);

        ID_cliente.setLineWrap(true);
        ID_cliente.setRows(1);
        ID_cliente.setWrapStyleWord(true);
        jScrollPane12.setViewportView(ID_cliente);

        ID_filial.setLineWrap(true);
        ID_filial.setRows(1);
        ID_filial.setWrapStyleWord(true);
        jScrollPane13.setViewportView(ID_filial);

        Mesa.setLineWrap(true);
        Mesa.setRows(1);
        Mesa.setWrapStyleWord(true);
        jScrollPane14.setViewportView(Mesa);

        Capacidade.setLineWrap(true);
        Capacidade.setRows(1);
        Capacidade.setWrapStyleWord(true);
        jScrollPane16.setViewportView(Capacidade);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Capacidade_txt)
                            .addComponent(ID_filial_txt)
                            .addComponent(Mesa_txt)
                            .addComponent(ID_cliente_txt)
                            .addComponent(Data_reserva_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(enviar)
                                .addGap(18, 18, 18)
                                .addComponent(Sair)
                                .addGap(18, 18, 18)
                                .addComponent(Limpar))
                            .addComponent(title))
                        .addGap(86, 86, 86))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data_reserva_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_cliente_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_filial_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Capacidade_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar)
                    .addComponent(Sair)
                    .addComponent(Limpar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        String data_reserva = Data_reserva.getText();
        String id_clienteText = ID_cliente.getText();
        Integer id_cliente = Integer.parseInt(id_clienteText);
        String mesa = Mesa.getText();
        String id_filialText = ID_filial.getText();
        Integer id_filial = Integer.parseInt(id_filialText);
        String capacidade = Capacidade.getText();
        
        Date dataReserva = null;
        try {
            dataReserva = new SimpleDateFormat("MM/dd/yyyy").parse(data_reserva);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Data inválido");
        }
        
        reservas NovaReserva = new reservas(dataReserva,id_cliente,mesa,id_filial,capacidade);
        DatabaseReserva criar = new DatabaseReserva();
        criar.create(NovaReserva);
        JOptionPane.showMessageDialog(this, "Ô meu sangue bom, tua reserva foi cadastrado com sucesso meu patrão!");
    }//GEN-LAST:event_enviarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        Data_reserva.setText("");
        ID_cliente.setText("");
        Mesa.setText("");
        ID_filial.setText("");
        Capacidade.setText("");
    }//GEN-LAST:event_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Capacidade;
    private javax.swing.JLabel Capacidade_txt;
    private javax.swing.JTextArea Data_reserva;
    private javax.swing.JLabel Data_reserva_txt;
    private javax.swing.JTextArea ID_cliente;
    private javax.swing.JLabel ID_cliente_txt;
    private javax.swing.JTextArea ID_filial;
    private javax.swing.JLabel ID_filial_txt;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextArea Mesa;
    private javax.swing.JLabel Mesa_txt;
    private javax.swing.JButton Sair;
    private javax.swing.JButton enviar;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}