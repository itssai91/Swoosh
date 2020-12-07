package `in`.hostranger.swoosh

import `in`.hostranger.swoosh.constants.LEAGUE_DATA
import `in`.hostranger.swoosh.constants.LEAGUE_DATA
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desired_league.*

class DesiredLeague : AppCompatActivity() {

    private var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired_league)
    }

    fun onMen(view: View) {
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "Men"
    }

    fun onCoed(view: View) {
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        selectedLeague = "Co-Ed"
    }

    fun onWomen(view: View) {
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "Women"
    }

    fun desiredLeagueBtn(view: View) {
        if (selectedLeague != "") {
            val skillactivity = Intent(this, SkillActivity::class.java)
            skillactivity.putExtra(LEAGUE_DATA, selectedLeague)
            startActivity(skillactivity)
        } else {
            Toast.makeText(this, "Please Select a League From Above Options", Toast.LENGTH_SHORT).show()
        }
    }
}