/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javaapplication1.domain.Cliente;

/**
 *
 * @author DELL
 */
public class ClienteMapDAO implements IClienteDAO{
    //vamos salvar todos os cadastros no Map
    private Map<Long, Cliente> map;

    public ClienteMapDAO (){
        this.map = new HashMap<>();
    }

    //método cadastrar. verifica se já existe o cpf. Se não ele cadastra (true)
    @Override
    public boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    //método excluir. Se o cliente cadastrado existe (!=null), aplicamos o remove com chave e objeto
    @Override
    public Cliente excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
        return clienteCadastrado;
    }

    //método alterar. O objeto cliente (da classe Cliente) vem do usuário e
    //o objeto clienteCadastrado também da classe Cliente vai acessar os dados do map
    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    //método consultar. Retorna os dados do cadastro pelo cpf
    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    //método para pegar todos os valores do map. O values tem essa função de retornar uma coleção.
    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
