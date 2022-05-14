package com.example.statedesignpatternass.statesHolder

import android.util.Log
import com.example.statedesignpatternass.stateManager.AbstractState
import com.example.statedesignpatternass.stateManager.IPlayer

class Attack : AbstractState {
    lateinit var player : IPlayer
    constructor(player : IPlayer) : super(player){
        this.player = player
    }

    override fun playerApproaches() {
    }

    override fun playerRuns() {
        Log.d("stateMonetor" , "playerRuns()")
        player.setCurrentState(Patrol(player))
        Log.d("stateMonetor" , "Patrol...")
    }

    override fun playerNoHealth() {
        Log.d("stateMonetor" , "playerNoHealth()")
        player.setCurrentState(Deceased(player))
        Log.d("stateMonetor" , "Deceased...")
    }

    override fun playerLowAmmo() {
        Log.d("stateMonetor" , "playerLowAmmo()")
        player.setCurrentState(Reload(player))
        Log.d("stateMonetor" , "Reload...")
    }

    override fun playerFullAmmo() {
        Log.d("stateMonetor" , "playerFullAmmo()")
        player.setCurrentState(Attack(player))
        Log.d("stateMonetor" , "Attack...")
    }

    override fun playerLowHealth() {
        Log.d("stateMonetor" , "playerLowHealth()")
        player.setCurrentState(TakeOover(player))
        Log.d("stateMonetor" , "TakeOover...")
    }

    override fun playerFullHeath() {
    }
}