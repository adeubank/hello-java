// implementation of a simple Window without any scrollbars
class SimpleWindow implements Window {
    public void draw() {
        // draw window
        System.out.println("Drawing Simple Window...");
    }
 
    public String getDescription() {
        return "simple window";
    }
}
