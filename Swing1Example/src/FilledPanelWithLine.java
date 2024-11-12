import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FilledPanelWithLine extends JPanel {
    public FilledPanelWithLine(int nBorder, int wBorder, int sBorder,
                               int eBorder, Color borderColor, Color fillColor)
    {
        this.setLayout(new BorderLayout());

        Border outerPadding = BorderFactory.createEmptyBorder(10,10,10,10);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackline);
        // need another panel for the inner border
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(borderColor);
        // empty border is padding
        Border emptyBorder = BorderFactory.createEmptyBorder(nBorder,wBorder,sBorder,eBorder);
        mainPanel.setBorder(emptyBorder);
        JPanel innerPanel = new JPanel();
        innerPanel.setBackground(fillColor);
        mainPanel.add(innerPanel);
        this.add(mainPanel);// attach new panel to container
    }}