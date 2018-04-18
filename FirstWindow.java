package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField column1Field;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JLabel lblColumn;
	private JTextField column2Field;
	private JTextField databaseField;
	private JLabel lblDatebase;
	private JSeparator separator_1;
	private JLabel lblWhere;
	private JLabel lblOrderBy;
	private JLabel lblColumn_1;
	private JTextField whereField1;
	private JLabel lblIsEqualTo;
	private JTextField whereField2;
	private JLabel label;
	private JTextField orderField;
	private JTextPane outputField;
	private JLabel lblTable;
	private JTextField tableField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		column1Field = new JTextField();
		column1Field.setBounds(85, 36, 86, 20);
		contentPane.add(column1Field);
		column1Field.setColumns(10);
		
		JLabel lblSelect = new JLabel("Column 1");
		lblSelect.setBounds(20, 39, 64, 14);
		contentPane.add(lblSelect);
		
		separator = new JSeparator();
		separator.setBounds(10, 69, 762, 20);
		contentPane.add(separator);
		
		lblNewLabel = new JLabel("SELECT.....");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 74, 14);
		contentPane.add(lblNewLabel);
		
		lblColumn = new JLabel("Column 2");
		lblColumn.setBounds(219, 39, 74, 14);
		contentPane.add(lblColumn);
		
		column2Field = new JTextField();
		column2Field.setColumns(10);
		column2Field.setBounds(289, 36, 86, 20);
		contentPane.add(column2Field);
		
		databaseField = new JTextField();
		databaseField.setColumns(10);
		databaseField.setBounds(472, 36, 86, 20);
		contentPane.add(databaseField);
		
		lblDatebase = new JLabel("Datebase");
		lblDatebase.setBounds(405, 39, 64, 14);
		contentPane.add(lblDatebase);
		
		lblTable = new JLabel("Table");
		lblTable.setBounds(600, 39, 36, 14);
		contentPane.add(lblTable);
		
		tableField = new JTextField();
		tableField.setColumns(10);
		tableField.setBounds(641, 36, 86, 20);
		contentPane.add(tableField);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 146, 762, 20);
		contentPane.add(separator_1);
		
		lblWhere = new JLabel("WHERE.....");
		lblWhere.setFont(new Font("Arial", Font.BOLD, 14));
		lblWhere.setBounds(10, 85, 74, 14);
		contentPane.add(lblWhere);
		
		lblOrderBy = new JLabel("ORDER BY.....");
		lblOrderBy.setFont(new Font("Arial", Font.BOLD, 14));
		lblOrderBy.setBounds(10, 162, 94, 14);
		contentPane.add(lblOrderBy);
		
		lblColumn_1 = new JLabel("Column");
		lblColumn_1.setBounds(31, 113, 44, 14);
		contentPane.add(lblColumn_1);
		
		whereField1 = new JTextField();
		whereField1.setColumns(10);
		whereField1.setBounds(85, 110, 86, 20);
		contentPane.add(whereField1);
		
		lblIsEqualTo = new JLabel("is equal to");
		lblIsEqualTo.setBounds(221, 110, 55, 14);
		contentPane.add(lblIsEqualTo);
		
		whereField2 = new JTextField();
		whereField2.setColumns(10);
		whereField2.setBounds(289, 107, 86, 20);
		contentPane.add(whereField2);
		
		label = new JLabel("Column");
		label.setBounds(31, 190, 44, 14);
		contentPane.add(label);
		
		orderField = new JTextField();
		orderField.setColumns(10);
		orderField.setBounds(85, 187, 86, 20);
		contentPane.add(orderField);
		
		
		
		//fetching all of the information from the text fields. Placed AFTER all of the text fields, never before them
//		String column1input = column1Field.getText();
//		String column2input = column2Field.getText();
//		String databaseInput = databaseField.getText();
//		String tableInput = tableField.getText();
//		String whereField1Input = whereField1.getText();
//		String whereField2Input = whereField2.getText();
//		String orderFieldInput = orderField.getText();
		
		//create a variable selectClause that will generate a full select Query
		

		
		JButton btnExecute = new JButton("Execute");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String column1input = column1Field.getText(); //also, duplicity in the select clause...
				String column2input = column2Field.getText();
				String databaseInput = databaseField.getText();
				String tableInput = tableField.getText();
				String whereField1Input = whereField1.getText();
				String whereField2Input = whereField2.getText();
				String orderFieldInput = orderField.getText();
				
				String selectClause = "SELECT " + "[" + column1Field.getText() + "]" + ", " + "[" + column2input + "]" + "FROM " 
						+ "[" + databaseInput + "]" + "." + "[" + tableInput + "];";
				
				outputField.setText(selectClause); //set our output box to the calculate selectClause
				
			}
		});
		btnExecute.setBounds(10, 229, 89, 23);
		contentPane.add(btnExecute);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				databaseField.setText("");
				whereField1.setText("");
				whereField2.setText("");
				orderField.setText("");
				column1Field.setText("");
				column2Field.setText("");
				outputField.setText(""); //issue here
			}
		});
		
		

		
		
		
		
		btnReset.setBounds(109, 229, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(244, 190, 46, 14);
		contentPane.add(lblOutput);
		
		outputField = new JTextPane();
		outputField.setBounds(257, 216, 515, 249);
		contentPane.add(outputField);
		

	}
}
