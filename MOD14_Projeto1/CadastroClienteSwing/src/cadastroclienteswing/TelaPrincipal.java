/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastroclienteswing;

import javaapplication1.DAO.ClienteMapDAO;
import javaapplication1.DAO.IClienteDAO;
import javaapplication1.domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    //classe que permite colocar os dados dos campos na tabela
    private DefaultTableModel modelo = new DefaultTableModel();
    //instanciando a classe ClienteMapDAO por meio da interface IClienteDAO
    private IClienteDAO clienteDAO = new ClienteMapDAO();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();//método construtor para customizar os componentes da tabela   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemSair = new javax.swing.JMenu();
        jMenuItem1Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Nome.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF: ");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone:");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço:");

        jLabel3.setText("Número:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("Estado:");

        menuItemSair.setText("Opções");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });

        jMenuItem1Sair.setText("Sair");
        jMenuItem1Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1SairActionPerformed(evt);
            }
        });
        menuItemSair.add(jMenuItem1Sair);

        jMenuBar1.add(menuItemSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(Nome)
                            .addGap(18, 18, 18)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(lblCpf)
                            .addGap(12, 12, 12)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jLabel3)
                            .addGap(12, 12, 12)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jLabel5)
                            .addGap(12, 12, 12)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Nome))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblCpf))
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItem1SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1SairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?","Sair",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1SairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         //PEGAR INFORMAÇÃO
         String nome = txtNome.getText();
         String cpf = txtCpf.getText();
         String tel = txtTelefone.getText();
         String end = txtEnd.getText();
         String numero = txtNumero.getText();
         String cidade = txtCidade.getText();
         String estado = txtEstado.getText();
         
         //VALIDAR INFORMAÇÃO
         //condicional do botao salvar(se não é campo válido, retorna a mensagem)
         if(!isCamposValidos(nome,cpf,tel,end, numero, cidade, estado)){
             JOptionPane.showMessageDialog(null,"Existem campos a serem preenchidos",
                     "Atenção",JOptionPane.INFORMATION_MESSAGE);
             //return significa(compilador, não executa o código pra baixo)
             return;             
         }         
         
         //TRATAR NO OJBETO DA CLASSE CLIENTE e clienteDAO (que chama o método cadastrar)
         Cliente cliente = new Cliente(nome, cpf, tel, end, numero, cidade, estado);
         //variável de controle (método) para saber se cadastrado ou não
         Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
         
         //INSERINDO OS DADOS NA TABELA
         if (isCadastrado){
             modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTel(), cliente.getEnd(), cliente.getNumero(),
                 cliente.getCidade(), cliente.getEstado()});
             limparCampos();
         } else {
             JOptionPane.showMessageDialog(null,"Cliente já se encontra cadastrado",
                     "Atenção", JOptionPane.INFORMATION_MESSAGE);
         }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed
    
    //Evento para pegar as informaçãoes que estão na tabela e jogar nos campos
    //ao clicar o mouse sobre a linha, ele seleciona a linha e coleta o dado cpf
    //e chama o médoto consultar lá do ClienteMapDAO
    
    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
       // Compoente inativo
       
       int linhaSelecionada = tabelaClientes.getSelectedRow();
       Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada,1);
       
       
       Cliente cliente = this.clienteDAO.consultar(cpf);
       
       //inserindo os dados nos campos
       if (cliente != null){
           txtNome.setText(cliente.getNome());
           txtCpf.setText(cliente.getCpf().toString());
           txtTelefone.setText(cliente.getTel().toString());
           txtEnd.setText(cliente.getEnd());
           txtNumero.setText(cliente.getNumero().toString());
           txtCidade.setText(cliente.getCidade());
           txtEstado.setText(cliente.getEstado());
       }
       
       
    }//GEN-LAST:event_tabelaClientesMouseClicked
    
    
    //Evento do botão excluir
    //pega a linha selecionada
    //condicional para validar a posição (índice) da linha
    //popup pra confirmação se deseja excluir
    //nova condicional se sim, chamar o método excluir
    //chama o método para remover linha da tabela
    //popup confirmando exclusão
    //limpar campos
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir este cliente?","Cuidado",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
            if (result == JOptionPane.YES_OPTION) {
                
                Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada,1);
                this.clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);
                
                JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }                    
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum cliente selecionado.", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }       
        
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    //Somente para limpar os campos na fase de preenchimento
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEnd.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    //Evento para alterar os dados de um cadastro na memória com base no cpf
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       String nome = txtNome.getText();
       String cpf = txtCpf.getText();
       String telefone = txtTelefone.getText();
       String end = txtEnd.getText();
       String numero = txtNumero.getText();
       String cidade = txtCidade.getText();
       String estado = txtEstado.getText();
       
       if(!isCamposValidos(nome,cpf, telefone, end, numero, cidade, estado)){
             JOptionPane.showMessageDialog(null,"Existem campos a serem preenchidos",
                     "Atenção",JOptionPane.INFORMATION_MESSAGE);
             //return significa(compilador, não executa o código pra baixo)
             return;             
         } 
       
       
       Cliente cliente = new Cliente(nome, cpf,telefone, end, numero, cidade,estado);
       this.clienteDAO.alterar(cliente);
       
       int linhaSelecionada = tabelaClientes.getSelectedRow();
       if (linhaSelecionada != -1){
           modelo.setValueAt(nome,linhaSelecionada,0);
           modelo.setValueAt(cpf,linhaSelecionada,1);
           modelo.setValueAt(telefone, linhaSelecionada,2);
           modelo.setValueAt(end, linhaSelecionada,3);
           modelo.setValueAt(numero,linhaSelecionada,4);
           modelo.setValueAt(cidade,linhaSelecionada,5);
           modelo.setValueAt(estado,linhaSelecionada,6);
           
       }
       JOptionPane.showMessageDialog(null,
               "Cliente atualizado com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
       limparCampos();       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    /**
     * ************************************************************************
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    /**
     * ************************************************************************
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nome;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1Sair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JMenu menuItemSair;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    //Aqui vamos receber um var args (array) de strings (são todos os valores dos campos)
    //método para validar se todos os campos estão nulos ou vazios
    private boolean isCamposValidos(String ...campos) {
        for (String campo: campos){
            if (campos == null || "".equals(campo)){
                return false;
            }            
        }
        return true;
    }

    //método para pegar os componentes da classe modelo e associar a nossa tabelaClientes
    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Telefone");
        modelo.addColumn("Endereço");
        modelo.addColumn("Número");
        modelo.addColumn("Cidade");
        modelo.addColumn("Estado");
        
        tabelaClientes.setModel(modelo);
    }
    
    //método para limpar os campos após click em btnSalvar
    private void limparCampos(){
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEnd.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
    }
}
