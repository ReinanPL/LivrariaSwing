/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import static Model.DAO.Banco.lista;
import Model.Manga;
import java.util.ArrayList;

/**
 *
 * @author Reinan
 */
public class MangaDAO {
    
     public Manga verifica(int id) {
   for  (Manga u : lista) {
      if (u.getId() == id) {
         return u;
      }
   }
   return null;
}
     
     public  boolean setPreco(int id, double preco) {
        Manga lista = verifica(id);
        if (lista != null) {
            lista.setPreco(preco);
            return true;
        }
        return false;
    }
    
   
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param agendamento exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Manga lista){
          
        if(lista.getId() == 0){
            lista.setId(proximoId());
            Banco.lista.add(lista);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendamento
     * @return 
     */
    public boolean update(Manga lista){
        
        for (int i = 0; i < Banco.lista.size(); i++) {
            if(idSaoIguais(Banco.lista.get(i),lista)){
                Banco.lista.set(i, lista);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendamento
     * @return 
     */
    public boolean delete(Manga lista){
        for (Manga mangaLista : Banco.lista) {
            if(idSaoIguais(mangaLista,lista)){
                Banco.lista.remove(mangaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Manga> selectAll(){
        return Banco.lista;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param agendamento
     * @param agendamentoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Manga lista, Manga agendamentoAComparar) {
        return lista.getId() ==  agendamentoAComparar.getId();
    }
    
    
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Manga lista : Banco.lista) {           
           int id = lista.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
