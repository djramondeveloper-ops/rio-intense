package br.com.seoulstudio.riointense
import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.*
class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val layout = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(36,64,36,24); setBackgroundColor(Color.rgb(15,17,24)) }
  fun heading(s:String, size:Float) = TextView(this).apply { text=s; textSize=size; setTextColor(Color.WHITE); setPadding(0,0,0,22); layout.addView(this) }
  heading("RIO INTENSE", 32f)
  heading("Descubra o Rio de Janeiro", 20f)
  heading("Explore experiências, eventos e lugares da cidade.", 16f)
  listOf("🔥 Em alta", "🎉 Eventos", "🍽 Gastronomia", "🌊 Praias", "📍 Lugares").forEach { name ->
   layout.addView(Button(this).apply { text=name; setOnClickListener { Toast.makeText(this@MainActivity, "$name: conteúdo em preparação", Toast.LENGTH_SHORT).show() } })
  }
  setContentView(ScrollView(this).apply { addView(layout) })
 }
}