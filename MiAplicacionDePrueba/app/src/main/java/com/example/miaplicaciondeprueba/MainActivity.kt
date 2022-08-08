package com.example.miaplicaciondeprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0;
    private var num2: Double = 0.0;
    private var operacion: Int = 0;



    companion object{
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICA= 3
        const val DIVIDIR = 4
        const val NO_OPERACION = 0

    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var boton1 = findViewById<Button>(R.id.unoBoton)
        var boton2 = findViewById<Button>(R.id.dosBoton)
        var boton3 = findViewById<Button>(R.id.tresBoton)
        var boton4 = findViewById<Button>(R.id.cuatroBoton)
        var boton5 = findViewById<Button>(R.id.cincoBoton)
        var boton6 = findViewById<Button>(R.id.seisBoton)
        var boton7 = findViewById<Button>(R.id.sieteBoton)
        var boton8 = findViewById<Button>(R.id.ochoBoton)
        var boton9 = findViewById<Button>(R.id.nueveBoton)
        var boton0 = findViewById<Button>(R.id.ceroBoton)
        var botonPunto = findViewById<Button>(R.id.puntoBoton)
        var textView = findViewById<TextView>(R.id.resultadoTexto)


        var botonSuma = findViewById<Button>(R.id.masBoton)
        var botonResta = findViewById<Button>(R.id.menosBoton)
        var botonMultiplicacion = findViewById<Button>(R.id.multiplicacacionBoton)
        var botonDividir = findViewById<Button>(R.id.dividirBoton)

        var botonBorrar = findViewById<Button>(R.id.borrarBoton)
        var esIgualBoton = findViewById<Button>(R.id.igualBoton)
        var puntoBoton = findViewById<Button>(R.id.puntoBoton)
        botonBorrar.setOnClickListener {
            num1 = 0.0
            num2 = 0.0
            textView.text = ""
            operacion = NO_OPERACION;
        }
        esIgualBoton.setOnClickListener {
            var resultado1 = when(operacion){
                SUMA -> num1 + num2
                RESTA -> num1 - num2
                MULTIPLICA -> num1 * num2
                DIVIDIR -> num1 / num2
                else -> 0
            }
            textView.text = resultado1.toString()
        }

        fun numeroPresionado(digitos:String){
            textView.text = "${textView.text}${digitos}"

            if(operacion == NO_OPERACION){num1 = textView.text.toString().toDouble()}

            else{
                num2 =  textView.text.toString().toDouble()
            }



        }

        fun operacionPresionado(operacion:Int){
            this.operacion = operacion;

            textView.text = ""
        }





        boton1.setOnClickListener {numeroPresionado("1")};
        boton2.setOnClickListener {numeroPresionado("2")};
        boton3.setOnClickListener {numeroPresionado("3")};
        boton4.setOnClickListener {numeroPresionado("4")};
        boton5.setOnClickListener {numeroPresionado("5")};
        boton6.setOnClickListener {numeroPresionado("6")};
        boton7.setOnClickListener {numeroPresionado("7")};
        boton8.setOnClickListener {numeroPresionado("8")};
        boton9.setOnClickListener {numeroPresionado("9")};
        boton0.setOnClickListener {numeroPresionado("0")};
        puntoBoton.setOnClickListener{numeroPresionado(".")}

        botonSuma.setOnClickListener {operacionPresionado(SUMA)}
        botonResta.setOnClickListener {operacionPresionado(RESTA)}
        botonMultiplicacion.setOnClickListener {operacionPresionado(MULTIPLICA)}
        botonDividir.setOnClickListener {operacionPresionado(DIVIDIR )}




    }


}
