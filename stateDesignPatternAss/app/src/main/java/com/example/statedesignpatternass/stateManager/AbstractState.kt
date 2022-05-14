package com.example.statedesignpatternass.stateManager

abstract class AbstractState : IState {
    lateinit var palyer : IPlayer
    constructor( palyer : IPlayer){
        this.palyer = palyer
    }
}