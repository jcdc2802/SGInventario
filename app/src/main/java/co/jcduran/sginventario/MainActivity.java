package co.jcduran.sginventario;

import android.app.*;
import android.os.*;
import co.jcduran.sginventario.fragment.*;
import android.view.Window.*;

public class MainActivity extends Activity
{
	String strClave;
	
	Button btnUsuarios,btnClientes,btnProveedores,btnProductos;
	Button btnVentasGest,btnComprasGest,btnSesionGest;
	Button btnConsultas;
	String strEstado,strNivel;
	String strIdUsu,strNombreUsu;
	String strClave;
	
    	@Override
    	protected void onCreate(Bundle savedInstanceState)
    	{
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.main);
		
		//setContentView(R.layout.inicio_fragment);
	 }
	
	
}
