import javax.swing.JOptionPane;

public class ConsultaPasseio extends javax.swing.JFrame {
	
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxQtdPassageiros;
    private javax.swing.JTextField cxQtdPistoes;
    private javax.swing.JTextField cxQtdRodas;
    private javax.swing.JTextField cxVelocidadeMaxima;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelQtdPassageiros;
    private javax.swing.JLabel labelQtdPistoes;
    private javax.swing.JLabel labelQtdRodas;
    private javax.swing.JLabel labelVelocidadeMaxima;
    private javax.swing.JLabel frmConsultaPasseio;
    
	private static final long serialVersionUID = -1409756434701624380L;
	private static ConsultaPasseio consultaPasseio;
    private static Passeio passeio = new Passeio();
    
    private ConsultaPasseio() {
        initComponents();
    }
    
    public static ConsultaPasseio consultar(){
        if(consultaPasseio == null){
            consultaPasseio = new ConsultaPasseio();
        }
        return consultaPasseio;
    }

    private void initComponents() {

        frmConsultaPasseio = new javax.swing.JLabel();
        labelQtdPassageiros = new javax.swing.JLabel();
        cxQtdPassageiros = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        frmConsultaPasseio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        frmConsultaPasseio.setText("PASSEIO - Consultar/Excluir pela Placa");

        labelQtdPassageiros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdPassageiros.setText("Quant. Passageiros");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(labelMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                        .addComponent(cxPotencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(cxQtdPistoes, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxVelocidadeMaxima, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxQtdRodas, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelPlaca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelQtdPassageiros)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxQtdPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSair))
                            .addComponent(frmConsultaPasseio))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(frmConsultaPasseio)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPassageiros)
                    .addComponent(cxQtdPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btConsultar)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(24, 24, 24))
        );
        
        cxMarca.setEditable(false);
        cxModelo.setEditable(false);
        cxCor.setEditable(false);
        cxVelocidadeMaxima.setEditable(false);
        cxPotencia.setEditable(false);
        cxQtdRodas.setEditable(false);
        cxQtdPassageiros.setEditable(false);
        cxQtdPistoes.setEditable(false);

        pack();
        setLocationRelativeTo(null);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {
        sair();
    }

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {
       consultarPorPlaca();
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        excluirPorPlaca();
    }
        
    public void consultarPorPlaca(){
        boolean isPlacaInexistente = true;
        if (cxPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe um numero de placa para consultar!", "Resultado da Consulta",0);
        }else{    
            for (int i = 0; i < BDVeiculos.getInstance().getListaPasseio().size(); i++) {
                passeio = BDVeiculos.getInstance().getListaPasseio().get(i);
                if (passeio != null && passeio.getPlaca().equals(cxPlaca.getText())) {
                    cxCor.setText(passeio.getCor());
                    cxMarca.setText(passeio.getMarca());
                    cxModelo.setText(passeio.getModelo());
                    cxPotencia.setText(Integer.toString(passeio.getMotor().getPotencia()));
                    cxQtdPassageiros.setText(Integer.toString(passeio.getQtdPassageiros()));
                    cxQtdPistoes.setText(Integer.toString(passeio.getMotor().getQtdPist()));
                    cxQtdRodas.setText(Integer.toString(passeio.getQtdRodas()));
                    cxVelocidadeMaxima.setText(Float.toString( passeio.getVelocMax()));

                    isPlacaInexistente = false;
                } 
            }   
        }
        
        if (isPlacaInexistente){
            JOptionPane.showMessageDialog(null, "Nao existe veiculo Passeio com a Placa informada!", "Resultado da Consulta",0);
        }    
    }
    
    
    public void excluirPorPlaca(){
        if (cxPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe um numero de placa para excluir!", "Resultado da Consulta",0);
        }else{    
            for (int i = 0; i < BDVeiculos.getInstance().getListaPasseio().size(); i++) {
                if (BDVeiculos.getInstance().getListaPasseio().get(i) != null
                    && BDVeiculos.getInstance().getListaPasseio().get(i).getPlaca().equalsIgnoreCase(cxPlaca.getText())) {
                    
                    BDVeiculos.getInstance().getListaPasseio().remove(i);
                    JOptionPane.showMessageDialog(null, "Veiculo passeio placa: "+passeio.getPlaca()+" EXCLUIDO com sucesso!", "Exclusão de cadastro",1);
                }else {
                    JOptionPane.showMessageDialog(null, "Nao existe veiculo Passeio com a Placa informada!", "Resultado da Consulta",0);
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
        cxQtdPassageiros.setText("");
        cxQtdPistoes.setText("");
        
        cxPlaca.requestFocus();
    }


}
