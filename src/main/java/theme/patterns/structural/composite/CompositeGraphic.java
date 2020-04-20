package theme.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private List<Graphic> graphics;

    public CompositeGraphic() {
        this.graphics = new ArrayList<>();
    }

    public void add(Graphic graphic) {
        this.graphics.add(graphic);
    }

    @Override
    public String getName() {
        StringBuilder graphicNames = new StringBuilder();
        graphics.forEach(g -> graphicNames.append(g.getName()).append(" "));
        return graphicNames.toString();
    }
}
