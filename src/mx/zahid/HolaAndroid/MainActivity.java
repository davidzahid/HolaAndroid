package mx.zahid.HolaAndroid;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;

import android.widget.LinearLayout;

import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//APLICACI�N DEL METODO FINDVIEWBYID()
		TextView textoPrueba = (TextView) findViewById(R.id.textoPrueba);
		//AGREGAR TEXTO A NUESTRO TEXTVIEW
		textoPrueba.setTextSize(20);
		textoPrueba.setText("He modificado TextView con un nuevo texto" + " usando java");
		//A�ADIR COLOR A NUESTRO TEXTVIEW
		textoPrueba.setTextColor(Color.argb(255, 255, 0, 0));
		
		//A�ADIR TEXTO ADICIONAL CON ADDVIEW
		//TextView tv= new TextView(this);
		//tv.setTextColor(Color.argb(255, 0, 0, 0));
		//tv.setTextSize(40);
		//A�ADIMOS TEXTO NUEVO
		//tv.setText("a�adiendo nuevo texto con addView");
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
		//layout.addView(tv);
		//HAREMOS UN METODO PRINT, EL METODO PRINT NOS SIMPLIFICARA CODIGO
		//YA QUE CADA VEZ QUE DESEEMOS IMPRIMIR UN TEXTO, LO UNICO QUE VAMOS A HACER
		//SER� MANDAR LLAMARLO Y ENVIAR NUESTROS PARAMETROS PARA �STE.iu
		//ESCRIBIENDO RESULTADOS DE OPERACIONES
		double a=2.25;
		double b=1.25;
		double c=a+b;
		/*//ESTA PARTE SER� COMENTADA POR EL MOMENTO
		print(layout, "Texto tama�o 18 rojo ", 18, 255, 0 , 0);
		print(layout, "Texto tama�o 24 verde ", 24, 0, 255 , 0);
		print(layout, "Texto tama�o 28 azul ", 28, 0, 0 , 255);
		print(layout, "Texto tama�o 32 amarillo ", 32, 255, 255 , 0);
		print(layout, "Texto tama�o 28 magenta ", 28, 255, 0 , 255);
		print(layout, "Texto tama�o 24 cyan ", 24, 0, 255 , 255);
		*/
		print(layout, "La suma de "+ a +" + "+ b + " es " + c, 18, 0, 0 , 255);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void print(LinearLayout layout, String texto, int tamano, int r, int g, int b){
		TextView tv=new TextView(this);
		tv.setTextColor(Color.argb(255, r, g, b));
		tv.setTextSize(tamano);
		tv.setText(texto);
		layout.addView(tv);
	}

}
