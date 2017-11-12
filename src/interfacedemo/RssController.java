package interfacedemo;

import java.util.Vector;

public class RssController {
    RssView view = null;
    RssModel model = null;
    
    public RssController(RssView view, RssModel model) {
        this.view = view;
        this.model = model;
        
        view.addPathHandler(
            (String path) -> {
                try {
                    model.startFetch(path);
                } catch (RssException re) {
                    view.showError(re.getMessage());
                }
            }
        );

        model.addResultHandler(
            (Vector<RssResult> results) -> {
                view.showResults(results);
            }
        );

        model.addErrorHandler(
            (String error) -> {
                view.showError(error);
            }
        );
    }
}