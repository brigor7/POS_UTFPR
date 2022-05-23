import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroPasseio extends javax.swing.JFrame {

	private javax.swing.JButton btCadastrar;
	private javax.swing.JButton btLimpar;
	private javax.swing.JButton btNovo;
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
	private javax.swing.JLabel rotCadPes;

	private static final long serialVersionUID = 2135237299771947927L;
	private static CadastroPasseio cadastroPasseio;
	private static Passeio passeio = new Passeio();

	private CadastroPasseio() {
		initComponents();
	}

	public static CadastroPasseio cadastrar() {
		if (cadastroPasseio == null) {
			cadastroPasseio = new CadastroPasseio();
		}
		return cadastroPasseio;
	}

	private void initComponents() {
		rotCadPes = new javax.swing.JLabel();
		labelQtdPassageiros = new javax.swing.JLabel();
		cxQtdPassageiros = new javax.swing.JTextField();
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
		labelCor = new javax.swing.JLabel();
		cxCor = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		rotCadPes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		rotCadPes.setText("PASSEIO - Cadastrar");

		labelQtdPassageiros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		labelQtdPassageiros.setText("Quant. Passageiros");

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

		labelCor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		labelCor.setText("Cor");

		cxCor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(145, 145, 145).addComponent(labelMarca)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 238,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								layout.createSequentialGroup().addGap(56, 56, 56)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(layout
														.createSequentialGroup()
														.addGroup(layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(labelQtdRodas).addComponent(labelModelo)
																.addComponent(labelVelocidadeMaxima).addComponent(
																		labelQtdPistoes)
																.addComponent(labelPotencia).addComponent(labelCor))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(cxModelo,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 238,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		false)
																		.addComponent(
																				cxPotencia,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				120, Short.MAX_VALUE)
																		.addComponent(
																				cxQtdPistoes,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(cxVelocidadeMaxima,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				cxQtdRodas,
																				javax.swing.GroupLayout.Alignment.LEADING))
																.addComponent(cxCor,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 238,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(labelPlaca)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(cxPlaca,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 120,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup()
																.addComponent(labelQtdPassageiros)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		cxQtdPassageiros,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 120,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout.createSequentialGroup().addComponent(btCadastrar)
														.addGap(18, 18, 18)
														.addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE,
																89, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btNovo)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(btSair).addGap(10, 10, 10))))
						.addGroup(layout.createSequentialGroup().addGap(139, 139, 139).addComponent(rotCadPes)))
				.addContainerGap(64, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(16, 16, 16).addComponent(rotCadPes).addGap(23, 23, 23)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelQtdPassageiros)
								.addComponent(cxQtdPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelPlaca).addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelMarca).addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelModelo)
								.addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(14, 14, 14)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCor).addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelQtdRodas).addComponent(cxQtdRodas,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelVelocidadeMaxima)
								.addComponent(cxVelocidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelQtdPistoes)
								.addComponent(cxQtdPistoes, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelPotencia)
								.addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(40, 40, 40)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btCadastrar).addComponent(btLimpar).addComponent(btSair)
								.addComponent(btNovo))
						.addContainerGap(46, Short.MAX_VALUE)));
		habilitarCampos(false);
		pack();
		setLocationRelativeTo(null);
	}

	private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
		sair();
	}

	private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {
		limpar();
	}

	private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		inserirPasseio();
		habilitarCampos(false);
	}

	private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {
		limpar();
		habilitarCampos(true);
	}

	public void inserirPasseio() {
		try {
			BDVeiculos.getInstance().placaVeiculoExisteCadastrada(cxPlaca.getText());

			passeio = new Passeio();
			passeio.setPlaca(cxPlaca.getText());
			passeio.setMarca(cxMarca.getText());
			passeio.setModelo(cxModelo.getText());
			passeio.setCor(cxCor.getText());
			passeio.setQtdRodas(Integer.parseInt(cxQtdRodas.getText()));
			passeio.getMotor().setQtdPist(Integer.parseInt(cxQtdPistoes.getText()));
			passeio.getMotor().setPotencia(Integer.parseInt(cxPotencia.getText()));
			passeio.setQtdPassageiros(Integer.parseInt(cxQtdPassageiros.getText()));
			passeio.setVelocMax(Float.parseFloat(cxVelocidadeMaxima.getText()));

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
				passeio.setVelocMax(100);
			} catch (VelocException e1) {
				e1.printStackTrace();
			}
		}
		
		BDVeiculos.getInstance().getListaPasseio().add(passeio);			
		JOptionPane.showMessageDialog(null,
				"Veiculo passeio placa: " + passeio.getPlaca().toUpperCase() + " incluido com sucesso!",
				"Confirmacao de cadastro", 1);
		
		

	}

	public void sair() {
		int resp = JOptionPane.showConfirmDialog(null, "Deseja sair", "Saida do Sistema", JOptionPane.YES_NO_OPTION);
		if (resp == 0) {
			dispose();
		}
	}

	public void limpar() {
		cxPlaca.setText("");
		cxMarca.setText("");
		cxModelo.setText("");
		cxCor.setText("");
		cxVelocidadeMaxima.setText("");
		cxPotencia.setText("");
		cxQtdRodas.setText("");
		cxQtdPassageiros.setText("");
		cxQtdPistoes.setText("");

		cxQtdPassageiros.requestFocus();
	}
	
	public void habilitarCampos(Boolean habilitar) {
		cxPlaca.setEditable(habilitar);
		cxMarca.setEditable(habilitar);
        cxModelo.setEditable(habilitar);
        cxCor.setEditable(habilitar);
        cxVelocidadeMaxima.setEditable(habilitar);
        cxPotencia.setEditable(habilitar);
        cxQtdRodas.setEditable(habilitar);
        cxQtdPassageiros.setEditable(habilitar);
        cxQtdPistoes.setEditable(habilitar);
        
        btCadastrar.setEnabled(habilitar);
	}

}
