package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

class JTableButtonRenderer implements TableCellRenderer {
	private TableCellRenderer __defaultRenderer;
	public JTableButtonRenderer(TableCellRenderer renderer) {
		__defaultRenderer = renderer;
	}
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if (value instanceof Component)
			return (Component) value;
		return __defaultRenderer.getTableCellRendererComponent(table, value,
				isSelected, hasFocus, row, column);
	}
}
 
class JTableButtonModel extends AbstractTableModel {
    public Object[][] __rows = { { "","","", new JButton("确认"),new JButton("更换")  },
		 { "","","",new JButton("确认"),new JButton("更换")  },
		 { "","","", new JButton("确认"),new JButton("更换")  },
		 { "","","",new JButton("确认"),new JButton("更换")  } };
    private String[] __columns = { "身份","姓名","编号","" ,"" };
    public String getColumnName(int column) {
    	return __columns[column];
    }
    public int getRowCount() {
    	return __rows.length;
    }
 public int getColumnCount() {
	 return __columns.length;
 }
 public Object getValueAt(int row, int column) {
	 return __rows[row][column];
 }
 public boolean isCellEditable(int row, int column) {
	 return false;
 }
 public Class getColumnClass(int column) {
	 return getValueAt(0, column).getClass();
 }
}
class JTableButtonModel1 extends JTableButtonModel{
	public Object[][] __rows = { { "运动员","","", new JButton("打分"),new JButton("查看")  },
			 { "","","",new JButton("打分"),new JButton("查看")  },
			 { "","","", new JButton("打分"),new JButton("查看")  },
			 { "","","",new JButton("打分"),new JButton("查看")  } };
	private String[] __columns = { "身份","姓名","编号","" ,"" };
	public String getColumnName(int column) {
		return __columns[column];
	}
	public int getRowCount() {
	   return __rows.length;
	  }
	 public int getColumnCount() {
	 return __columns.length;
	 }
	 public Object getValueAt(int row, int column) {
	 return __rows[row][column];
	 }
	 public boolean isCellEditable(int row, int column) {
	  return false;
	 }
	 public Class getColumnClass(int column) {
	  return getValueAt(0, column).getClass();
	 }
}
class JTableButtonMouseListener implements MouseListener {
 private JTable __table;
 private void __forwardEventToButton(MouseEvent e) {
  TableColumnModel columnModel = __table.getColumnModel();
  int column = columnModel.getColumnIndexAtX(e.getX());
  int row = e.getY() / __table.getRowHeight();
  Object value;
  JButton button;
  MouseEvent buttonEvent;
  if (row >= __table.getRowCount() || row < 0
 || column >= __table.getColumnCount() || column < 0)
 return;
  value = __table.getValueAt(row, column);
  if (!(value instanceof JButton))
  return;
  button = (JButton) value;
  buttonEvent = (MouseEvent) SwingUtilities.convertMouseEvent(__table, e,
  button);
 button.dispatchEvent(buttonEvent);
  // This is necessary so that when a button is pressed and released
  // it gets rendered properly. Otherwise, the button may still appear
 // pressed down when it has been released.
 __table.repaint();
 }
 public JTableButtonMouseListener(JTable table) {
  __table = table;
 }
 public void mouseClicked(MouseEvent e) {
 __forwardEventToButton(e);
 }
 public void mouseEntered(MouseEvent e) {
 __forwardEventToButton(e);
 }
 public void mouseExited(MouseEvent e) {
 __forwardEventToButton(e);
 }
 public void mousePressed(MouseEvent e) {
 __forwardEventToButton(e);
 }
 public void mouseReleased(MouseEvent e) {
 __forwardEventToButton(e);
 }
}
