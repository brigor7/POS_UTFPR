import javax.swing.JOptionPane;

public class ConsultaCarga extends javax.swing.JFrame {
	
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCargaMaxima;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxQtdPistoes;
    private javax.swing.JTextField cxQtdRodas;
    private javax.swing.JTextField cxTara;
    private javax.swing.JTextField cxVelocidadeMaxima;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelQtdPassageiros;
    private javax.swing.JLabel labelQtdPassageiros1;
    private javax.swing.JLabel labelQtdPistoes;
    private javax.swing.JLabel labelQtdRodas;
    private javax.swing.JLabel labelVelocidadeMaxima;
    private javax.swing.JLabel rotCadPes;
    
	private static final long serialVersionUID = -8279697146800500643L;
	private static ConsultaCarga consultaCarga;
    private static Carga carga = new Carga();   
    
    private ConsultaCarga() {
        initComponents();
    }
    
    public static ConsultaCarga consultar(){
        if(consultaCarga == null){
            consultaCarga = new ConsultaCarga();
        }
        return consultaCarga;
    }

    private void initComponents() {

        rotCadPes = new javax.swing.JLabel();
        labelQtdPassageiros = new javax.swing.JLabel();
        cxCargaMaxima = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        cxPlaca = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        labelMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        labelQtdRodas = new javax.swing.JLabel();
        cxQtdRodas = new javax.swing.JTextField();
        labelVelocidadeMaxima = new javax.swing.JLabel();
        cxVelocidadeMaxima = new javax.swing.JTextField();
        labelQtdPistoes = new javax.swing.JLabel();
        cxQtdPistoes = new javax.swing.JTextField();
        labelPotencia = new javax.swing.JLabel();
        cxPotencia = new javax.swing.JTextField();
        labelCor = new javax.swing.JLabel();
        cxCor = new javax.swing.JTextField();
        labelQtdPassageiros1 = new javax.swing.JLabel();
        cxTara = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotCadPes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rotCadPes.setText("CARGA - Consultar/Excluir pela Placa");

        labelQtdPassageiros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdPassageiros.setText("Carga Maxima");

        labelPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPlaca.setForeground(new java.awt.Color(255, 0, 51));
        labelPlaca.setText("Informa a Placa");

        cxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        labelMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMarca.setText("Marca");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelModelo.setText("Modelo");

        cxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelQtdRodas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdRodas.setText("Qtd. Rodas");

        cxQtdRodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelVelocidadeMaxima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelVelocidadeMaxima.setText("Velocidade Maxima");

        cxVelocidadeMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelQtdPistoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdPistoes.setText("Qtd. Pistoes");

        cxQtdPistoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelPotencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPotencia.setText("Potencia");

        cxPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelCor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCor.setText("Cor");

        cxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelQtdPassageiros1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdPassageiros1.setText("Tara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(labelPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelQtdRodas)
                                    .addComponent(labelModelo)
                                    .addComponent(labelVelocidadeMaxima)
                                    .addComponent(labelQtdPistoes)
                                    .addComponent(labelPotencia)
                                    .addComponent(labelCor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cxPotencia, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxQtdPistoes, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxVelocidadeMaxima, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxQtdRodas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSair))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelQtdPassageiros)
                                    .addComponent(labelMarca)
                                    .addComponent(labelQtdPassageiros1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxTara, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCargaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rotCadPes))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rotCadPes)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPassageiros1)
                    .addComponent(cxTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPassageiros)
                    .addComponent(cxCargaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor)
                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdRodas)
                    .addComponent(cxQtdRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVelocidadeMaxima)
                    .addComponent(cxVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPistoes)
                    .addComponent(cxQtdPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPotencia)
                    .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir)
                        .addComponent(btLimpar)
                        .addComponent(btSair)))
                .addGap(20, 20, 20))
        );
        
        cxMarca.setEditable(false);
        cxModelo.setEditable(false);
        cxCor.setEditable(false);
        cxVelocidadeMaxima.setEditable(false);
        cxPotencia.setEditable(false);
        cxQtdRodas.setEditable(false);
        cxTara.setEditable(false);
        cxCargaMaxima.setEditable(false);
        cxQtdPistoes.setEditable(false);


        pack();
        setLocationRelativeTo(null);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
       consultarPorPlaca();
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirPorPlaca();
    }
        
    public void consultarPorPlaca(){
        boolean isPlacaInexistente = true;
        if (cxPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe um numero de placa para consultar!", "Resultado da Consulta",0);
        }else{    
            for (int i = 0; i < BDVeiculos.getInstance().getListaCarga().size(); i++) {
                carga = BDVeiculos.getInstance().getListaCarga().get(i);
                if (carga != null && carga.getPlaca().equals(cxPlaca.getText())) {
                    cxCor.setText(carga.getCor());
                    cxMarca.setText(carga.getMarca());
                    cxModelo.setText(carga.getModelo());
                    cxPotencia.setText(Integer.toString(carga.getMotor().getPotencia()));
                    cxCargaMaxima.setText(Integer.toString(carga.getCargaMax()));
                    cxTara.setText(Integer.toString(carga.getTara()));
                    cxQtdPistoes.setText(Integer.toString(carga.getMotor().getQtdPist()));
                    cxQtdRodas.setText(Integer.toString(carga.getQtdRodas()));
                    cxVelocidadeMaxima.setText(Float.toString( carga.getVelocMax()));
                    isPlacaInexistente = false;
                } 
            }   
        }
        
        if (isPlacaInexistente){
            JOptionPane.showMessageDialog(null, "Nao existe veiculo Carga com a Placa informada!", "Resultado da Consulta",0);
        }    
    }
    
    
    public void excluirPorPlaca(){
        if (cxPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe um numero de placa para excluir!", "Resultado da Consulta",0);
        }else{    
            for (int i = 0; i < BDVeiculos.getInstance().getListaCarga().size(); i++) {
                if (BDVeiculos.getInstance().getListaCarga().get(i) != null
                    && BDVeiculos.getInstance().getListaCarga().get(i).getPlaca().equalsIgnoreCase(cxPlaca.getText())) {
                    
                	BDVeiculos.getInstance().getListaCarga().remove(i);
                    JOptionPane.showMessageDialog(null, "Veiculo Carga placa: "+cxPlaca.getText()+" EXCLUIDO com sucesso!", "Exclusao de cadastro",1);
                }else {
                    JOptionPane.showMessageDialog(null, "Nao existe veiculo Carga com a Placa informada!", "Resultado da Consulta",0);
                }
            }   
        }       
    }
        
    public void sair(){
       int resp = JOptionPane.showConfirmDialog(null, "Deseja sair","Saida do Sistema",JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           dispose();
       } 
    }
    
    public void limpar(){
        cxPlaca.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxCor.setText("");
        cxVelocidadeMaxima.setText("");
        cxPotencia.setText("");
        cxQtdRodas.setText("");
        cxCargaMaxima.setText("");
        cxQtdPistoes.setText("");
        cxCargaMaxima.setText("");
        cxTara.setText("");
        
        cxPlaca.requestFocus();
    }

}
