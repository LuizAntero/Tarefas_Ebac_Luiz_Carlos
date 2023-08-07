/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication1.DAO;

import java.util.Collection;
import javaapplication1.domain.Cliente;

/**
 *
 * @author DELL
 */
public interface IClienteDAO {
    public boolean cadastrar(Cliente cliente);
    public Cliente excluir (Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar (Long cpf);
    public Collection<Cliente> buscarTodos();
}
