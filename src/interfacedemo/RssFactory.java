package interfacedemo;

public class RssFactory {
    public static RssView getRssView() {
        RssView view = new RssView();
        RssModel model = new RssModel();
        
        RssController controller = new RssController(view, model);
        
        return view;
    }
}
