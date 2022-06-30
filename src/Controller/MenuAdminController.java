/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AcervoBiblioteca;
import View.AdicionarLivro;
import View.AgendamentosAdmin;
import View.MenuAdmin;
import View.MenuPrincipal;
import View.ModificarPreco;
import View.RemoverLivro;


/**
 *
 * @author Reinan
 */
public class MenuAdminController {
    
    private final MenuAdmin view;

    public MenuAdminController(MenuAdmin view) {
        this.view = view;
    }
    
     public void acessarAdicionarLivro(){
        AdicionarLivro acervo = new AdicionarLivro();
            acervo.setVisible(true);
            
            
    }

    public void navegarPraAgenda() {
       
        MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
            
    }
    
    public void acessarRemoverLivro(){
        RemoverLivro acervo = new RemoverLivro();
            acervo.setVisible(true);
            
            
    }
    
     public void acessarModificarLivro(){
        ModificarPreco acervo = new ModificarPreco();
            acervo.setVisible(true);
            
            
    }
     public void agendamentos(){
         AgendamentosAdmin agenda = new AgendamentosAdmin();
         agenda.setVisible(true);
     }
    
    
}
