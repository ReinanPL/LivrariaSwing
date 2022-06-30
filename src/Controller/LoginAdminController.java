/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginAdminHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.LoginAdmin;
import View.MenuAdmin;

/**
 *
 * @author Reinan
 */
public class LoginAdminController {
    
   private final LoginAdmin view;
    private final LoginAdminHelper helper;

    public LoginAdminController(LoginAdmin view) {
        this.view = view;
        this.helper = new LoginAdminHelper(view);
    }
    
     public void entrarNoSistema(){
        //pegar um usuario da view
         Usuario usuario = helper.obterModelo(); 
         //pesquisar um usuario no banco
         UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
         
        if(usuarioAutenticado != null){
        MenuAdmin login = new MenuAdmin();
        login.setVisible(true);
        this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha inválidos");
        }
            
    }
     
     
    
}
