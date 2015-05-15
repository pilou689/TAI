import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

class VerticalMenuBar extends JMenuBar {
	  private static final LayoutManager grid = new GridLayout(0,1);
	  public VerticalMenuBar() {
	    setLayout(grid);
	  }
}

public class GRobots extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GRobots frame = new GRobots();
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
	public GRobots() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new VerticalMenuBar();
		menuBar.setBounds(10, 10, 120, 244);
		contentPane.add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Utilisateur");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Gestion Robots");
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Planning");
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Gestion Users");
		menuBar.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Historique");
		menuBar.add(mntmNewMenuItem_4);
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(160, 10, 530, 250);
		contentPane.add(tabbedPane);
		
		JPanel Acceuil = new JPanel();
		tabbedPane.addTab("<html><body leftmargin=30 topmargin=15 marginwidth=10 marginheight=6>Acceuil</body></html>", null, Acceuil, null);
		Acceuil.setLayout(null);
		
		JButton connexion = new JButton("Connexion");
		connexion.setBounds(220, 160, 90, 30);
		Acceuil.add(connexion);
		
		JButton mdpforget = new JButton("Mot de passe oubli\u00E9");
		mdpforget.setBounds(60, 160, 140, 30);
		Acceuil.add(mdpforget);
		
		JLabel lblLogin = new JLabel("login");
		lblLogin.setBounds(80, 72, 55, 16);
		Acceuil.add(lblLogin);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(80, 108, 55, 16);
		Acceuil.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(168, 66, 122, 28);
		Acceuil.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 102, 122, 28);
		Acceuil.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel GRobots = new JPanel();
		tabbedPane.addTab("<html><body leftmargin=30 topmargin=15 marginwidth=10 marginheight=8>Gestion Robots</body></html>", null, GRobots, null);
		GRobots.setLayout(null);
		
		JPanel Planning = new JPanel();
		tabbedPane.addTab("<html><body leftmargin=30 topmargin=15 marginwidth=10 marginheight=8>Planning</body></html>", null, Planning, null);
		Planning.setLayout(null);
		
		JPanel Entretien = new JPanel();
		tabbedPane.addTab("<html><body leftmargin=30 topmargin=15 marginwidth=10 marginheight=8>Fiches d'entretien</body></html>", null, Entretien, null);
		Entretien.setLayout(null);
		
		JPanel Configuration = new JPanel();
		tabbedPane.addTab("<html><body leftmargin=30 topmargin=15 marginwidth=10 marginheight=8>Configuration</body></html>", null, Configuration, null);
		Configuration.setLayout(null);
		
		JPanel Historique = new JPanel();
		tabbedPane.addTab("<html><body leftmargin=30 topmargin=15 marginwidth=10 marginheight=8>Historique</body></html>", null, Historique, null);
		Historique.setLayout(null);
	}
}
