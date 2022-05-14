package com.example.statedesignpatternass.statesHolder

import android.util.Log
import com.example.statedesignpatternass.stateManager.IPlayer
import com.example.statedesignpatternass.stateManager.AbstractState

class Patrol : AbstractState {
    lateinit var player : IPlayer
    constructor(player : IPlayer) : super(player){
        this.player = player
    }

    override fun playerApproaches() {
        Log.d("stateMonetor" , "playerApproaches()")
        player.setCurrentState(Attack(player))
        Log.d("stateMonetor" , "Attack...")
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