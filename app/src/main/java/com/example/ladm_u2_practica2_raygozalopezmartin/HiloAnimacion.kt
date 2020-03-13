package com.example.ladm_u2_practica2_raygozalopezmartin

class HiloAnimacion (p : MainActivity) : Thread() {
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread(){
                puntero.lienzo!!.animarBurbujas()
            }
        }
    }
}