package com.example.statedesignpatternass.statesHolder
import android.util.Log
import com.example.statedesignpatternass.stateManager.AbstractState
import com.example.statedesignpatternass.stateManager.IPlayer

class Deceased : AbstractState {
    lateinit var player : IPlayer
    constructor(player : IPlayer) : super(player){
        this.player = player
    }

    override fun playerApproaches() {
    }

    override fun playerRuns() {
    }

    override fun playerNoHealth() {
        Log.d("stateMonetor" , "playerNoHealth()")
        player.setCurrentState(Deceased(player))
        Log.d("stateMonetor" , "Deceased...")
    }

    override fun playerLowAmmo() {
    }

    override fun playerFullAmmo() {
    }

    override fun playerLowHealth() {
    }

    override fun playerFullHeath() {
    }
}