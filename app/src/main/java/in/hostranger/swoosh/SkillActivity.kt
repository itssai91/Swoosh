package `in`.hostranger.swoosh

import `in`.hostranger.swoosh.constants.LEAGUE_DATA
import `in`.hostranger.swoosh.constants.SKILL_DATA
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

     private var league = ""
     private var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(LEAGUE_DATA).toString()
    }

    fun beginnerBtn(view: View) {
        ballerbtn.isChecked = false
        skill = "Beginner"
    }

    fun ballerButton(view: View) {
        beginnerbtn.isChecked = false
        skill = "Baller"
    }

    fun skillButton(view: View){
        if(skill != ""){
            val finalactivity = Intent(this, FinalActivity::class.java)
            finalactivity.putExtra(LEAGUE_DATA, league)
            finalactivity.putExtra(SKILL_DATA, skill)
            startActivity(finalactivity)
        }else{
            Toast.makeText(this, "Please Choose One of Above Skill", Toast.LENGTH_SHORT).show()
        }
    }
}