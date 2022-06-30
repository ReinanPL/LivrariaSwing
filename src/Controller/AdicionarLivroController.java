
package Controller;

import Controller.Helper.AdicionarLivroHelper;
import Model.DAO.MangaDAO;
import Model.Manga;
import View.AdicionarLivro;
import View.MenuAdmin;


public class AdicionarLivroController {

    private final AdicionarLivro view;
    private final AdicionarLivroHelper helper;

    public AdicionarLivroController(AdicionarLivro view) {
        this.view = view;
        this.helper = new AdicionarLivroHelper(view);
    }

    
    
    public void inserirManga(){
        //buscar objeto agendamento da tela
        Manga livro = helper.obterModelo();
        //salvar objeto no banco de dados
        new MangaDAO().insert(livro);
        
        view.exibeMensagem("Livro adicionado com sucesso");
  
        helper.limparTela();
        
    }
    
    public void voltarMenu(){
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.view.dispose();
    }
    
}
