package campominado.jogo;

import java.util.ArrayList;
import java.util.List;

public class CampoMinado {

    private boolean fimDeJogo = false;
    
    public enum ItemCampo{VAZIO,BOMBA};
    
    public List<ItemCampo> campo;
    
    private int placar = 0;
    private static final int QTDE = 25;

    public CampoMinado() {
        this.campo = new ArrayList<ItemCampo>();
        for(int i = 0; i <QTDE; i++){
            campo.add(ItemCampo.VAZIO);
        }
        int posicaoBomba = (int) (Math.random()*QTDE);
        campo.set(posicaoBomba, ItemCampo.BOMBA);
        
    }

    public ItemCampo getItem(int posicao){
        ItemCampo item = campo.get(posicao);
        if(item.equals(ItemCampo.BOMBA)){
            fimDeJogo = true;
        }else{
            placar++;
        }
        return item;
    }

    public boolean isFimDeJogo() {
        return fimDeJogo;
    }
    
    

    public int getPlacar() {
        return placar;
    }
    
    
    
    
    

    
}
