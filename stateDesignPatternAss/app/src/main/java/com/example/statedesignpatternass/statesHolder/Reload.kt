package com.example.statedesignpatternass.statesHolder

import android.util.Log
import com.example.statedesignpatternass.stateManager.IPlayer
import com.example.statedesignpatternass.stateManager.AbstractState

class Reload : AbstractState {
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
        Log.d("stateMonetor" , "playerFullAmmo()")
        player.setCurrentState(Attack(player))
        Log.d("stateMonetor" , "Attack...")
    }

    override fun playerLowHealth() {
    }

    override fun playerFullHeath() {
    }
}