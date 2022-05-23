import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ListaCarga extends javax.swing.JFrame {
    
	private javax.swing.JButton btExcluir;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel frmListar;
    private javax.swing.JTable tableCarga;
    
	private static final long serialVersionUID = -7430828840761837099L;
	private static ListaCarga listaCarga;
    private static Carga carga = new Carga();
    
    private ListaCarga() {
        initComponents();
    }
    
    public static ListaCarga listar(){
        if(listaCarga == null){
            listaCarga = new ListaCarga();
        }
        return listaCarga;
    }

    private void initComponents() {

        frmListar = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarga = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        frmListar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        frmListar.setText("CARGA - Listar/Excluir todos");

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btImprimir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btImprimir.setText("Imprimir Todos");
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir Todos");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tableCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Qt Rodas", "Velox Max", "Qt Pistoes", "Potencia", "Tara"
            }
        ));
        jScrollPane1.setViewportView(tableCarga);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(frmListar)
                        .addGap(239, 239, 239))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(frmListar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btImprimir)
                    .addComponent(btExcluir)
                    .addComponent(btSair))
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {
        sair();
    }

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {
       listarTodos();
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        excluirTodos();
    }
        
    public void listarTodos(){
        String [] colunas = {"Placa", "Marca", "Modelo", "Cor", "Qt Rodas", "Velox Max", "Qt Pistoes", "Potencia", "Tara", "Carga Max"};
        Object [][] dados = new Object [][] {
        	 {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null},
             {null, null, null, null, null, null, null, null, null, null}
        };
        if (BDVeiculos.getInstance().getListaCarga().isEmpty()){
            tableCarga.setVisible(false);
        }else{
            for (int i = 0; i < BDVeiculos.getInstance().getListaCarga().size(); i++) {
                carga = BDVeiculos.getInstance().getListaCarga().get(i);
                dados[i][0] = carga.getPlaca();
                dados[i][1] = carga.getMarca();
                dados[i][2] = carga.getModelo();
                dados[i][3] = carga.getCor();
                dados[i][4] = carga.getQtdRodas();
                dados[i][5] = carga.getVelocMax();
                dados[i][6] = carga.getMotor().getQtdPist();
                dados[i][7] = carga.getMotor().getPotencia();
                dados[i][8] = carga.getTara();
                dados[i][9] = carga.getCargaMax();
            }

            tableCarga.setModel(new javax.swing.table.DefaultTableModel(dados,colunas));
            tableCarga.setVisible(true);
        }
    };
    
    public void excluirTodos(){
        if (BDVeiculos.getInstance().getListaCarga().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nao existe veiculo(s) Carga para exclusao!", "Resultado",0);
        }else{
            for (int i = 0; i < BDVeiculos.getInstance().getListaCarga().size(); i++) {
            BDVeiculos.getInstance().getListaCarga().remove(i);
            }
        
            JOptionPane.showMessageDialog(null, "Todos veiculos Carga excluidos com sucesso!", "Resultado",0);
        }
        
    }
        
    public void sair(){
       int resp = JOptionPane.showConfirmDialog(null, "Deseja sair","Saida do Sistema",JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           dispose();
       } 
    }
    
}
