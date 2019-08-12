package cruds;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {

    private Component componente;

    public int posColpibot;
    public int posFilpibot;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (getPosFilpibot() == row) {
            componente.setBackground(Color.green);
            componente.setForeground(Color.white);
        } else {
            componente.setBackground(Color.WHITE);
            componente.setForeground(Color.black);
        }

        return componente;
    }

    public int getPosColpibot() {
        return posColpibot;
    }

    public void setPosColpibot(int posColpibot) {
        this.posColpibot = posColpibot;
    }

    public int getPosFilpibot() {
        return posFilpibot;
    }

    public void setPosFilpibot(int posFilpibot) {
        this.posFilpibot = posFilpibot;
    }

}
