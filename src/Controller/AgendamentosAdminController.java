/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendamentosAdminHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.AgendamentosAdmin;
import View.MenuAdmin;
import java.util.ArrayList;

/**
 *
 * @author Reinan
 */
public class AgendamentosAdminController {
     private final AgendamentosAdmin view;
    private final AgendamentosAdminHelper helper;

    

    public AgendamentosAdminController(AgendamentosAdmin view) {
        this.view = view;
        this.helper = new AgendamentosAdminHelper(view);
    }
    
    public void atualizarTabelaAgendamentos(){
        //Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agenda = new AgendamentoDAO();
        ArrayList<Agendamento> agendamento = agenda.selectAll();
        
        helper.preecherTabela(agendamento);
    }
    
    public void voltarMenu(){
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.view.dispose();
    }
    
}
