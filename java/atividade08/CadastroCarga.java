import javax.swing.JOptionPane;

public class CadastroCarga extends javax.swing.JFrame {
    
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
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
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelQtdPassageiros;
    private javax.swing.JLabel labelQtdPassageiros1;
    private javax.swing.JLabel labelQtdPistoes;
    private javax.swing.JLabel labelQtdRodas;
    private javax.swing.JLabel labelQtdRodas1;
    private javax.swing.JLabel labelVelocidadeMaxima;
    private javax.swing.JLabel rotCadPes;

	private static final long serialVersionUID = 2114785508903425081L;

	private static Carga carga = new Carga(); 
    
    private static CadastroCarga cadastroCarga;
    
    private CadastroCarga() {
        initComponents();
    }
    
    public static CadastroCarga criarCadastro(){
        if(cadastroCarga == null){
            cadastroCarga = new CadastroCarga();
        }
        return cadastroCarga;
    }

    private void initComponents() {

        rotCadPes = new javax.swing.JLabel();
        labelQtdPassageiros = new javax.swing.JLabel();
        cxTara = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        cxPlaca = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
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
        labelQtdRodas1 = new javax.swing.JLabel();
        cxCor = new javax.swing.JTextField();
        cxCargaMaxima = new javax.swing.JTextField();
        labelQtdPassageiros1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotCadPes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rotCadPes.setText("CARGA - Cadastrar");

        labelQtdPassageiros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdPassageiros.setText("Tara");

        labelPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPlaca.setText("Placa");

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

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
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

        labelQtdRodas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdRodas1.setText("Cor");

        cxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        labelQtdPassageiros1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelQtdPassageiros1.setText("Carga Maxima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(12, 12, 12)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelQtdPistoes)
                            .addComponent(labelPotencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(cxPotencia)
                            .addComponent(cxQtdPistoes)
                            .addComponent(cxQtdRodas)
                            .addComponent(cxVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCor))
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMarca)
                            .addComponent(labelPlaca)
                            .addComponent(labelModelo)
                            .addComponent(labelQtdRodas1)
                            .addComponent(labelQtdRodas)
                            .addComponent(labelVelocidadeMaxima)
                            .addComponent(labelQtdPassageiros1)
                            .addComponent(labelQtdPassageiros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cxCargaMaxima, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxTara, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cxPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                        .addGap(0, 97, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotCadPes)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rotCadPes)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPassageiros)
                    .addComponent(cxTara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdPassageiros1)
                    .addComponent(cxCargaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdRodas1)
                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(76, 76, 76))
        );
        habilitarCampos(false);
        pack();
        setLocationRelativeTo(null);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {
        sair();
    }

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        inserirCarga();
        habilitarCampos(false);
    }

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {
    	limpar();
    	habilitarCampos(true);
    }
        
    public void inserirCarga(){
        try {
            BDVeiculos.getInstance().placaCargaCadastrada(cxPlaca.getText());
            
            carga = new Carga();
            carga.setPlaca(cxPlaca.getText());
            carga.setMarca(cxMarca.getText());
            carga.setModelo(cxModelo.getText());
            carga.setCor(cxCor.getText());
            carga.setQtdRodas(Integer.parseInt(cxQtdRodas.getText()));
            carga.getMotor().setQtdPist(Integer.parseInt(cxQtdPistoes.getText()));
            carga.getMotor().setPotencia(Integer.parseInt(cxPotencia.getText()));
            carga.setCargaMax(Integer.parseInt(cxCargaMaxima.getText()));
            carga.setTara(Integer.parseInt(cxTara.getText()));
            carga.setVelocMax(Float.parseFloat(cxVelocidadeMaxima.getText()));
        
        } catch (VeicExistException ex) {
			JOptionPane.showMessageDialog(null,
					"Ja existe veiculo de Passeio cadastrado com a placa " + cxPlaca.getText().toUpperCase(), "Verificao", 0);
			return;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Existe campo com letra no lugar de numero. Verifique!", "ERRO", 0);
			return;
		} catch (VelocException e) {
			JOptionPane.showMessageDialog(null, "A velocidade maxima esta fora dos limites brasileiros.",
					"Verificacao", 0);
			try {
				carga.setVelocMax(90);
			} catch (VelocException e1) {
				e1.printStackTrace();
			}
		}
        
        BDVeiculos.getInstance().getListaCarga().add(carga);
        JOptionPane.showMessageDialog(null, "Veiculo carga placa: "+carga.getPlaca().toUpperCase()+" incluido com sucesso!", "Confirmacao de cadastro",1);    
        	
    }
        
    public void sair(){
       int resp = JOptionPane.showConfirmDialog(null, "Deseja sair","Saida do Sistema",JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           dispose();
       } 
    }
    
    public void limpar(){
        cxTara.setText("");
        cxCargaMaxima.setText("");
        cxPlaca.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxCor.setText("");
        cxVelocidadeMaxima.setText("");
        cxPotencia.setText("");
        cxQtdRodas.setText("");
        cxQtdPistoes.setText("");

        cxTara.requestFocus();
    }
    
    public void habilitarCampos(Boolean habilitar) {
		cxPlaca.setEditable(habilitar);
		cxMarca.setEditable(habilitar);
        cxModelo.setEditable(habilitar);
        cxCor.setEditable(habilitar);
        cxVelocidadeMaxima.setEditable(habilitar);
        cxPotencia.setEditable(habilitar);
        cxQtdRodas.setEditable(habilitar);
        cxTara.setEditable(habilitar);
        cxCargaMaxima.setEditable(habilitar);
        cxQtdPistoes.setEditable(habilitar);
        
        btCadastrar.setEnabled(habilitar);
	}
    
 
}
