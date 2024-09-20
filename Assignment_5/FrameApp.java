import javax.swing.JFrame;


class FrameCreator {
    private JFrame frame;

   
    public FrameCreator() {
        frame = new JFrame("Frame Using Association");
    }

    
    public void setupFrame() {
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}

public class FrameApp {
    public static void main(String[] args) {
    
        FrameCreator frameCreator = new FrameCreator();

        
        frameCreator.setupFrame();
    }
}
