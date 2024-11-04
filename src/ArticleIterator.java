import java.util.ArrayList;
import java.util.List;

public class ArticleIterator {

    private List<ArticleComponent> components = new ArrayList<>();

    private int index = 0;

    public ArticleIterator(List<ArticleComponent> comp){
        this.components = comp;
    }

    public boolean hasNext(){
        return components.size() > index;
    }

    public ArticleComponent next(){
        if(this.hasNext()){
            return components.get(index++);
        }
        return null;
    }
    
}
