import javax.swing.JOptionPane;


public class Teste extends javax.swing.JFrame {

    private javax.swing.JButton btAbrirCadastroCarga;
    private javax.swing.JButton btAbrirCadastroPasseio;
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton rbCarga;
    private javax.swing.JRadioButton rbPasseio;

	private static final long serialVersionUID = 9109257631825301960L;
	
	public Teste() {
        initComponents();
        habilitarPasseioOuCarga();
    }

    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        btAbrirCadastroCarga = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAbrirCadastroPasseio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rbPasseio = new javax.swing.JRadioButton();
        rbCarga = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTitulo.setText("Gestao de Veiculos");

        btAbrirCadastroCarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btAbrirCadastroCarga.setText("Consultar / Excluir pela placa");
        btAbrirCadastroCarga.setActionCommand("carga");
        btAbrirCadastroCarga.setName(""); // NOI18N
        btAbrirCadastroCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirCadCargaActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAbrirCadastroPasseio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btAbrirCadastroPasseio.setText("Cadastrar");
        btAbrirCadastroPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirCadPasseioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Imprimir / Excluir Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rbPasseio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbPasseio.setText("Passeio");
        rbPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPasseioActionPerformed(evt);
            }
        });

        rbCarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbCarga.setText("Carga");
        rbCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAbrirCadastroCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btAbrirCadastroPasseio, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(rbPasseio)
                        .addGap(42, 42, 42)
                        .addComponent(rbCarga)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(labelTitulo)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCarga)
                    .addComponent(rbPasseio))
                .addGap(34, 34, 34)
                .addComponent(btAbrirCadastroPasseio)
                .addGap(18, 18, 18)
                .addComponent(btAbrirCadastroCarga)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(46, 46, 46))
        );
        pack();
        setLocationRelativeTo(null);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
            sair();
    }

    private void btAbrirCadCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirCadCargaActionPerformed
        if (rbPasseio.isSelected()){
           abreJanelaConsultaPasseio();
       }else{
           abreJanelaConsultaCarga();
       }
    }

    private void btAbrirCadPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirCadPasseioActionPerformed
       if (rbPasseio.isSelected()){
           abreJanelaCadastroPasseio();
       }else{
           abreJanelaCadastroCarga();
       }
    }

    private void rbPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPasseioActionPerformed
        rbCarga.setSelected(false);
        habilitarPasseioOuCarga();
    }

    private void rbCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCargaActionPerformed
        rbPasseio.setSelected(false);
        habilitarPasseioOuCarga();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rbPasseio.isSelected()){
           abreJanelaListaPasseio();
       }else{
           abreJanelaListaCarga();
       }
    }

    public void abreJanelaCadastroPasseio(){
        CadastroPasseio.cadastrar().setVisible(true);
    }
        
    public void abreJanelaCadastroCarga(){
        CadastroCarga.criarCadastro().setVisible(true);
    }
    
    public void abreJanelaConsultaPasseio(){
        ConsultaPasseio.consultar().setVisible(true);
    }
    
    public void abreJanelaConsultaCarga(){
        ConsultaCarga.consultar().setVisible(true);
    }
    
    public void abreJanelaListaPasseio(){
        ListaPasseio.listar().setVisible(true);
    }
    
    public void abreJanelaListaCarga(){
        ListaCarga.listar().setVisible(true);
    }
    
    public void sair(){
       int resp = JOptionPane.showConfirmDialog(null, "Deseja sair","Saida do Sistema",JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           dispose();
       } 
    }
    
    private void habilitarPasseioOuCarga(){
        if (rbPasseio.isSelected() == false && rbCarga.isSelected() == false){
            rbPasseio.setSelected(true);
        }
        
        if (rbPasseio.isSelected()){
            rbPasseio.setSelected(true);
            rbCarga.setSelected(false);
        }else{
            rbPasseio.setSelected(false);
            rbCarga.setSelected(true);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }
        
}
