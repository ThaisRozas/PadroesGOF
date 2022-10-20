package src.Iterator_ExemploCanais.Iterator_ExemploCanais;

import java.util.ArrayList;

//O src.Iterator_ExemploCanais.Iterator_ExemploCanais.Canal de Filmes utiliza MATRIZ para adicionar os filmes
public class CanaisFilmes implements AgregadoDeCanais{
	protected Canal[] canais;
	
    public CanaisFilmes() {
        canais = new Canal[5];
        canais[0]=  new Canal("AXN");
        canais[1] = new Canal("CineMAX");
        canais[2] = new Canal("FOX");
        canais[3] = new Canal("FX");
        canais[4] = new Canal("HBO");
    }

	@Override
	public IteradorInterface criarIterator() {
		// TODO Auto-generated method stub
		return new IteradorMatrizDeCanais(canais);
	
	}
 
   
}
