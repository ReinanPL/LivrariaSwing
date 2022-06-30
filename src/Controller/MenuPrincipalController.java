/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AcervoBiblioteca;
import View.AgendamentoTela;
import View.LoginAdmin;
import View.MenuPrincipal;

/**
 *
 * @author Reinan
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
     public void acervoBiblioteca(){
        AcervoBiblioteca acervo = new AcervoBiblioteca();
        acervo.setVisible(true);
        
            
    }
     public void menuLoginAdmin(){
        LoginAdmin login = new LoginAdmin();
        login.setVisible(true);
        this.view.dispose();
     }
     
     public void agendamento(){
         AgendamentoTela agenda = new AgendamentoTela();
         agenda.setVisible(true);
     }
    
}
