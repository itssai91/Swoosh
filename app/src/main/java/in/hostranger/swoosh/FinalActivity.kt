package `in`.hostranger.swoosh

import `in`.hostranger.swoosh.constants.LEAGUE_DATA
import `in`.hostranger.swoosh.constants.SKILL_DATA
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val league: String? = intent.getStringExtra(LEAGUE_DATA)
        val skill: String? = intent.getStringExtra(SKILL_DATA)

        textOutput.text = "Looking for a $league and skill type should be a $skill"
    }
}