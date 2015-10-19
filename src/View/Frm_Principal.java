/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Fabricante;
import Model.Fornecedor;
import Model.Grupo;
import Model.Inventario;
import Model.NCM;
import Model.Produto;
import Util.Classes.Conexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frm_Principal extends javax.swing.JFrame {

    private Statement st1;
    private Statement st2;
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    List<Cliente> clientes = new ArrayList<>();
    static List<Fabricante> fabricantes = new ArrayList<>();
    static List<Fornecedor> fornecedores = new ArrayList<>();
    static List<NCM> ncms = new ArrayList<>();
    static List<Grupo> grupos = new ArrayList<>();
    static List<Inventario> inventarios = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    Conexao conexao;

    public Frm_Principal() {
        initComponents();
        conexao = new Conexao();
        chx_estoque.setEnabled(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        validaChxEstoque();
        parametrosTeste();
    }

    public void parametrosTeste() {
        txt_diretorioOrigem.setText("C:\\Users\\Tadeu-\\Desktop\\Ferramentas e CIA\\Banco\\FCia.FDB");
        txt_usuarioOrigem.setText("SYSDBA");
        txt_senhaOrigem.setText("masterkey");
        txt_diretorioDestino.setText("C:\\Users\\Tadeu-\\Desktop\\Novo\\Resulth.FB");
        txt_usuarioDestino.setText("SYSDBA");
        txt_senhaDestino.setText("masterkey");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_diretorioOrigem = new javax.swing.JTextField();
        btn_buscarOrigem = new javax.swing.JButton();
        txt_usuarioOrigem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_senhaOrigem = new javax.swing.JPasswordField();
        btn_testarOrigem = new javax.swing.JButton();
        msg1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_diretorioDestino = new javax.swing.JTextField();
        btn_buscarDestino = new javax.swing.JButton();
        txt_usuarioDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_senhaDestino = new javax.swing.JPasswordField();
        txt_testarDestino = new javax.swing.JButton();
        msg2 = new javax.swing.JLabel();
        pnl_dados = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        chx_clientes = new javax.swing.JCheckBox();
        chx_fornecedores = new javax.swing.JCheckBox();
        chx_produtos = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        chx_estoque = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_filial = new javax.swing.JFormattedTextField();
        txt_data = new javax.swing.JFormattedTextField();
        btn_converter = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_log = new javax.swing.JTextArea();
        qtdeClientes = new javax.swing.JLabel();
        qtdeFornecedores = new javax.swing.JLabel();
        qtdeProdutos = new javax.swing.JLabel();
        qtdeErros = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor 1.0");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco Origem"));

        jLabel1.setText("Diretório *:");

        btn_buscarOrigem.setText("...");
        btn_buscarOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarOrigemActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuário *:");

        jLabel3.setText("Senha *:");

        btn_testarOrigem.setText("Testar");
        btn_testarOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarOrigemActionPerformed(evt);
            }
        });

        msg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_usuarioOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_senhaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_diretorioOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btn_buscarOrigem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_testarOrigem)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_diretorioOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarOrigem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuarioOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_senhaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_testarOrigem))
                    .addComponent(msg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco Destino"));

        jLabel4.setText("Diretório *:");

        btn_buscarDestino.setText("...");
        btn_buscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarDestinoActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuário *:");

        jLabel6.setText("Senha *:");

        txt_testarDestino.setText("Testar");
        txt_testarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_testarDestinoActionPerformed(evt);
            }
        });

        msg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_usuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_senhaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_diretorioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btn_buscarDestino)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_testarDestino)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_diretorioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txt_senhaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_testarDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnl_dados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        chx_clientes.setText("Clientes");

        chx_fornecedores.setText("Fornecedores");

        chx_produtos.setText("Produtos");
        chx_produtos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chx_produtosItemStateChanged(evt);
            }
        });

        chx_estoque.setText("Estoque");
        chx_estoque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chx_estoqueItemStateChanged(evt);
            }
        });

        jLabel8.setText("Filial *:");

        jLabel7.setText("Data *:");

        try {
            txt_filial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_filial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            txt_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_converter.setText("Converter");
        btn_converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_converterActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chx_clientes)
                            .addComponent(chx_fornecedores)
                            .addComponent(chx_produtos)
                            .addComponent(chx_estoque))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_filial)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_converter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chx_clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chx_fornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chx_produtos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chx_estoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_filial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_converter)
                    .addComponent(btn_limpar))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_log.setEditable(false);
        txt_log.setColumns(20);
        txt_log.setRows(5);
        jScrollPane1.setViewportView(txt_log);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        qtdeClientes.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        qtdeClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtdeClientes.setText("0");

        qtdeFornecedores.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        qtdeFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtdeFornecedores.setText("0");

        qtdeProdutos.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        qtdeProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtdeProdutos.setText("0");

        qtdeErros.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        qtdeErros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtdeErros.setText("0");

        jLabel9.setText("Clientes:");

        jLabel12.setText("Fornecedores:");

        jLabel14.setText("Produtos:");

        jLabel16.setText("Erros:");

        javax.swing.GroupLayout pnl_dadosLayout = new javax.swing.GroupLayout(pnl_dados);
        pnl_dados.setLayout(pnl_dadosLayout);
        pnl_dadosLayout.setHorizontalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdeErros, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnl_dadosLayout.setVerticalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtdeClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtdeFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtdeProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(qtdeErros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        barra.setForeground(new java.awt.Color(0, 153, 153));
        barra.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_dados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        limpar();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_buscarOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarOrigemActionPerformed
        buscaDiretorio(txt_diretorioOrigem);
    }//GEN-LAST:event_btn_buscarOrigemActionPerformed

    private void btn_buscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarDestinoActionPerformed
        buscaDiretorio(txt_diretorioDestino);
    }//GEN-LAST:event_btn_buscarDestinoActionPerformed

    private void btn_testarOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarOrigemActionPerformed
        validaCampos(txt_diretorioOrigem, txt_usuarioOrigem, txt_senhaOrigem, 1);
    }//GEN-LAST:event_btn_testarOrigemActionPerformed

    private void txt_testarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_testarDestinoActionPerformed
        validaCampos(txt_diretorioDestino, txt_usuarioDestino, txt_senhaDestino, 2);
    }//GEN-LAST:event_txt_testarDestinoActionPerformed

    private void chx_estoqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chx_estoqueItemStateChanged
        validaChxEstoque();
    }//GEN-LAST:event_chx_estoqueItemStateChanged

    private void btn_converterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_converterActionPerformed
        st1 = conexao.getConexao("localhost", txt_diretorioOrigem.getText(),
                txt_usuarioOrigem.getText(), txt_senhaOrigem.getText());
        st2 = conexao.getConexao("localhost", txt_diretorioDestino.getText(),
                txt_usuarioDestino.getText(), txt_senhaDestino.getText());
        setEnabledFields(false);
        zerarContadores();
        converte();
    }//GEN-LAST:event_btn_converterActionPerformed

    private void chx_produtosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chx_produtosItemStateChanged
        if (chx_produtos.isSelected() == true) {
            chx_estoque.setEnabled(true);
        } else {
            chx_estoque.setSelected(false);
            chx_estoque.setEnabled(false);
        }
    }//GEN-LAST:event_chx_produtosItemStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton btn_buscarDestino;
    private javax.swing.JButton btn_buscarOrigem;
    private javax.swing.JButton btn_converter;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_testarOrigem;
    private javax.swing.JCheckBox chx_clientes;
    private javax.swing.JCheckBox chx_estoque;
    private javax.swing.JCheckBox chx_fornecedores;
    private javax.swing.JCheckBox chx_produtos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    private javax.swing.JPanel pnl_dados;
    private javax.swing.JLabel qtdeClientes;
    private javax.swing.JLabel qtdeErros;
    private javax.swing.JLabel qtdeFornecedores;
    private javax.swing.JLabel qtdeProdutos;
    private javax.swing.JFormattedTextField txt_data;
    private javax.swing.JTextField txt_diretorioDestino;
    private javax.swing.JTextField txt_diretorioOrigem;
    private javax.swing.JFormattedTextField txt_filial;
    private javax.swing.JTextArea txt_log;
    private javax.swing.JPasswordField txt_senhaDestino;
    private javax.swing.JPasswordField txt_senhaOrigem;
    private javax.swing.JButton txt_testarDestino;
    private javax.swing.JTextField txt_usuarioDestino;
    private javax.swing.JTextField txt_usuarioOrigem;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        chx_clientes.setSelected(false);
        chx_produtos.setSelected(false);
        chx_estoque.setSelected(false);
        chx_fornecedores.setSelected(false);
        txt_data.setText(null);
        txt_filial.setText(null);
    }

    private void buscaDiretorio(JTextField diretorio) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
        } else {
            String file = fileChooser.getSelectedFile().getPath();
            diretorio.setText(file);
        }
    }

    private void validaCampos(JTextField diretorio, JTextField usuario, JPasswordField senha, int tipo) {
        if (diretorio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Diretório inválido!");
            diretorio.requestFocus();
        } else {
            if (usuario.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuário inválido!");
                usuario.requestFocus();
            } else {
                if (senha.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Senha inválida!");
                    senha.requestFocus();
                } else {
                    if (tipo == 1) {
                        testarConexao(diretorio.getText(), usuario.getText(), senha.getText(), msg1);
                    }
                    if (tipo == 2) {
                        testarConexao(diretorio.getText(), usuario.getText(), senha.getText(), msg2);
                    }
                }
            }
        }
    }

    private void testarConexao(String diretorio, String usuario, String senha, JLabel msg) {
        Thread acao;
        acao = new Thread(new Runnable() {
            @Override
            public void run() {
                if (conexao.getConexao("localhost", diretorio, usuario, senha) != null) {
                    try {
                        msg.setText("Conexão bem sucedida!");
                        msg.setForeground(Color.BLUE);
                        Thread.sleep(3000);
                        msg.setText(null);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                } else {
                    try {
                        msg.setText("Falha ao conectar no banco de dados!");
                        msg.setForeground(Color.RED);
                        Thread.sleep(3000);
                        msg.setText(null);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Frm_Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        acao.start();
    }

    private void validaChxEstoque() {
        if (chx_estoque.isSelected() == true) {
            txt_filial.setEnabled(true);
            txt_data.setEnabled(true);
        } else {
            txt_filial.setText(null);
            txt_data.setText(null);
            txt_data.setEnabled(false);
            txt_filial.setEnabled(false);
        }
    }

    private void setEnabledFields(boolean status) {
        txt_diretorioOrigem.setEnabled(status);
        txt_usuarioOrigem.setEnabled(status);
        txt_senhaOrigem.setEnabled(status);
        txt_diretorioDestino.setEnabled(status);
        txt_usuarioDestino.setEnabled(status);
        txt_senhaDestino.setEnabled(status);
        txt_log.setText(null);
    }

    private void zerarContadores() {
        qtdeClientes.setText(0 + "");
        qtdeFornecedores.setText(0 + "");
        qtdeProdutos.setText(0 + "");
        qtdeErros.setText(0 + "");
    }

    private String trataCamposByQtde(int tamanho, String grupo) {
        String retorno = grupo;
        while (retorno.length() < tamanho) {
            retorno = "0" + retorno;
        }
        return retorno;
    }

    private void converte() {
        Thread acao;
        acao = new Thread(new Runnable() {
            @Override
            public void run() {
                listaTodos();
                insereTodos();
            }
        });
        acao.start();
    }

    private void listaClientes() {
        try {
            st1.executeUpdate("update cliente c set c.NOME=replace(replace(c.NOME,'ç','c'),'Ç','C')");
            st1.executeUpdate("update cli_ende e set e.NRO=replace(e.NRO,'º','');");
            st1.executeUpdate("UPDATE CLI_ENDE e set e.nro='0' where e.nro is null or e.nro='';");
            st1.executeUpdate("UPDATE CLI_COMP e set e.rg='' WHERE e.rg is null;");
            st1.executeUpdate("UPDATE CLI_COMP e set e.ie='ISENTO' WHERE e.ie is null;");
            rs = st1.executeQuery("select\n"
                    + "                    c.cliente codcliente,\n"
                    + "                    left(c.pessoa,1) pessoa_FJ,\n"
                    + "                    left(c.cpf,18)cgccpf,\n"
                    + "                    left(c.nome,60) nome,\n"
                    + "                    left(l.email,60) email,\n"
                    + "                    left(l.rg,20) campolivre1,\n"
                    + "                    left(l.ie,15) inscest, \n"
                    + "                    left(e.cep,8) cep, \n"
                    + "                    left(e.nro,5) numeronfe,\n"
                    + "                    right(e.endereco,60) endereco\n"
                    + "                    from cliente c\n"
                    + "                    inner join CLI_COMP l on c.cliente=l.cliente\n"
                    + "                    inner join CLI_ENDE e on c.cliente=e.cliente\n"
                    + "                    where c.status ='A' and c.cpf <>''");
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodCliente(trataCamposByQtde(8, rs.getString("codcliente")));
                c.setPessoa_FJ(rs.getString("pessoa_FJ"));
                c.setCgccpf(rs.getString("cgccpf"));
                c.setCampolivre1(rs.getString("campolivre1"));
                c.setEmail(rs.getString("email"));
                c.setNome(rs.getString("nome"));
                c.setInscest(rs.getString("inscest"));
                c.setEndereco(rs.getString("endereco").replace("'", ""));
                c.setCep(rs.getString("cep"));
                c.setNumeronfe(rs.getString("numeronfe"));
                c.setEndereconfe(rs.getString("endereco").replace("'", ""));
                c.setAtivo("S");
                clientes.add(c);
                qtdeClientes.setText(Integer.parseInt(qtdeClientes.getText()) + 1 + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar os clientes!\n" + e);
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void listaFornecedores() {
        try {
            rs = st1.executeQuery("");
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedores.add(fornecedor);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar os Fornecedores!\n" + e);
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void listaProdutos() {
        try {
            st1.executeUpdate("UPDATE PRODUTO P SET P.NOME=REPLACE(REPLACE(P.NOME,'Ç','C'),'ç','c');");
            rs = st1.executeQuery("select\n"
                    + "                    left(p.produto,6) codprod,\n"
                    + "                    p.grupo codgrupo,right(p.nome,50) descricao, right(p.marca,50) campolivre3,right(p.volume,6) unidadeent,\n"
                    + "                    right(f.volume,6) unidadesaida,right(f.cst,3) codtribut00,right(p.ncm,8) campolivre1,f.vrvend preco\n"
                    + "                    from produto p\n"
                    + "                    inner join produtofisco f on p.produto=f.produto");
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodprod(trataCamposByQtde(6, rs.getString("codprod")));
                produto.setCodgrupo(trataCamposByQtde(3, rs.getString("codgrupo")));
                produto.setDescricao(rs.getString("descricao"));
                if (rs.getString("campolivre3") != null) {
                    produto.setCampolivre3(rs.getString("campolivre3"));
                } else {
                    produto.setCampolivre3("");
                }
                produto.setUnidadeent(rs.getString("unidadeent"));
                produto.setUnidadesaida(rs.getString("unidadesaida"));
                produto.setCodtribut00(rs.getString("codtribut00"));
                produto.setCampolivre1(rs.getString("campolivre1"));
                produto.setPreco(Double.parseDouble(rs.getString("preco")) + "");
                produtos.add(produto);
                qtdeProdutos.setText(Integer.parseInt(qtdeProdutos.getText()) + 1 + "");
            }
        } catch (Exception e) {
            txt_log.append("Erro ao listar os produtos: " + e.getMessage() + "\n");
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void listaGrupos() {
        try {
            rs = st1.executeQuery("select g.grupo codgrupo,g.nome descricao from grupo g");
            while (rs.next()) {
                Grupo grupo = new Grupo();
                grupo.setCodgrupo(trataCamposByQtde(3, rs.getString("codgrupo")));
                grupo.setDescricao(rs.getString("descricao"));
                grupos.add(grupo);
            }
        } catch (Exception e) {
            txt_log.append("Erro ao listar os grupos: " + e.getMessage() + "\n");
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void listarFabricantes() {
        try {
            int codfabric = 1;
            rs = st1.executeQuery("select distinct(p.MARCA) descricao from produto p where p.MARCA<>''");
            while (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.setCodfabric(trataCamposByQtde(5, codfabric + ""));
                fabricante.setDescricao(rs.getString("descricao"));
                fabricantes.add(fabricante);
                codfabric++;
            }
        } catch (Exception e) {
            txt_log.append("Erro ao listar os fabricantes: " + e.getMessage() + "\n");
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void listaNCMS() {
        try {
            int codclasfis = 1;
            rs = st1.executeQuery("select distinct(p.ncm) codigoncm from produto p where char_length(p.ncm)=8");
            while (rs.next()) {
                NCM ncm = new NCM();
                ncm.setCodclasfis(trataCamposByQtde(4, codclasfis + ""));
                ncm.setCodigoncm(rs.getString("codigoncm"));
                ncms.add(ncm);
                codclasfis++;
            }
        } catch (Exception e) {
            txt_log.append("Erro ao listar os ncms: " + e.getMessage() + "\n");
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void listaEstoque() {
        try {
            rs = st1.executeQuery("select\n"
                    + "f.produto codprod, f.qtdestoque quantidade,'00' codempresa,\n"
                    + "'02.10.2015' datainv,'02102015' documento,'N' processado,\n"
                    + "'ADMIN' usuario,'002' codcausa,'0000' codgrade,'0.000' precocusto\n"
                    + "from produtofisco f");
            while (rs.next()) {
                Inventario inventario = new Inventario();
                inventario.setCodprod(rs.getString("codprod"));
                inventario.setQuantidade(rs.getString("qtde"));
                inventario.setCodEmpresa(rs.getString("codempresa"));
                inventario.setDataInv(rs.getString("datainv"));
                inventario.setDocumento(rs.getString("documento"));
                inventario.setProcessado(rs.getString("processado"));
                inventario.setUsuario(rs.getString("usuario"));
                inventario.setCodcausa(rs.getString("codcausa"));
                inventario.setCodgrade(rs.getString("codgrade"));
                inventario.setPrecocusto(rs.getString("precocusto"));
                inventarios.add(inventario);
            }
        } catch (Exception e) {
            txt_log.append("Erro ao listar os estoques: " + e.getMessage() + "\n");
            qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
        }
    }

    private void insereClientes() {
        for (Cliente cliente : clientes) {
            try {
                st2.executeUpdate("DELETE FROM CLIENTE C WHERE C.CODCLIENTE<>'00000000';");
                st2.executeUpdate("DELETE FROM COMPCLIE C WHERE C.CODCLIENTE<>'00000000';");
                st2.executeUpdate("INSERT INTO CLIENTE (CODCLIENTE,NOME,CGCCPF,INSCEST,PESSOA_FJ,"
                        + "CEP,ENDERECO,ATIVO) VALUES("
                        + "'" + cliente.getCodCliente() + "',"
                        + "'" + cliente.getNome() + "',"
                        + "'" + cliente.getCgccpf() + "',"
                        + "'" + cliente.getInscest().replace("-", "").replace(".", "") + "',"
                        + "'" + cliente.getPessoa_FJ() + "',"
                        + "'" + cliente.getCep() + "',"
                        + "'" + cliente.getEndereco() + "',"
                        + "'" + cliente.getAtivo() + "'"
                        + ");");
                st2.executeUpdate("INSERT INTO COMPCLIE (CODCLIENTE,ENDERECONFE,NUMERONFE) VALUES("
                        + "'" + cliente.getCodCliente() + "',"
                        + "'" + cliente.getEndereconfe() + "',"
                        + "'" + cliente.getNumeronfe() + "'"
                        + ");");
                barra.setValue(barra.getValue() + 1);
            } catch (Exception e) {
                txt_log.append("Erro ao inserir o cliente:" + cliente.getCodCliente() + " " + e.getMessage() + "\n");
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }

    }

    private void insereFornecedor() {
        for (Fornecedor fornecedor : fornecedores) {
            try {

            } catch (Exception e) {
                txt_log.append("Erro ao inserir o fornecedor: " + fornecedor.getCodFornecedor() + "\n" + e);
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }
    }

    private void insereProdutos() {
        for (Produto produto : produtos) {
            try {
                st2.executeUpdate("DELETE FROM PRODUTODETALHE;");
                st2.executeUpdate("DELETE FROM PRODUTO;");
                st2.executeUpdate("INSERT INTO PRODUTO (CODPROD,DESCRICAO,CODGRUPO,CAMPOLIVRE3,"
                        + "UNIDADEENT,UNIDADESAIDA,CODTRIBUT00,CAMPOLIVRE1,PRECO) VALUES ("
                        + "'" + produto.getCodprod() + "',"
                        + "'" + produto.getDescricao().replace("'", "").replace("''", "").replace("ç", "c") + "',"
                        + "'" + produto.getCodgrupo() + "',"
                        + "'" + produto.getCampolivre3() + "',"
                        + "'" + produto.getUnidadeent() + "',"
                        + "'" + produto.getUnidadesaida() + "',"
                        + "'" + produto.getCodtribut00() + "',"
                        + "'" + produto.getCampolivre1() + "',"
                        + "'" + produto.getPreco() + "'"
                        + ");");
                st2.executeUpdate("INSERT INTO PRODUTODETALHE (CODPROD,PIS_CST,COFINS_CST,PISENT_CST,COFINSENT_CST,"
                        + "ALIQPIS,ALIQCOFINS,ALIQPISENT,ALIQCOFINSENT) VALUES ("
                        + "'" + produto.getCodprod() + "',"
                        + "'49',"
                        + "'49',"
                        + "'99',"
                        + "'99',"
                        + "0,"
                        + "0,"
                        + "0,"
                        + "0"
                        + ");");
                barra.setValue(barra.getValue() + 1);
            } catch (Exception e) {
                txt_log.append("Erro ao Inserir o produto: " + produto.getCodprod() + "\n" + e + "\n");
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }
        insereGrupo();
    }

    private void insereGrupo() {
        for (Grupo grupo : grupos) {
            try {
                st2.executeUpdate("INSERT INTO GRUPPROD (CODGRUPO,DESCRICAO) VALUES ('"+
                        grupo.getCodgrupo()+"','"+grupo.getDescricao()+"';");
            } catch (Exception e) {
                txt_log.append("Erro ao Inserir o grupo: " + grupo.getCodgrupo() + "\n" + e + "\n");
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }
    }

    private void insereEstoque() {
        for (Inventario inventario : inventarios) {
            try {

            } catch (Exception e) {
                txt_log.append("Erro ao Inserir o produto no estoque: " + inventario.getCodprod() + "\n" + e);
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }
    }

    private void insereFabricantes() {
        for (Fabricante fabricante : fabricantes) {
            try {

            } catch (Exception e) {
                txt_log.append("Erro ao Inserir o Fabricantes: " + fabricante.getCodfabric() + "\n" + e + "\n");
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }
    }

    private void insereNCMs() {
        for (NCM ncm : ncms) {
            try {
                st2.executeUpdate("INSERT CLASFISC (CODCLASFIS,CODIGONCM,CODNBM) VALUES ('"
                        +ncm.getCodclasfis()+"','"+ncm.getCodigoncm()+"','"+ncm.getCodigoncm()+"';");
            } catch (Exception e) {
                txt_log.append("Erro ao Inserir o NCM: " + ncm.getCodigoncm() + "\n" + e + "\n");
                qtdeErros.setText(Integer.parseInt(qtdeErros.getText()) + 1 + "");
            }
        }
    }

    private void listaTodos() {
        if (chx_clientes.isSelected()) {
            listaClientes();
        }
        if (chx_fornecedores.isSelected()) {
            listaFornecedores();
        }
        if (chx_produtos.isSelected()) {
            listaGrupos();
            listaNCMS();
            listarFabricantes();
            listaProdutos();
            if (chx_estoque.isSelected()) {
                listaEstoque();
            }
        }
        barra.setMaximum(Integer.parseInt(qtdeClientes.getText()) + Integer.parseInt(qtdeFornecedores.getText()) + Integer.parseInt(qtdeProdutos.getText()));
    }

    private void insereTodos() {
        barra.setMaximum(Integer.parseInt(qtdeClientes.getText())
                + Integer.parseInt(qtdeFornecedores.getText())
                + Integer.parseInt(qtdeProdutos.getText()));
        if (Integer.parseInt(qtdeClientes.getText()) > 0) {
            insereClientes();
        }
        if (Integer.parseInt(qtdeFornecedores.getText()) > 0) {
            insereFornecedor();
        }
        if (Integer.parseInt(qtdeProdutos.getText()) > 0) {
            insereProdutos();
            insereGrupo();
            insereNCMs();
            insereFabricantes();
            if (chx_estoque.isSelected()) {
                insereEstoque();
            }
        }
        barra.setValue(barra.getValue() + 1);
    }

}
