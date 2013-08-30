// the second concrete decorator which adds horizontal scrollbar functionality
class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        decoratedWindow.draw();
        drawHorizontalScrollBar();
    }
 
    private void drawHorizontalScrollBar() {
        System.out.println("Drawing Horizontal Scroll Bar...");
        // draw the horizontal scrollbar
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }
}
