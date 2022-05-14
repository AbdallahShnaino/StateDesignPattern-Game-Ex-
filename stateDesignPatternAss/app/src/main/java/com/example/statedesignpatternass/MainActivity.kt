package com.example.statedesignpatternass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.statedesignpatternass.stateManager.StatePlayer
import com.example.statedesignpatternass.statesHolder.Attack

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        var player = StatePlayer()
        btn.setOnClickListener {
            var ammon = findViewById<RadioGroup>(R.id.radioGroup3)
            var checkedAmmon = findViewById<RadioButton>(ammon.checkedRadioButtonId).text.toString()

            player.setAmmonState(checkedAmmon)

            var enemy = findViewById<RadioGroup>(R.id.radioGroup)
            var checkedEnemy = findViewById<RadioButton>(enemy.checkedRadioButtonId).text.toString()

            player.setEnemyState(checkedEnemy)

            var health = findViewById<RadioGroup>(R.id.radioGroup2)
            var checkedHealth = findViewById<RadioButton>(health.checkedRadioButtonId).text.toString()

            player.setHealthState(checkedHealth)






        }
    }
}