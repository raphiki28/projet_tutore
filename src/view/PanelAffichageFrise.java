package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import model.Chronologie;
import model.Frise;

public class PanelAffichageFrise extends JPanel {
	JTable tableFrise;

	public PanelAffichageFrise(Chronologie frise) {
		tableFrise = new JTable();
		tableFrise.setModel(new Frise(frise));
		
		tableFrise.getTableHeader().setBackground(new Color(202, 229, 86));
		tableFrise.getTableHeader().setResizingAllowed(false);
		tableFrise.getTableHeader().setReorderingAllowed(false);
		
		tableFrise.setRowHeight(60);
		int longueurFrise = frise.getAnneeFin() - frise.getAnneeDebut();
		for (int i=0 ; i<longueurFrise ; i++)
			tableFrise.getColumnModel().getColumn(i).setPreferredWidth(150);
		tableFrise.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane scrollBar = new JScrollPane(tableFrise, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollBar.setPreferredSize(new Dimension(850,500));
		
		tableFrise.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent evt) {
				JTable table = (JTable) evt.getSource();
				Frise model = (Frise) table.getModel();
				Point pt = evt.getPoint();
				int rowIndex = table.rowAtPoint(pt);
				int colIndex = table.columnAtPoint(pt);
				if (colIndex == 4) {
					JOptionPane.showMessageDialog(table, model.getValueAt(rowIndex, colIndex));
				}
			}
		});
	}
}
