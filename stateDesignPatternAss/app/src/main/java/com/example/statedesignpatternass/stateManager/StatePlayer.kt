package com.example.statedesignpatternass.stateManager

import com.example.statedesignpatternass.statesHolder.Patrol

class StatePlayer : IPlayer{
    lateinit var player : IState
    constructor(){
        this.setCurrentState( Patrol(this) )
    }

    override fun setCurrentState(state: IState) {
        this.player = state
    }

    override fun setAmmonState(t: String) {
        if ( t == "Full"){
            player.playerFullAmmo()
        }
        if ( t == "Low"){
            player.playerLowAmmo()
        }
    }

    override fun setEnemyState(t: String) {
        if (t == "Player Approaches") {
            player.playerApproaches()
        }
        if (t == "Player Runs") {
            player.playerRuns()
        }
    }

    override fun setHealthState(t: String) {
        if (t == "Full") {
            player.playerFullHeath()

        }
        if (t == "Low") {
            player.playerLowHealth()

        }
        if (t == "No") {
            player.playerNoHealth()

        }
    }


}