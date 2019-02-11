package co.com.bryan.example.hashtable;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Enumeration;
import java.util.Hashtable;

public class MainWindow implements ActionListener {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtEdad;
	private JTextField txtDocumento;
	private JButton btnRegistro;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton btnListado;
	
	Hashtable<String, PersonaVo> tablaPersonas = new Hashtable<String,PersonaVo>();
	
	/**
	 * Create the application.
	 */
	public MainWindow() {
		initComponents();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initComponents() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hash_Table");
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(this);
		btnRegistro.setBounds(10, 169, 89, 23);
		frame.getContentPane().add(btnRegistro);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(172, 169, 89, 23);
		btnBuscar.addActionListener(this);
		frame.getContentPane().add(btnBuscar);
		
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(312, 169, 89, 23);
		btnEliminar.addActionListener(this);
		frame.getContentPane().add(btnEliminar);
		
		
		btnListado = new JButton("Listado");
		btnListado.setBounds(172, 203, 89, 23);
		btnListado.addActionListener(this);
		frame.getContentPane().add(btnListado);
		
		
		JLabel lblTitulo = new JLabel("Registro Personas");
		lblTitulo.setEnabled(false);
		lblTitulo.setBounds(10, 26, 123, 14);
		frame.getContentPane().add(lblTitulo);
		
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setEnabled(false);
		lblDocumento.setBounds(10, 61, 68, 14);
		frame.getContentPane().add(lblDocumento);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setEnabled(false);
		lblNombre.setBounds(10, 86, 63, 14);
		frame.getContentPane().add(lblNombre);
		
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setEnabled(false);
		lblDireccion.setBounds(10, 111, 63, 14);
		frame.getContentPane().add(lblDireccion);
		
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setEnabled(false);
		lblEdad.setBounds(207, 61, 46, 14);
		frame.getContentPane().add(lblEdad);
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(83, 83, 86, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(83, 108, 86, 20);
		frame.getContentPane().add(txtDireccion);
		
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(247, 58, 86, 20);
		frame.getContentPane().add(txtEdad);
		
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(83, 58, 86, 20);
		frame.getContentPane().add(txtDocumento);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnRegistro)){
			registroPersona(tablaPersonas);
			limpiarFrm();
		}
		
		if (e.getSource().equals(btnBuscar)) {
			consultarPersona(tablaPersonas);
			
		}
		if (e.getSource().equals(btnEliminar)) {
			eliminarPersona(tablaPersonas);
			
		}
		if (e.getSource().equals(btnListado)) {
			//impriimir por pantalla los valores del hash table
			listTable(tablaPersonas);	
		}
			
	}
	
	
	private void eliminarPersona(Hashtable<String, PersonaVo> tbPersonas) {
		String id_Delete = JOptionPane.showInputDialog("Ingrese el Documento a eliminar");
		
		int resp = (Integer)JOptionPane.showConfirmDialog(
				null, "Desea eliminar el Documento: "+id_Delete+"?","ALERTA", JOptionPane.YES_NO_OPTION);
		
		// SI ==0  NO == 1
		
		if (resp == 0) {
			if (tbPersonas.containsKey(id_Delete) == true) {
				// remuevo del hashtable ese objeto de valores almacenados
				//entonces si la tabla persona no contiene la key id_delete Es porque se 
				// elimino sastifactoriamente
				//@ return null if the key not exist
				//or null if the key did not have a mapping
				tbPersonas.remove(id_Delete);		
			}else{
				JOptionPane.showMessageDialog(null, "Estas intentando eliminar un documento el cual no existe");
			}
		}
	}

	
	private void consultarPersona(Hashtable<String, PersonaVo> tbPersonas) {
		
		String info = "Inforacion de la persona";
		// pedir el id a consultar
		
		String idDcocument = JOptionPane.showInputDialog("Ingrese ID a Consultar");
		
		if (tbPersonas.containsKey(idDcocument)) {
			//objeto que esta en el hashTable mediante key
			PersonaVo pvo = tbPersonas.get(idDcocument);
			info += "Documento: "+pvo.getDocumento()+"\n";
			info += "Nombre: "+pvo.getNombre()+"\n";
			info += "Direccion: "+pvo.getDireccion()+"\n";
			info += "Edad: "+pvo.getEdad()+"\n";
			
			JOptionPane.showMessageDialog(null, info);
		}else{
			JOptionPane.showMessageDialog(null, "No existe el documento ","Error",2);
		}
	}

	//reset form
	private void limpiarFrm() {
		// TODO Auto-generated method stub
		txtNombre.setText(null);
		txtDireccion.setText(null);
		txtDocumento.setText(null);
		txtEdad.setText(null);
		
	}

	
	private void registroPersona(Hashtable<String, PersonaVo> tbPersonas) {
		
		PersonaVo pvo = new PersonaVo();
		pvo.setNombre(txtNombre.getText().trim());
		pvo.setDocumento(txtDocumento.getText().trim());
		pvo.setDireccion(txtDireccion.getText().trim());
		pvo.setEdad(Integer.parseInt(txtEdad.getText()));
		
		// si la persona no esta registrada
		if (tbPersonas.containsKey(pvo.getDocumento())  == false ) {
			//refistrala
			tbPersonas.put(pvo.getDocumento(),pvo);
			System.out.println(tbPersonas);
			
		}else{
			JOptionPane.showMessageDialog(null, "Documento persona se encuentra registrado","Error",2);
			limpiarFrm();
		}
		
	}

	
	private void listTable(Hashtable<String, PersonaVo> tbPersonas){
		
		String total = "Listado de personas: \n";
		
		Enumeration<PersonaVo> enumeration = tbPersonas.elements();
		
		// hasta cuando no hayan mas elementos por mostrar para el ciclo
		while (enumeration.hasMoreElements()) {
			
			PersonaVo Ob = enumeration.nextElement();
			total += "Documento: "+Ob.getDocumento()+"\n";
			total += "Nombre: "+Ob.getNombre()+"\n";
			total += "Direccion: "+Ob.getDireccion()+"\n";
			total += "Edad: "+Ob.getEdad()+"\n";
			total += "************************ \n";
		}
		JOptionPane.showMessageDialog(null, total);
		
	}
	
}
