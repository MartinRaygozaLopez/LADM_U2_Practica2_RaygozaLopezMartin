package com.example.ladm_u2_practica2_raygozalopezmartin

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p : MainActivity) : View(p) {
    var puntero = p

    var mercurio = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.mercurio), 200, 200, 8)
    var venus = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.venus), 750, 1000,7)
    var tierra = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.tierra), 150, 600, 6)
    var marte = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.marte), 100, 200, 7)
    var jupiter = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.jupiter), 500, 900, 2)
    var saturno = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.saturno), 900, 400,3)
    var urano = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.urano), 10, 1000, 4)
    var neptuno = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.neptuno), 10, 1000, 5)

    var fondo = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.starts), 0, 0, 0)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        fondo.pintar(canvas, paint)

        mercurio.pintar(canvas, paint)
        venus.pintar(canvas, paint)
        tierra.pintar(canvas, paint)
        marte.pintar(canvas, paint)
        jupiter.pintar(canvas, paint)
        saturno.pintar(canvas, paint)
        urano.pintar(canvas, paint)
        neptuno.pintar(canvas, paint)
    }

    fun animarBurbujas(){
        mercurio.rebote(width, height)
        venus.rebote(width, height)
        tierra.rebote(width, height)
        marte.rebote(width, height)
        jupiter.rebote(width, height)
        saturno.rebote(width, height)
        urano.rebote(width, height)
        neptuno.rebote(width, height)
        invalidate()
    }
}