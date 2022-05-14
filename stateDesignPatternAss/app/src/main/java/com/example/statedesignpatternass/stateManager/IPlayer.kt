package com.example.statedesignpatternass.stateManager

interface IPlayer {
    public fun setCurrentState ( state : IState)
    public fun setAmmonState (t:String)
    public fun setEnemyState (t:String)
    public fun setHealthState (t:String)



}