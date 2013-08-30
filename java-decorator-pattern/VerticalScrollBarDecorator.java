// the first concrete decorator which adds vertical scrollbar functionality
class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
    }
 
    public void draw() {
        decoratedWindow.draw();
        drawVerticalScrollBar();
    }
 
    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar
        System.out.println("Drawing Vertical Scroll Bar...");
    }
 
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }
}
