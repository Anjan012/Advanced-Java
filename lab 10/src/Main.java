import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private String selectedShape = "";

    // Custom panel for drawing
    class ShapeCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth();
            int h = getHeight();
            int size = Math.min(w, h) / 2;
            int x = (w - size) / 2;
            int y = (h - size) / 2;
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            switch (selectedShape) {
                case "Circle":
                    g2.setColor(Color.RED);
                    g2.fillOval(x, y, size, size);
                    break;
                case "Square":
                    g2.setColor(Color.BLUE);
                    g2.fillRect(x, y, size, size);
                    break;
                case "Triangle":
                    g2.setColor(Color.GREEN);
                    int[] xPoints = {w / 2, x, x + size};
                    int[] yPoints = {y, y + size, y + size};
                    g2.fillPolygon(xPoints, yPoints, 3);
                    break;
            }
        }
    }

    public Main() {
        setTitle("Shape Drawer Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Drawing area
        ShapeCanvas canvas = new ShapeCanvas();
        add(canvas, BorderLayout.CENTER);
        // Button panel
        JPanel controls = new JPanel();
        JButton btnCircle = new JButton("Circle");
        JButton btnSquare = new JButton("Square");
        JButton btnTriangle = new JButton("Triangle");
        controls.add(btnCircle);
        controls.add(btnSquare);
        controls.add(btnTriangle);
        add(controls, BorderLayout.SOUTH);
        // Button actions
        btnCircle.addActionListener(e -> {
            selectedShape = "Circle";
            canvas.repaint();
        });
        btnSquare.addActionListener(e -> {
            selectedShape = "Square";
            canvas.repaint();
        });
        btnTriangle.addActionListener(e -> {
            selectedShape = "Triangle";
            canvas.repaint();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}

